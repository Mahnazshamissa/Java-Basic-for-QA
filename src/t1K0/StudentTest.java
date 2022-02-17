package t1K0;

public class StudentTest {
    public static void main(String[] args) {
        Student mm = new Student();
        mm.setName("Mah MusterFrau");
        mm.setMatrikelnummer("MM 1234567789");
        mm.setEmailIdr("mah@uni.ac.at");
        System.out.println("Name: " + mm.getName());
        System.out.println("Matrikelnummer: " + mm.getMatrikelnummer());
        System.out.println("Email Id: " + mm.getEmailId());
        Student ss = new Student();
        ss.setName("Shami MusterMädchen");
        ss.setMatrikelnummer("SS 1234567789");
        ss.setEmailIdr("shami@uni.ac.at");
        System.out.println("Name: " + ss.getName());
        System.out.println("Matrikelnummer: " + ss.getMatrikelnummer());
        System.out.println("Email Id: " + ss.getEmailId());
    }
}
