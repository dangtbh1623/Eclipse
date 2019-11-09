package Medium;





public class MediumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedienverwaltungArray mv = new MedienverwaltungArray();
		MedienverwaltungsCollection mvc = new MedienverwaltungsCollection();
		Medium a = new Audio("Dang a",2003,"Dang a",90);
		Medium b = new Audio("Dang b",2001,"Dang b",90);
		Medium c = new Audio("Dang c",2002,"Dang c",90);
		Medium d = new Bild("Bild d", 2012, "Dortmund d");
		Medium e = new Bild("Bild e", 2011, "Dortmund e");
		Medium f = new Bild("Bild f", 2013, "Dortmund f");
		
		mv.aufnehmen(a);
		mv.aufnehmen(d);
		mv.aufnehmen(c);
		mv.aufnehmen(b);
		mv.aufnehmen(f);
		mv.aufnehmen(e);
		
		mv.zeigeMedien();
		System.out.println(" " + mv.berechneErscheinungsjahr());
		if(mv.sucheNeuesMedium()!=null)
			mv.sucheNeuesMedium().druckeDaten();
		System.out.println("++++++++++++++++++++++++++++++++");
		
		mvc.aufnehme(a);
		mvc.aufnehme(d);
		mvc.aufnehme(c);
		mvc.aufnehme(b);
		mvc.aufnehme(f);
		
		
		mvc.zeigeMedien();
		System.out.println(" " + mvc.berechneErscheinungsjahr());
		if(mvc.sucheNeuesMedium()!=null)
			mv.sucheNeuesMedium().druckeDaten();
		System.out.println("++++++++++++++++++++++++++++++++");
		mvc.sortID();
		mvc.zeigeMedien();
		System.out.println("++++++++++++++++++++++++++++++++");
		mvc.sortJahr();
		Menu m = new Menu(mvc);
		m.start();
		
		
						

	}

}
