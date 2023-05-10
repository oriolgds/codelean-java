package Employee;

public class Programmer extends Employee {
    private int codeLinesPerHour;
    public int getCodeLinesPerHour() {
        return codeLinesPerHour;
    }
    public void setCodeLinesPerHour(int codeLinesPerHour) {
        this.codeLinesPerHour = codeLinesPerHour;
    }
    public String getPreferredLanguage() {
        return preferredLanguage;
    }
    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }
    private String preferredLanguage;
    Programmer(){}
    Programmer(String name, int age, boolean married, double salary, int codeLinesPerHour, String preferredLanguage){
        super(name, age, married, salary);
        this.codeLinesPerHour = codeLinesPerHour;
        this.preferredLanguage = preferredLanguage;
    }
    public String toString(){
        super.toString();
        System.out.println("Code Lines Per Hour: " + this.codeLinesPerHour);
        System.out.println("Preferred Language: " + this.preferredLanguage);
        return null;
    }

}
