package Medium;

import java.io.OutputStream;
import java.util.Calendar;

public abstract class Medium implements Comparable<Medium> {
	private static int anzMedium;
	private int id;
	private String titel;
	private int jahr;
	public Medium(String t, int j) {
		id = anzMedium++;
		setTitel(t);
		setJahr(j);
	}
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public int getJahr() {
		return jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	public int getId() {
		return id;
	}
	
	public int alter()
	{
		Calendar c = Calendar.getInstance();
		int aktuelleJahr = c.get(Calendar.YEAR);
		return aktuelleJahr - jahr;
	}
	
	public void alterAusgeben()
	{
		System.out.println("ID = " + getId() + " \"" + getTitel() + "\" " + "ist " + alter() + " Jahre alt");
	}
	public abstract void druckeDaten();
	public abstract String druckeDatenalsString();
	public abstract void druckeDatenToFile(OutputStream s);
	
	public int compareTo(Medium other)
	{
		return Integer.compare(getId(), other.getId());	
	}

}
