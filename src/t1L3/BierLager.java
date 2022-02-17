package t1L3;

public class BierLager {
    private int lagerstand;

    public BierLager(int lagerstand) {
        this.lagerstand = lagerstand;
    }

    public boolean isEmpty(){
        if(lagerstand == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public int getLagerstand() {
        return lagerstand;
    }

    public boolean kaufen (int anzahl){
        if (lagerstand >= anzahl){
            lagerstand -= anzahl;
            return true;
        }
        else {
            return false;
        }
    }
}
