package Bruch;

public class Bruch {
	//Attribute
	private int zaehler;
	private int nenner;
	
	public Bruch(int zaehler)
	{
		this.zaehler = zaehler;
		this.nenner = 1;
	}
	
	public Bruch(int zaehler, int nenner)
	{
		this.zaehler = zaehler;
		this.nenner = nenner;
	}

	public int getZaehler() {
		return zaehler;
	}

	public int getNenner() {
		return nenner;
	}
	
	public void multipliziere(int n)
	{
		this.zaehler = this.zaehler * n;
	}
	
	public void multipliziere(Bruch b)
	{
		this.zaehler = this.zaehler * b.zaehler;
		this.nenner = this.nenner * b.nenner;
	}
	
	public void dividiere(Bruch b)
	{
		int tempZaehler = this.getZaehler();
		int tempNenner = this.getNenner();
		this.zaehler = this.zaehler * tempNenner;
		this.nenner = this.nenner * tempZaehler;
	}
	
	public int ggT()
	{
		int tempNenner = this.nenner;
		int tempZaehler = this.zaehler;
		while(tempNenner != tempZaehler)
		{
			if(tempZaehler > tempNenner)
				tempZaehler -= tempNenner;
			else 
				tempNenner -= tempZaehler;		
		}
		return tempZaehler;
	}
	
	public void BruchKuerzen()
	{
		int ggt = ggT();
		this.zaehler /= ggt;
		this.nenner /= ggt;
		
	}
	
	public void Druck()
	{
		BruchKuerzen();
		System.out.println(toString());
	}
	
	public String toString()
	{
		return this.zaehler + "/" + this.nenner;
	}
	
	

}
