package mitArbeiter;

public class Manager extends Angestellter {
	private double bonus;
	public Manager(String name, double gehalt, double bonus)
	{
		super(name,gehalt);
		setBonus(bonus);
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double berechneJahreszahlung()
	{
		return super.berechneJahreszahlung() + bonus;
		
	}

}
