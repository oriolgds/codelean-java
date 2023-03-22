import java.util.Scanner;
public class Array6 {
	public static float Average(int[] list){
		int sum = 0;
		int count = list.length;
		float result = 0.0f;
		for (int i : list) {
			sum+=i;
		}
		result = sum/count;
		return result;
	}
	public static int[] readArray(){
		int[] result = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Start reading array");
		for (int i = 0; i < result.length; i++) {
			System.out.print("Insert integer value: ");
			result[i] = sc.nextInt();
		}
		System.out.println("Finish reading array");
		return result;
	}
	public static void main(String[] args) {
		int[] arr1 = readArray();
		int[] arr2 = readArray();
		int[] arr3 = readArray();
		float v1 = 0.0f;
		v1 = Average(arr1);
		float v2 = 0.0f;
		v2 = Average(arr2);
		float v3 = 0.0f;
		v3 = Average(arr3);
		System.out.println("The average of the first array is " + v1);
		System.out.println("The average of the second array is " + v2);
		System.out.println("The average of the third array is " + v3);
	}
}
