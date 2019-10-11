package ProfessorVerwaltung;

public class Raum {
private char trakt;
private char etage;
private String raumNummer;
private Professor besitzer;

public Raum(char trakt,char etage, String raumNummer)
{
	setTrakt(trakt);
	setEtage(etage);
	this.raumNummer = raumNummer;
}

public char getTrakt() {
	return trakt;
}
public void setTrakt(char trakt) {
	this.trakt = trakt;
}
public char getEtage() {
	return etage;
}
public void setEtage(char etage) {
	this.etage = etage;
}
public String getRaumNummer() {
	return raumNummer;
}

public void setBesitzer(Professor besitzer)
{
	this.besitzer = besitzer;
}

public Professor getBesitzer()
{
	return besitzer;
}

public void removeBesitzer()
{
	besitzer = null;
}

public String toString()
{
		return "Raum: " + getTrakt() + " " + getEtage() + " " + getRaumNummer();
}


}
