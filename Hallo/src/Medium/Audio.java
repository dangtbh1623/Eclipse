package Medium;

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

}
