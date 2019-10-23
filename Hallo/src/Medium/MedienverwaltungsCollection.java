package Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MedienverwaltungsCollection {
	private static final Comparator JahrVergleicher = null;
	List<Medium> arraylist;
	public MedienverwaltungsCollection()
	{
		arraylist = new ArrayList<Medium>();
	}
	
	public void aufnehme(Medium m)
	{
		arraylist.add(m);
	}
	
	public Medium sucheNeuesMedium()
	{
		if(arraylist.isEmpty())
		{
		leerWarnung();
		return null;
		}
	else
	{
	Medium temp = arraylist.get(0);
	for(Medium m : arraylist)
		if(m.getJahr()>temp.getJahr())
			temp = m;
	return temp;
	}
	}
	
	public void leerWarnung()
	{
			System.out.println("Die Liste ist leer");
	}
	
	public double berechneErscheinungsjahr()
	{
		double temp = 0.0;
		int anz = 0;
		if(arraylist.isEmpty())
			return temp;
		else
		{
			Iterator<Medium> it = arraylist.iterator();
			while(it.hasNext())
				{
				temp+=it.next().getJahr();
				anz++;
				}
			return temp/anz;
		}
			
	}
	
	public void zeigeMedien()
	{
		Iterator<Medium> it = arraylist.iterator();
		while(it.hasNext())
			it.next().druckeDaten();
	}
	
	public String zeigeMedienAlsString()
	{
		Collections.sort(arraylist,new JahrVergleicher());
		String temp ="";
		Iterator<Medium> it = arraylist.iterator();
		while(it.hasNext())
			temp += it.next().druckeDatenalsString() + "\n";
		return temp;
	}
	
	public void sortID()
	{
		Collections.sort(arraylist);
		zeigeMedien();
	}
	
	public void sortJahr()
	{
		Collections.sort(arraylist,new JahrVergleicher());
		zeigeMedien();
	}
	


}
