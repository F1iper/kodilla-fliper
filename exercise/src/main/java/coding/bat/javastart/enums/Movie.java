package coding.bat.javastart.enums;

public class Movie {

    private String title;
    private MovieCategory category;

    public Movie(String title, MovieCategory movieCategory) {
        this.title = title;
        this.category = movieCategory;
    }

    public String getTitle() {
        return title;
    }

    public MovieCategory getMovieCategory() {
        return category;
    }
}