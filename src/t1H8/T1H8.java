package t1H8;

public class T1H8 {

    public static void main(String[] args) {
        Kursteilnehmer kt1 = new Kursteilnehmer("Mah", "Gasse 1", "1234", "mah@test.at");
        Kursteilnehmer kt2 = new Kursteilnehmer("Shami", "Gasse 2", "5678", "shami@test.at");
        Kursteilnehmer kt3 = new Kursteilnehmer("Amin", "Gasse 3", "3696", "amin@test.at");
        Kursteilnehmer kt4 = new Kursteilnehmer("Far", "Gasse 4", "5994", "far@test.at");
        Kursteilnehmer kt5 = new Kursteilnehmer("Ali", "Gasse 5", "3269", "ali@test.at");
        Kursteilnehmer kt6 = new Kursteilnehmer("Mehri", "Gasse 6", "5717", "mehri@test.at");

        Trainer tr1 = new Trainer("DrBakhshi", "Tr_ad Str 1", "Tr_tel 4598", "bakhshi@test.at", 650);
        Trainer tr2 = new Trainer("DrShahim", "Tr_ad Str 2", "Tr_tel 9742", "shahim@test.at", 850);

        Schulung sch1 = new Schulung("Programmieren Java", 1250, 7);
        Schulung sch2 = new Schulung("Programmieren C#", 1250, 7);
        sch1.anmelden(kt1, kt2, kt3, kt4);
        sch1.setTrainer(tr1);
        sch2.anmelden(kt5, kt6);
        sch2.setTrainer(tr2);

        Schulungsunternehmen wifi = new Schulungsunternehmen();
        wifi.aufnehmen(sch1, sch2);
        wifi.drucken();
    }
}
