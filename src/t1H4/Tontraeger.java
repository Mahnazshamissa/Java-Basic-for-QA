package t1H4;

public abstract class Tontraeger {
    private String genre;
    private String interpret;
    private String albumtitel;
    private int jahr;
    private Song[] songs = new Song[20];

    public Tontraeger(String genre, String interpret, String albumtitel, int jahr) {
        this.genre = genre;
        this.interpret = interpret;
        this.albumtitel = albumtitel;
        this.jahr = jahr;
    }

    public int gesamteAbspielzeit() {
        int gesamt = 0;
        for(Song einS : songs) {
            if(einS != null) {
                gesamt += einS.getLaufzeit();
            }
        }
        return gesamt;
    }
    public int durchschnittlicheAbspielzeit() {
        int anzahl = 0;
        for(Song einS : songs) {
            if(einS != null) {
                anzahl ++;
            }
        }
        return gesamteAbspielzeit() / anzahl;
    }
    public void drucken() {
        System.out.println("\n" + this.getClass().getSimpleName());
        System.out.println("Genre: " + genre);
        System.out.println("Albumtitel: " + albumtitel);
        System.out.println("Interpret: " + interpret);
        System.out.println("Erscheinungsjah: " + jahr);
        System.out.println("Folgende Songs sind enthalten");
        for(Song einS : songs) {
            if(einS != null) {
                einS.drucken();
            }
        }
        System.out.println("Gesamte Abspielzeit " + gesamteAbspielzeit());
        System.out.println("Durchshnittliche Songdauer: " + durchschnittlicheAbspielzeit());
    }

    public boolean songAufnehmen(Song s) {
        for(int i = 0; i < songs.length; i++) {
            if(songs[i] == null){
                songs[i] = s;
                return true;
            }
        }
        return false;
    }

}
