package t1A3;

public class Hund {

    private String name;
    private int alter;

    public Hund(String n, int a) {
        name = n;
        alter = a;
    }

    public void bellen() {
        System.out.println(name + " bellt und ist " + alter + " Jahre alt.");
    }

}

