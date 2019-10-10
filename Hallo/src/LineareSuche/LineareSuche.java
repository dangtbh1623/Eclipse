package LineareSuche;

public class LineareSuche {
	private int array[];
	
	public LineareSuche(int[] a)
	{
		this.array = a;
	}
	
	public boolean gefunden(int wert)
	{
		return sucheWert(wert) > -1;
	}
	
	public int sucheWert(int wert)
	{
		int erg = -1;
		int i=0;
		while ((i < array.length) && (array[i] != wert))
			i++;
			
		if (i < array.length)
			erg = i;
			
		return erg;
	}

}
