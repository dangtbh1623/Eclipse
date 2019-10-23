package DuckerInterface;

public class Test {
	public static void druck(DruckerI drucke)
	{
		drucke.drucken("Druck test");
	}
	
	public static void faxen(FaxI fax)
	{
		fax.senden("Fax test");
	}

	public static void main(String[] args) {
		LaserDrucker ld = new LaserDrucker("Laser 12");
		Kombigeraet kg = new Kombigeraet("Kombi 34");
		Faxgeraet fg = new Faxgeraet("Fax 56");
		ld.drucken("Dockument");
		kg.drucken("Dokumentation");
		kg.senden("Fotos");
		fg.senden("Nummerfolge");
		druck(ld);
		druck(kg);
		
		
	}

}
