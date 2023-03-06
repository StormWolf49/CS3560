import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<watch> watched = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void addWatch(watch watch) {
        watched.add(watch);
    }
}
