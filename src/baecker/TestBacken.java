package baecker;

public class TestBacken {

    public static void main(String[] args) {

        Bäcker b1 = new Bäcker("Felzl", 3,4,5,6);

        Apfelkuchen ak1=new Apfelkuchen("Kuchen deluxe", 2, 1, 3, "Apfel");
        Apfelkuchen ak2=new Apfelkuchen("Schlemmerkuchen", 2, 1, 5032, "Apfel");
        Apfelkuchen ak3=new Apfelkuchen("Omis Kuchen", 0.5, 0.2, 5, "Apfel");
        Baguette bg1 = new Baguette("Französische Baguette", 2, 1.2, 400, 30);
        Baguette bg2 = new Baguette("Rustikale Baguette", 4, 2, 7, 25);
        Baguette bg3 = new Baguette("Sauerteig Baguette", 3, 1.5, 8, 90);
        VeganerKuchen vk1 = new VeganerKuchen("Birnenkuchen", 4, 2, 5, "Birne");
        VeganerKuchen vk2 = new VeganerKuchen("Ribiselkuchen", 4, 2, 5, "Ribisel");
        VeganerKuchen vk3 = new VeganerKuchen("Marillenkuchen", 4, 2, 5, "Marille");
        Bauernbrot bb1 = new Bauernbrot("Rustikales Brot", 3, 1.4, 20, true);
        Bauernbrot bb2 = new Bauernbrot("Gemischtes Brot", 2, 1, 25, false);
        Bauernbrot bb3 = new Bauernbrot("Würziges Brot", 5, 2.4, 30, false);

        b1.backen(bb1, bb2, bb3, bg1);
        b1.drucken();

        b1.verkaufen(bb1,bb2,bg1);
        b1.drucken();


    }
}
