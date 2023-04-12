import java.util.Scanner;

public class Vowels1 {
    public static void main(String[] args) {
        int total = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a text: ");
        String text = sc.nextLine();
        char[] array = text.toCharArray();
        for (char c : array) {
            for (char v : vowels) {
                if(c == v){
                    total++;
                    break;
                }
            }
        }
        System.out.println("The number of vowels of the given text is " + total);
    }
}
