import java.util.Scanner;
public class Matrix {
    public static void maxMatrix(int[][] array){
        int result = array[0][0];
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                if(array[n][m] > result){
                    result = array[n][m];
                }
            }
        }
        System.out.println("The maximum value in the given matrix is " + result);
    }
    public static void minMatrix(int[][] array){
        int result = array[0][0];
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                if(array[n][m] < result){
                    result = array[n][m];
                }
            }
        }
        System.out.println("The minimum value in the given matrix is " + result);
    }
    public static void countMatrix(int[][] array, int b){
        int result = 0;
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                if(array[n][m] == b){
                    result++;
                }
            }
        }
        System.out.println("Zero appears " + result +" in the given matrix");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[][] array = new int[5][5];  // se crea una matriz de 5x5 enteros
    
        // se llena la matriz con la suma de las coordenadas n y m
        for (int n = 0; n < 5; n++) {
            for (int m = 0; m < 5; m++) {
                System.out.print("Insert integer value for position (" + n + ", " + m + "): ");
                array[n][m] = sc.nextInt();
            }
        }
        maxMatrix(array);
        minMatrix(array);
        countMatrix(array, 0);
	}
}