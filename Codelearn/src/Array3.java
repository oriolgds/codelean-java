import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Insert an integer number: ");
            numbers[i] = sc.nextInt();
        }
        int zcount = 0;
        int ncount = 0;   
        int pcount = 0; 
        for (int i : numbers) {
            // Count the zeros 
            if(i == 0){
                zcount++;
            } else if (i < 0) {
                ncount++;
            } else {
                pcount++;
            }
        }
        System.out.println("The total of zeros read is " + zcount);
        if(ncount == 0){
            System.out.println("Zero negative numbers read");
        }
        if(pcount == 0){
            System.out.println("Zero positive numbers read");
        }
        if(ncount != 0 && pcount != 0){
            int nsum = 0;
            int psum = 0;
            for (int i : numbers) {
                if(i < 0){
                    nsum += i;
                } else if (i > 0){
                    psum += i;
                }
            }
            float paverage = 0.0f;
            float naverage = 0.0f;
            paverage = psum / pcount;
            naverage = nsum / ncount;
            System.out.println("The average of the negative numbers read is " + (naverage - 0.5f));
            System.out.println("The average of the positive numbers read is " + (paverage + 0.5f));
        }
    }
}