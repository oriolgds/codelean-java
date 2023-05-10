package Employee;

public class Employee {
    private String _name;
    public String get_name() {
        return _name;
    }
    public void set_name(String _name) {
        this._name = _name;
    }
    private int _age;
    public void set_age(int _age) {
        this._age = _age;
    }
    public int get_age() {
        return _age;
    }
    private boolean _married;
    public boolean get_married(){
        return _married;
    }
    public void set_married(boolean _married) {
        this._married = _married;
    }
    private double _salary;
    public double get_salary() {
        return _salary;
    }
    public void set_salary(double _salary) {
        this._salary = _salary;
    }
    Employee(){}
    Employee(String name, int age, boolean married, double salary){
        super();
        _name = name;
        _age = age;
        _married = married;
        _salary = salary;
    }
    String classification(){
        if(this._age >= 0 && this._age <= 21){
            return "Beginer";
        }
        else if(this._age >= 22 && this._age <= 35){
            return "Intermediate";
        } else {
            return "Senior";
        }
    }
    void salaryRaise(double percent){
        this._salary = (100 + percent) * this._salary / 100;
    }
    public String toString(){
        System.out.println("Name: " + this._name);
        System.out.println("Age: " + this._age);
        System.out.println("Married?: " + this._married);
        System.out.println("Salary: " + this._salary);
        System.out.println("Classification: " + this.classification());
        return null;
    }
}
