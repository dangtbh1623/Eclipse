package mitArbeiter;

public class Angestellter extends Person {
	private double gehalt;
	public Angestellter(String name, double gehalt)
	{
		super(name);
		setGehalt(gehalt);
	}
	
	
	public double getGehalt() {
		return gehalt;
	}
	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}
	
	public double berechneJahreszahlung()
	{
		return 12*gehalt;
	}


	@Override
	public void druckeDaten() {
		System.out.println(getName() + " verdient: " + berechneJahreszahlung());
		// TODO Auto-generated method stub
		
	}

}
