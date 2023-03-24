public class Array7 {
	public static void main(String[] args) {
		int[][] array = new int[5][5];  // se crea una matriz de 5x5 enteros
    
    // se llena la matriz con la suma de las coordenadas n y m
    for (int n = 0; n < 5; n++) {
        for (int m = 0; m < 5; m++) {
            array[n][m] = n + m;
        }
    }
    
    // se muestra el contenido de la matriz
    for (int n = 0; n < 5; n++) {
        for (int m = 0; m < 5; m++) {
            System.out.println("Value of the position (" + n + ", " + m + "): " + array[n][m]);
        }
    }
	}
}