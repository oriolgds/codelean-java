public class Words1 {
	private static String funar(String aFunar){
		aFunar = aFunar.trim();
		aFunar = aFunar.substring(0, aFunar.lastIndexOf(" ", 0));
		return aFunar;
	}
	public static void main(String[] args) {
		
	}
}
