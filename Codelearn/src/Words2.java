import java.util.Scanner;
public class Words2 {
	private static String funar(String aFunar){
		aFunar = aFunar.trim();
		int l = aFunar.length();
		aFunar = aFunar.substring(aFunar.indexOf(" ") + 1, l);
		return aFunar;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert a phrase: ");
		String phrase = sc.nextLine();
		String result = funar(phrase);
		System.out.print("The given phrase after deleting the first word is " + result);
	}
}
