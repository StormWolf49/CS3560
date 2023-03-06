import java.util.ArrayList;

public class Dog {
    private String breed;
    private String name;
    private ArrayList<Paw> paws = new ArrayList<>();

    public Dog() {
        breed = "";
        name = "";
        paws.add(new Paw(1, this));
        paws.add(new Paw(2, this));
        paws.add(new Paw(3, this));
        paws.add(new Paw(4, this));
    }
}
