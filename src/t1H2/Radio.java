package t1H2;

public class Radio extends UGeraet{
    private boolean kurzwelle;

    public Radio(boolean st, String s, int l, boolean kw) {
        super(st, s, l);
        this.kurzwelle = kw;
    }

    @Override
    public void drucken () {
        super.drucken();
        System.out.println("Kurzwelle: " + (kurzwelle ? "ja" : "nein"));

    }
}
