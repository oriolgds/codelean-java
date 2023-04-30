public class Person {
    public String _name;
    public int _age;
    Person(){
        _name = "John Doe";
        _age = 0;        
    }
    Person(String name, int age){
        _name = name;
        _age = age;
    }
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Aragorn Son of Arathorn", 80);
        System.out.println("Name of the first person: " + p1._name);
        System.out.println("Age of the first person: " + p1._age);
        System.out.println("Name of the second person: " + p2._name);
        System.out.println("Age of the second person: " + p2._age);
    }
}