package MitarbeiterVerwaltung;

public class Arbeiter extends Mitarbeiter {
	private double stundenlohn;
	private int anzahlStunden;
	private double ueberstundenzuschlag;
	private int anzahlUeberstunden;
	
	public Arbeiter(String name, double stundenlohn, int anzahlStunden, double ueberstundenzuschlag, int anzahlUeberstunden) {
		super(name);
		this.stundenlohn = stundenlohn;
		this.anzahlStunden = anzahlStunden;
		this.ueberstundenzuschlag = ueberstundenzuschlag;
		this.anzahlUeberstunden = anzahlUeberstunden;
	}

	@Override
	public double berechneGehalt() {
		return stundenlohn*anzahlStunden+ueberstundenzuschlag*anzahlUeberstunden;
	}

}
