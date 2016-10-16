public class Student {

    private String name;
    private int nummer;

    //Getter und Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int n) {
        int alteNummer = nummer;
        nummer = n;
        if (!validateNummer()) {
            nummer = alteNummer;
        }
    }

    //ValidateNumber
    public boolean validateNummer() {
        return (nummer > 1000 && nummer <= 99999 && nummer % 2 != 0);
    }

    @Override
    public String toString() {
        return name + " (" + nummer + ")";
    }

}
