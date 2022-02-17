package t1H8;

public class Trainer extends Person{
    private double tagsatz;

    public Trainer(String n, String ad, String t, String e, double ts) {
        super(n, ad, t, e);
        tagsatz = ts;
    }

    public double getTagsatz() {
        return tagsatz;
    }


    public void setTagsatz(double tagsatz) {
        this.tagsatz = tagsatz;
    }


    @Override
    public void drucken() {
        super.drucken();
        System.out.println("Tagsatz: " + tagsatz);

    }
}
