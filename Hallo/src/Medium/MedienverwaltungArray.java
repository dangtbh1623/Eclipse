package Medium;

public class MedienverwaltungArray {
	private int anzahl;
	private Medium m[];
	public MedienverwaltungArray()
	{
		m = new Medium[5];
	}
	
	public void aufnehmen(Medium m)
	{
		if(anzahl<this.m.length)
		{
			this.m[anzahl++] = m;
			System.out.println("ID = " + m.getId() + " wurde hinzugefuegt.");
		}
		else
			System.out.println("ID = " + m.getId() + " wurde nicht hinzugefuegt.");
	}
	
	public void zeigeMedien()
	{
		if(istLeer())
			leerWarnung();
		else {
		for(Medium m : this.m)
			m.druckeDaten();
			}
		}
	
	public Medium sucheNeuesMedium()
	{
		if(istLeer())
			{
			leerWarnung();
			return null;
			}
		else
		{
		Medium temp = this.m[0];
		for(Medium m : this.m)
			if(m.getJahr()>temp.getJahr())
				temp = m;
		return temp;
		}
	}
	
	public double berechneErscheinungsjahr()
	{
		double temp = 0.0;
		if(anzahl == 0)
			return temp;
		else
			for(Medium m : this.m)
				temp+=m.getJahr();
		return temp/anzahl;
	}
	
	public boolean istLeer()
	{
		return (anzahl == 0);
	}
	
	public void leerWarnung()
	{
			System.out.println("Die Liste ist leer");
	}

}
