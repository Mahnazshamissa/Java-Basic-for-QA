package t1H8;

public abstract class Person {

    private String name;
    private String addresse;
    private String telNum;
    private String emailId;

    public Person(String n, String ad, String t, String e) {
        this.name = n;
        this.addresse = ad;
        this.telNum = t;
        this.emailId = e;
    }

    /*
    public Person(String n, String ad, String t, String e) {
        super();   // in eclipse steht in Konstruktor immer super() aber in IntelliJ gibt es nicht mehr
        this.name = n;
        this.addresse = ad;
        this.telNum = t;
        this.emailId = e;
    }
    */

    public void drucken() {
        System.out.println("Name: " + name);
        System.out.println("Adresse: " + addresse);
        System.out.println("Telefon: " + telNum);
        System.out.println("Email: " + emailId);

    }
}
