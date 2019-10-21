package MitarbeiterVerwaltung;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbeiter einArbeiter = new Arbeiter("Dan", 12, 2, 1, 2);
		System.out.println(einArbeiter.berechneGehalt());
		Angestellter einAngastellter = new Angestellter("Phuon", 12, 1, 2);
		System.out.println(einAngastellter.berechneGehalt());
		Manager einManager = new Manager("Hong", 14, 2, 2);
		System.out.println(einManager.berechneGehalt());
		Geschaeftsfuehrer einGeschaeftsfuehrer = new Geschaeftsfuehrer("Chung", 14, 2, 2, 2);
		System.out.println(einGeschaeftsfuehrer.berechneGehalt());
		einManager = new Geschaeftsfuehrer("Chung", 14, 2, 2, 2);
		System.out.println(einManager.berechneGehalt());
		
	}

}
