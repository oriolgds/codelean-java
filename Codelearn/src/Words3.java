import java.util.Scanner;
public class Words3 {
    private static String removeWords(String in){
        if(in.indexOf(" ") == in.lastIndexOf(" ")){
            return in;
        }
        else {
           return in.substring(in.indexOf(" ") + 1, in.lastIndexOf(" ")); 
        }        
    }  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String[] array = new String[5];
		for(int i = 0; i < 5; i++){
            System.out.print("Insert a phrase " + i + ": ");
            array[i] = removeWords(sc.nextLine());
        }
        for(String s : array){
            System.out.println(s);
        }
	}
}
