import java.util.*;
public class Array5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		int[] arr3 = new int[10];
		// Collect the value first array
		for (int i = 0; i < arr1.length; i++) {
			System.out.print("Insert value for the first array: ");
			arr1[i] = sc.nextInt();
		}
		// Collect the value second array
		for (int i = 0; i < arr2.length; i++) {
			System.out.print("Insert value for the second array: ");
			arr2[i] = sc.nextInt();
		}
		int arr3P = 0;
		int i = 0;
		while (arr3P < arr3.length) {
			arr3[arr3P] = arr1[i];
			arr3[arr3P + 1] = arr2[i];
			arr3P += 2;
			i++;
		}
		// Show the array
		for (int in : arr3) {
			System.out.println(in);
		}
	}
}