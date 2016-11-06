public class TestStudent {

    public static void main (String[] args) {
        Student studi1 = new Student(1999);
        studi1.setName("Karla Karlsson");
        studi1.setNummer(12345);
        studi1.setGender(true);
        studi1.setFach(8);


        Student studi2 = new Student();
        studi2.setName("Pinco Pallino");
        studi2.setNummer(35479);

        Student studi3 = new Student("Cla Tschenett", 897435, 3, 1955, true);
        Student studi4 = new Student("Douchbag Jones", 96543, 4, 1978);
        studi4.setGender(true);

        System.out.println(studi1);
        System.out.println(studi2);
        System.out.println(studi3);
        System.out.println(studi4);
        System.out.println("\nTotal Studierende: " + Student.getZaehler());

    }
}
