import java.util.Scanner;

public class Vowels2 {
    private static int countVowels(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] texts = new String[10];
        int totalVowels = 0;

        for (int i = 0; i < texts.length; i++) {
            System.out.print("Insert a text: ");
            texts[i] = sc.nextLine();
        }

        for (String text : texts) {
            int vowels = countVowels(text);
            System.out.println("The number of vowels of the given text " + text + " is " + vowels);
            totalVowels += vowels;
        }

        System.out.println("The total number of vowels of the given texts is " + totalVowels);
    }
}
