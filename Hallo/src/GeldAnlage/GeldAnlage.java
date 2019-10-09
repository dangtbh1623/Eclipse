package GeldAnlage;

public class GeldAnlage {
//Attribute
	private double startkapital;
	private double zinssatz;
	
	public GeldAnlage(double startkapital, double zinssatz)
	{
		this.startkapital = startkapital;
		this.zinssatz = zinssatz;
	}
	
	public double getZinssatz() {
		return zinssatz;
	}
	
	public double getStartkapital() {
		return startkapital;
	}
	
	public double berechneEndkapital(int laufzeit)
	{
		double Endkapital = startkapital;
		for(int i=0;i<laufzeit;i++)
		{
			Endkapital = Endkapital*(1+(zinssatz/100)); 
		}
		return Endkapital;
	}
	
}
