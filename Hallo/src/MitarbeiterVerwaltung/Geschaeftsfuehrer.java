package MitarbeiterVerwaltung;

public class Geschaeftsfuehrer extends Manager {
	private double zulage;
	public Geschaeftsfuehrer(String name, double festgehalt, double umsatz, double provision, double zulage) {
		super(name, festgehalt, umsatz, provision);
		this.zulage = zulage;
	}
	
	public double berechneGehalt() {
		return super.berechneGehalt()+zulage;
	}
	

}
