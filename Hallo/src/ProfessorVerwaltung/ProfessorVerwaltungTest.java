package ProfessorVerwaltung;

public class ProfessorVerwaltungTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Raum buero = new Raum('A', '1', "01");
		Raum andereBuero = new Raum('B', '2', "02");
		Professor dr = new Professor("Reichman", buero);
		dr.setPostfach(12);
		System.out.println(buero.toString());
		System.out.println(dr.toString());
		System.out.println(dr.getBuero().toString());
		System.out.println(buero.getBesitzer().toString());
		
	}

}
