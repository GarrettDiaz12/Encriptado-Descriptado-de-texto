package mvc;
public class MainEncryption {
	public static void main(String[] args) {
		Model m = new Model () ;
		View v = new View () ;
		controller c = new controller (m, v) ;
		c. arrancar () ; 		
}
}