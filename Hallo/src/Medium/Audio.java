package Medium;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Audio extends Medium {
	private String interpret;
	private int dauer;
	
	public Audio(String t, int j, String i, int d) {
		super(t, j);
		this.interpret = i;
		this.dauer = d;
		// TODO Auto-generated constructor stub
	}

	public String getInterpret()
	{
		return interpret;
	}
	
	public int getDauer()
	{
		return dauer;
	}
	@Override
	public void druckeDaten() {
		System.out.println("ID = " + getId() + " \"" + getTitel() + "\" " + "von " + getInterpret() + " aus " + getJahr() + " Spieldauer: " + getDauer());

	}

	@Override
	public String druckeDatenalsString() {
		return "ID = " + getId() + " \"" + getTitel() + "\" " + "von " + getInterpret() + " aus " + getJahr() + " Spieldauer: " + getDauer();
	}

	@Override
	public void druckeDatenToFile(OutputStream s) {
		// TODO Auto-generated method stub
		String t = "ID = " + getId() + " \"" + getTitel() + "\" " + "von " + getInterpret() + " aus " + getJahr() + " Spieldauer: " + getDauer() + "\n";
		OutputStreamWriter sw = new OutputStreamWriter(s);
		try {
			sw.write(t.toCharArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
