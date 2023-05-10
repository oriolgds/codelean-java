package Employee;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Babar", 90, true, 1800);
        e.toString();
        Programmer p = new Programmer("Marrameow", 5, false, 1200, 1000, "Java");

        p.salaryRaise(25);
        p.toString();
    }
}
