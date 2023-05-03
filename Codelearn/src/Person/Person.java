package Person;

public class Person {
    public String _name;
    public int _age;
    public String _IDCardNumber;
    public char _sex;
    private int _weight;
    private double _height;
    Person(){
        _name = "Oriol";
        _age = 15;
        _sex = 'M';
        _IDCardNumber = "000000000X";
        _weight = 65;
        _height = 1.80;
    }
    Person(String name, int age, char sex){
        _name = name;
        _age = age;
        _sex = sex;
        _IDCardNumber = "000000000X";
        _weight = 65;
        _height = 1.80;
    }
    Person(String name, int age, char sex, String IDCardNumber, int weight, int height){
        _name = name;
        _age = age;
        _sex = sex;
        _IDCardNumber = IDCardNumber;
        _weight = weight;
        _height = height;
    }
    int icmCalcul(){
        double icm = _weight / _height * _height;
        if(icm <= 16){
            return -1;
        } else if(icm > 16 && icm <= 16.99){
            return 1;
        } else if(icm > 16.99 && icm <= 18.49){
            return 2;
        } else if(icm > 18.49 && icm <= 24.99){
            return 3;
        } else if(icm > 24.99 && icm <= 29.99){
            return 4;
        } else if (icm > 29.99 && icm <= 34.99){
            return 5;
        } else if (icm > 34.99 && icm <= 40){
            return 6;
        } else {
            return 7;
        }
    }
    void icmPrint(){
        System.out.println("ICM for person " + _name + " is " + icmCalcul());
    }
    void isAMan(){
        if(_sex == 'M'){
            System.out.println(_name + " is a man? Yes, he is");
        } else if(_sex == 'F'){
            System.out.println(_name + " is a man? No, she is not");
        }
        else {
            System.out.println(_name + " is a man? We do not know");
        }
    }
    private boolean isLegalAge(){
        if(_age >= 18){
            return true;
        }
        else {
            return false;
        }
    }
    public void isLegalAgeToString(){

    }
    private String sexToString(){
        if(_sex == 'M'){
            return "Male";
        } else if(_sex == 'F'){
            return "Female";
        } else {
            return "Unknown";
        }
    }
    public String toString(){
        System.out.println("""
        Person data:
        
        Name:\s""" + _name + """
        
        Age:\s""" + _age + """
        
        Sex:\s""" + sexToString() + """
        
        IDCard:\s""" + _IDCardNumber + """
        
        Weight:\s""" + _weight + """
        
        Height:\s""" + _height);
        return null;
    }
    public boolean checkSex(char sex){
        return sex == _sex;
    }
}
