package MitarbeiterVerwaltung;

public class Manager extends Mitarbeiter {
	private double festgehalt;
	private double umsatz;
	private double provision;
	
	public Manager(String name, double festgehalt, double umsatz, double provision) {
		super(name);
		this.festgehalt = festgehalt;
		this.umsatz = umsatz;
		this.provision = provision;
	}

	@Override
	public double berechneGehalt() {
		// TODO Auto-generated method stub
		return festgehalt+umsatz*provision;
	}
	
	

}
