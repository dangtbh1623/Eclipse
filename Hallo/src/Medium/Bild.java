package Medium;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bild extends Medium {
	private String ort;
	
	public Bild()
	{
		
	}
	
	public Bild(String t, int j, String o) {
		super(t, j);
		setOrt(o);
	}

	@Override
	public void druckeDaten() {
		System.out.println("ID = " + getId() + " \"" + getTitel() + "\" " + "aufgenommen im Jahr " + getJahr() + " in " + getOrt());  
		
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	@Override
	public String druckeDatenalsString() {
		return "ID = " + getId() + " \"" + getTitel() + "\" " + "aufgenommen im Jahr " + getJahr() + " in " + getOrt();
	}

	@Override
	public void druckeDatenToFile(OutputStream s) {
		// TODO Auto-generated method stub
		String t = "ID = " + getId() + " \"" + getTitel() + "\" " + "aufgenommen im Jahr " + getJahr() + " in " + getOrt() + "\n";
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
