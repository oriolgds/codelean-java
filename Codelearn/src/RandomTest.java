//package exercices.java;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] array = new int[3][3];
    
        // Llenar la matriz
        for (int n = 0; n < array.length; n++) {
            for (int m = 0; m < array[n].length; m++) {
                array[n][m] = (r.nextInt() * 100 - 1);
            }
        }
        // Mostrar los valores de la matriz
        for (int n = 0; n < array.length; n++) {
            for (int m = 0; m < array[n].length; m++) {
                System.out.print("Value of the position (" + n + ", " + m + "): " + array[n][m]);
            }
        } 
    }
       
}