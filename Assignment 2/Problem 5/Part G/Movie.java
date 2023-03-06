import java.util.ArrayList;

public class Movie {
    private String name;
    private String genre;
    private ArrayList<watch> watched = new ArrayList<>();

    public Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public void addWatch(watch watch) {
        watched.add(watch);
    }
}
