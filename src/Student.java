public class Student {

    private String name;
    private int nummer;
    private static int zaehler = 0;
    private int fach;
    private int geburtsjahr;
    private boolean gender;

    //Konstanten
    public static final int MATHEMATIKSTUDIUM = 1;
    public static final int INFORMATIKSTUDIUM = 2;
    public static final int ARCHRITEKTURSTUDIUM = 3;
    public static final int WIRTSCHAFTLICHESSTDUDIUM = 4;
    public static final int BIOLOGIESTUDIUM = 5;
    public static final int GESCHICHTSSTUDIUM = 6;
    public static final int GERMANISTIKSTUDIUM = 7;
    public static final int POLITOLOGIESTUDIUM = 8;
    public static final int PHYSIKSTUDIUM = 9;
    public static final Student PHANTOM;

    public static final boolean MALE = true;
    public static final boolean FEMALE = false;

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

    public static int getZaehler() {
        return zaehler;
    }

    public int getFach() {
        return fach;
    }

    public void setFach(int fach) {
        this.fach = fach;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    //ValidateNumber
    public boolean validateNummer() {
        return (nummer > 1000 && nummer <= 99999 && nummer % 2 != 0);
    }

    @Override
    public String toString() {
        String res = name + " (" + nummer + ")\n";
        if (gender)
            res += " (m) ";
        else
            res += " (w) ";

        switch(fach) {
            case MATHEMATIKSTUDIUM:
                return res + " Ein Mathestudent" + "oder auch wezi, oder drei).";
            case INFORMATIKSTUDIUM:
                return res + " ein Informatikstudent.";
            case ARCHRITEKTURSTUDIUM:
                return res + " angehender Architekt.";
            case WIRTSCHAFTLICHESSTDUDIUM:
                return res + " ein Wirtschaftswissenschaftler.";
            case BIOLOGIESTUDIUM:
                return res + " Biologie ist seine Staerke";
            case GESCHICHTSSTUDIUM:
                return res + " sollte Geschichte nicht mit Geschichten verwechseln";
            case GERMANISTIKSTUDIUM:
                return res + " wird einmal Germanist gewesen tun sein.";
            case POLITOLOGIESTUDIUM:
                return res + " kommt bestimmt einmal in den Bundestag";
            case PHYSIKSTUDIUM:
                return res + " studiert schon relativ lange Physik";
            default:
                return res + "keine Ahnung, was der Mann studiert.";
        }
    }


    public static Student createStudent() {
       return new Student();
    }

    //Konstruktoren
    public Student() {
        this(1970);
    }

    public Student (int geburtsjahr) {
        zaehler++;
        this.geburtsjahr = geburtsjahr;
    }

    // Aufgabe 8.1
    public Student (String name, int nummer, int fach, int geburtsjahr) {
        this(geburtsjahr);
        this.name = name;
        this.fach = fach;
        this.nummer = nummer;
    }

    //Aufgabe 8.2
    public Student (String name, int nummer, int fach, int geburtsjahr, boolean gender) {
        this(name, nummer, fach, geburtsjahr);
            this.gender = gender;
        }




    /*  =========================
        STATISCHE INITIALISIERUNG
        =========================
     */
    static {
        PHANTOM = new Student(1975);
        PHANTOM.name = "Erik le Phant";
        PHANTOM.nummer = 12345;
        zaehler = 0;

    }

}
