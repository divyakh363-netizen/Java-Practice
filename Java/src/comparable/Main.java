package comparable;
import java.util.ArrayList;
import java.util.Collections;

class Player implements Comparable<Player> {
    String name;
    int runs;

    Player(String name, int runs) {
        this.name = name;
        this.runs = runs;
    }

    public int compareTo(Player p) {
        return Integer.compare(this.runs, p.runs);
    }

    public String toString() {
        return name + " " + runs;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> l = new ArrayList<>();

        l.add(new Player("Virat", 85));
        l.add(new Player("Rohit", 45));
        l.add(new Player("Dhoni", 70));
        l.add(new Player("Rahul", 30));

        Collections.sort(l);

        for (Player p : l) {
            System.out.println(p);
        }
    }
}
