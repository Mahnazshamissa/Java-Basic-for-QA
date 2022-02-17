package t1A2;

public class Spieler {

    private String name;

    public Spieler(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public int getNumber(){

        // Math . random : 0.0 und 0.99999
        return (int) (Math.random() * 10);
    }
}
