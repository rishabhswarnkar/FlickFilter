import com.google.gson.Gson;

/**
 * Created by swarn on 1/31/2017.
 */
/*
{
Data taken from MovieDB.com.

Sample data below.
"poster_path": "\/WLQN5aiQG8wc9SeKwixW7pAR8K.jpg",
    "adult": false,
    "overview": "The quiet life of a terrier named Max is upended when his owner takes in Duke, a stray whom Max instantly dislikes.",
    "release_date": "2016-06-18",
    "genre_ids": [12, 16, 35, 10751],
    "id": 328111,
    "original_title": "The Secret Life of Pets",
    "original_language": "en",
    "title": "The Secret Life of Pets",
    "backdrop_path": "\/lubzBMQLLmG88CLQ4F3TxZr2Q7N.jpg",
    "popularity": 271.747181,
    "vote_count": 1960,
    "video": false,
    "vote_average": 5.8
}
 */
public class Movie {

    //Each variable holds a particular value in order of how JSON is parsed
    //for the individual movies.
    private String poster_path;
    private boolean adult;
    private String overview;
    private String release_date;
    private int[] genre_ids;
    private int id;
    private String original_title;
    private String original_language;
    private String title;
    private String backdrop_path;
    private double popularity;
    private int vote_count;
    private boolean video;
    private double vote_average;

    //getters for the methods necessary per program specifications.
    public String getTitle() {
        return title;
    }

    public int[] getGenre_ids() {
        return genre_ids;
    }

    public double getVote_average() {
        return vote_average;
    }

    public double getPopularity() {
        return popularity;
    }
}
