/**
 * Created by swarn on 1/31/2017.
 */

import com.google.gson.Gson;

import javax.xml.bind.SchemaOutputResolver;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Main {

    //String to hold JSON data, Gson object for parsing, and movieCollection to instantiate
    //Object containing parsed data.
    static Integer pageNo = new Integer(1);
    final static String urlString = "https://api.themoviedb.org/3/movie/popular?api_key=" +
            APIKeyFile.APIKey + "&page=";

    static Gson gson = new Gson();
    static MovieCollection movieCollection;

    //Main function

    public static void main(String args[]) throws Exception {
        HTTPGetter();
        String readArg;
        int numMovies = 0;
        int thirdParam;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter query type, or 'exit' to terminate program.");
            System.out.println("-------------------------------------------------");
            System.out.println("allMovies");
            System.out.println("byGenre");
            System.out.println("higherPopularity");
            System.out.println("higherVote");
            readArg = scanner.next();
            if (readArg.equals("exit")) {
                System.exit(0);
            }
            System.out.println("Enter number of movies.");
            numMovies = scanner.nextInt();
            if (readArg.toLowerCase().equals("allMovies")) {
                System.out.println(printMovieRequest(numMovies, readArg, 0));
            }
            else {
                System.out.println("Enter third parameter (genre id or threshold).");
                thirdParam = scanner.nextInt();
                System.out.println(printMovieRequest(numMovies, readArg, thirdParam));
                System.out.println();
            }
            System.out.println();
        } while (!readArg.equals("exit"));

        /*String str = "";
        Integer numMovies = Integer.valueOf(args[0]);
        String queryType = args[1];
        Integer numParam = 0;
        if (args.length > 2)
            numParam = Integer.valueOf(args[2]);

        if (queryType == "allMovies")
            str = allMovies(numMovies);
        else if (queryType == "byGenre")
            str = byGenre(numParam, numMovies);
        else if (queryType == "higherVote")
            str = higherVote(numParam, numMovies);
        else if (queryType == "higherPopularity")
            str = higherPopularity(numParam, numMovies);

        if (numMovies < 0)
            str = "Please enter a proper query.\n";

        if (numParam < 0)
            str = "Please enter a proper query.\n";

        System.out.println(str);*/
    }

    /**
     * FOR ALL METHODS, THE numMovies VARIABLE REFERS TO NUMBER OF MOVIES REQUESTED BY USER.
     */

    public static String printMovieRequest( int numMovies, String queryType , int thirdParam) throws Exception {
        if (queryType.equals("allMovies")) {
            return (allMovies(numMovies));
        }
        else {
            if (queryType.toLowerCase().equals("bygenre")) {
                return(byGenre(thirdParam, numMovies));
            }
            else if (queryType.toLowerCase().equals("higherpopularity")) {
                return(higherPopularity(thirdParam, numMovies));
            }
            else if (queryType.toLowerCase().equals("highervote")) {
                return(higherVote(thirdParam, numMovies));
            }
            else {
                return("Invalid query type.");
            }
        }
    }
    public static void HTTPGetter() throws Exception {
        URL url = new URL(urlString + pageNo.toString());
        URLConnection conn = url.openConnection();
        HttpURLConnection conn1 = (HttpURLConnection) url.openConnection();
        if(conn1.getResponseCode() != 200){
            //In a more expansive project, error handling would be added in.
            System.out.println("HTTP ERROR CODE: " + conn1.getResponseCode());
        }
        if(Integer.parseInt(conn.getHeaderField("X-RateLimit-Remaining")) <= 1){
            System.out.println("Rate limit reached: waiting 10 seconds.");
            try{Thread.sleep(10000);}catch(Exception e){}
        }
        InputStream inputStream = conn.getInputStream();
        BufferedReader streamReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder responseStrBuilder = new StringBuilder();

        String inputStr;
        while ((inputStr = streamReader.readLine()) != null)
            responseStrBuilder.append(inputStr);
        movieCollection = gson.fromJson(responseStrBuilder.toString(), MovieCollection.class);

    }


    /**
     * Prints out all movies' titles in the JSON data list.
     *
     * @return all movies' titles.
     */

    public static String allMovies(int numMovies) throws Exception {
        HTTPGetter();
        String str = "";
        if (numMovies <= 0) {
            pageNo = 1;
            return str;
        }
        if (numMovies <= movieCollection.getResults().size()) {
            for (int i = 0; i < numMovies; i++) {
                str += (movieCollection.getResults().get(i).getTitle()) + "\n";
            }
            pageNo = 1;
            return str;
        }
        else {
            for (Movie m : movieCollection.getResults()) {
                str += m.getTitle() + "\n";
            }
            pageNo++;
            return str + allMovies(numMovies - movieCollection.getResults().size());
        }
    }

    /**
     * Prints out all movies' titles in the JSON data list which have a particular genre.
     *
     * @param genre genre of movie
     * @return all movies' titles in the JSON data list which have a particular genre
     */

    public static String byGenre(int genre, int numMovies) throws Exception {

        HTTPGetter();
        String str = "";
        int count = 0;
        if (numMovies <= 0) {
            pageNo = 1;
            return str;
        }
        for (Movie m : movieCollection.getResults()) {
            for (int id : m.getGenre_ids()) {
                if (genre == id) {
                    str += m.getTitle() + "\n";
                    count++;
                }
            }
            if (count == numMovies) {
                break;
            }
        }
        if (count < numMovies) {
            pageNo++;
            return str + byGenre(genre, numMovies - count);
        }
        else {
            pageNo = 1;
            return str;
        }
    }

    /**
     * Prints out all movies' titles in the JSON data list which have a
     * higher average vote count than the threshold.
     *
     * @param threshold holds the threshold of votes
     * @return movies with vote average higher than threshold.
     */

    public static String higherVote(int threshold, int numMovies) throws Exception {
        HTTPGetter();
        String str = "";
        int count = 0;
        if (numMovies <= 0) {
            pageNo = 1;
            return str;
        }
        for (Movie m : movieCollection.getResults()) {
            if (m.getVote_average() >= threshold) {
                str += m.getTitle() + "\n";
                count++;
            }
            if (count == numMovies) {
                break;
            }
        }
        if (count < numMovies) {
            pageNo++;
            return str + higherVote(threshold, numMovies - count);
        }
        else {
            pageNo = 1;
            return str;
        }
    }

    /**
     * Prints out all movies' titles in the JSON data list which have a
     * higher popularity count than the threshold.
     *
     * @param popularity holds threshold for popularity of movies
     * @return movies which have a higher average popularity of movies
     * than given parameter.
     */

    public static String higherPopularity(int popularity, int numMovies) throws Exception {
        HTTPGetter();
        String str = "";
        int count = 0;
        if (numMovies <= 0) {
            pageNo = 1;
            return str;
        }
        for (Movie m : movieCollection.getResults()) {
            if (m.getPopularity() >= popularity) {
                str += m.getTitle() + "\n";
                count++;
            }
            if (count == numMovies) {
                break;
            }
        }
        if (count < numMovies) {
            pageNo++;
            return str + higherPopularity(popularity, numMovies - count);
        }
        else {
            pageNo = 1;
            return str;
        }
    }
}