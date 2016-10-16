public class TestStudent {

    public static void main (String[] args) {
        Student studi1 = new Student();
        studi1.setName("Karla Karlsson");
        studi1.setNummer(12345);

        Student studi2 = new Student();
        studi2.setName("Pinco Pallino");
        studi2.setNummer(35479);

        Student studi3 = new Student("Cla Tschenett", 897435, 3, 1955, true);

        System.out.println(Student.getZaehler());
        System.out.println(studi3);

    }
}
