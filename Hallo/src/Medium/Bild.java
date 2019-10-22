package Medium;

public class Bild extends Medium {
	private String ort;
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

}
