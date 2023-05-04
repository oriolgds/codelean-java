package Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("John Doe", 0, 'U', "000000000X", 90.0, 1.5);
        p1.toString();
        Person p2 = new Person("Aragorn", 80, 'M', "000000000X", 90.0, 1.5);
        p2.toString();
        Person p3 = new Person("Arwen", 1500, 'F', "0123456789A", 55.0, 1.85);
        p3.toString();
        p1.icmPrint();
        p2.icmPrint();
        p3.icmPrint();
        p1.isAMan();
        p2.isAMan();
        p3.isAMan();
        p1.isLegalAgeToString();
        p2.isLegalAgeToString();
        p3.isLegalAgeToString();

    }
}
