package t1K0;

public class Student {
    private String name;
    private String matrikelnummer;
    private String emailId;

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String neuerName) {
        this.name = neuerName;
    }

    public String getMatrikelnummer() {
        return this.matrikelnummer;
    }

    public void setMatrikelnummer(String neuerMatrikelnummer) {
        this.matrikelnummer = neuerMatrikelnummer;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailIdr(String neuerEmailId) {
        this.emailId = neuerEmailId;
    }
}
