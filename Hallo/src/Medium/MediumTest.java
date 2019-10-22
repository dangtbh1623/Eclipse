package Medium;



public class MediumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medium[] m = new Medium[2];
		m[0] = new Bild("Bild", 1990, "Dortmund");
		m[1] = new Audio("Audio", 1994, "Dang Trinh", 90);
		m[0].druckeDaten();
		m[1].druckeDaten();
		m[0].alterAusgeben();
		m[1].alterAusgeben();
		
						

	}

}
