package t1H2;

public class UGeraet extends Geraet{

    private String sender;
    private int lautstaerke;

    public UGeraet(boolean st, String s, int l) {
        super(st);
        this.sender = s;
        this.lautstaerke = l;
    }
    public void setSender(String s) {
        this.sender = s;
    }
    public void setLautstaerke(int l) {
        this.lautstaerke = l;
    }
    public void drucken() {
        super.drucken();
        System.out.println("Sender: " + sender);
        System.out.println("Lautstärkre: " + lautstaerke);
    }

}
