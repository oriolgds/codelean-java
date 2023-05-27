import java.util.Scanner;
public class Array4 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("Insert an integer number: ");
			numbers[i] = sc.nextInt();
		}
		int arrayLength = 9;
		for (int i = 0; i < 5; i++) {
			System.out.println(numbers[i]);
			System.out.println(numbers[arrayLength - i]);
		}
	}
}
