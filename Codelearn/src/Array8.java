import java.util.Scanner;
public class Array8 {
    public static int arrayMaxim(int[] n){
        int result = n[0];
        for (int i : n) {
            if(i > result){
                result = i;
            }
        }
        return result;
    }
    public static int arrayMinim(int[] n){
        int result = n[0];
        for (int i : n) {
            if(i < result){
                result = i;
            }
        }
        return result;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Insert an integer value: ");
            numbers[i] = sc.nextInt();
        }
        int min = arrayMinim(numbers);
        int max = arrayMaxim(numbers);
        System.out.println("The maximum value of the read sequence is " + max);
        System.out.println("The minimum value of the read sequence is " + min);
    }
}
