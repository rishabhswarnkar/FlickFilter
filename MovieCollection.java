
import java.util.ArrayList;


/**
 * Created by swarn on 1/31/2017.
 */
public class MovieCollection {

    //Each variable holds a particular value in order of how JSON is parsed
    //for the movie set as a whole.
    private int page;
    private ArrayList<Movie> results;
    private int total_pages;
    private int total_results;

    //getters for the methods necessary per program specifications.


    public int getPage() {
        return page;
    }

    public ArrayList<Movie> getResults() {
        return results;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public int getTotal_results() {
        return total_results;
    }

}


