package t1H4;

public class T1H4 {
    public static void main(String[] args) {
        Song s1 = new Song("Song1", 300);
        Song s2 = new Song("Song2", 250);
        Song s3 = new Song("Song3", 200);
        Song s4 = new Song("Song4", 150);
        Single single = new Single("GenreSingle", "InterpreSingle", "TitelSingle", 2020);
        single.songAufnehmen(s1);
        single.drucken();
        LP lp = new LP("GenreLP", "InterpretLP", "TitelLP", 2018);
        lp.songAufnehmen(s1);
        lp.songAufnehmen(s2);
        lp.drucken();
        CD cd = new CD("GenreCD", "InterpreCD", "TitelCD", 2019);
        cd.songAufnehmen(s4);
        cd.songAufnehmen(s3);
        cd.songAufnehmen(s2);
        cd.songAufnehmen(s1);
        cd.drucken();

    }

}
