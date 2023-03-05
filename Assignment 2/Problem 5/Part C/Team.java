import java.util.ArrayList;

public class Team {
    private Integer code;
    private ArrayList<Player> players = new ArrayList<>();

    public Team() {
        code = 0;
        players.add(new Player("", false, this));
    }
}
