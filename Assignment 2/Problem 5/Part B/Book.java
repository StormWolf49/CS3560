import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private ArrayList<watch> watched = new ArrayList<>();

    public Book() {
        name = "";
        author = "";
    }

    public void addWatch(watch watch) {
        watched.add(watch);
    }
}
