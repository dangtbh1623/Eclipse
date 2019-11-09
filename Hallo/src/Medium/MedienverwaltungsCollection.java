package Medium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

public class MedienverwaltungsCollection  {
	

	
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
	
	public void pruefeName(String name) throws EmptyFileNameException
	{
		if(name.isEmpty())
			throw new EmptyFileNameException("Name ist leer!!!");
	}
	
	public void zeigeMedienAlsDateiGUI(String name)
	{
		
		
		Iterator<Medium> it = arraylist.iterator();
		File to = new File("C:\\Users\\aznyo\\git\\repository2\\Hallo\\src\\CopyFile\\" + name);
		OutputStream out;
		try {
			out = new FileOutputStream(to);
			while(it.hasNext())
			{
					it.next().druckeDatenToFile(out);
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void zeigeMedienAlsDatei()
	{
		boolean ok = false;
		String eingabe = "";
		do {
		try {
			eingabe = JOptionPane.showInputDialog(null, "Dateiname: ");
			pruefeName(eingabe);
			ok = true;
		}catch(NullPointerException npe)
		{
			return;
		}
		catch(EmptyFileNameException e)
		{
			int i = JOptionPane.showConfirmDialog(null, "Dateiname ist leer! Noch mal Dateiname eingeben?", "Hinweis", JOptionPane.YES_NO_OPTION);
			if(JOptionPane.NO_OPTION == i || JOptionPane.CLOSED_OPTION == i)
				return;
		}
		}while(!ok);
		
		Iterator<Medium> it = arraylist.iterator();
		File to = new File("C:\\Users\\aznyo\\git\\repository2\\Hallo\\src\\CopyFile\\" + eingabe);
		OutputStream out;
		try {
			out = new FileOutputStream(to);
			while(it.hasNext())
			{
					it.next().druckeDatenToFile(out);
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	
	public void speichern()
	{
		File sfile = new File("C:\\Users\\aznyo\\git\\repository2\\Hallo\\src\\CopyFile\\medium.ser");
		try(FileOutputStream fos = new FileOutputStream(sfile);
				ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			oos.writeObject(arraylist);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void laden()
	{
		
		File sfile = new File("C:\\Users\\aznyo\\git\\repository2\\Hallo\\src\\CopyFile\\medium.ser");
		try(FileInputStream fis = new FileInputStream(sfile);
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
			arraylist = (List<Medium>) ois.readObject();	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Iterator<Medium> iterator()
	{
		return arraylist.iterator();
	}
	


}
