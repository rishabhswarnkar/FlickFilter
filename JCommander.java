import com.beust.jcommander.Parameter;
/*
Imported from Cedric Beust's platform JCommander (located at jcommander.org).
 */
public class JCommander {

    @Parameter(names = "-numMovies", description = "Number of movies to pull")
    private Integer numMovies;

    @Parameter(names = "-queryType", description = "Method to call")
    private String method;

    @Parameter(names = "-queryParam", description = "Parameter for method called")
    private Integer threshold;
}