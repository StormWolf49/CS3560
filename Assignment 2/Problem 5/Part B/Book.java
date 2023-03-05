import java.util.ArrayList;

public class Book {
    private String name;
    private String author;
    private ArrayList<Course> courses = new ArrayList<>();

    public Book() {
        name = "";
        author = "";
    }

    public void addCourse(Course c) {
        courses.add(c);
    }
}
