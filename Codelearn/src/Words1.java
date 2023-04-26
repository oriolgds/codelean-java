import java.util.Scanner;
public class Words1 {
	private static String funar(String aFunar){
		aFunar = aFunar.trim();
		aFunar = aFunar.substring(0, aFunar.lastIndexOf(" "));
		return aFunar;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a phrase: ");
		String phrase = sc.nextLine();
		String result = funar(phrase);
		System.out.print("The given phrase after deleting the last word is " + result);
	}
}
