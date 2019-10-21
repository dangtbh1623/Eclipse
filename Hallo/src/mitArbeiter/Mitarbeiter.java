package mitArbeiter;

public abstract class Mitarbeiter {
private String name;
private int Personalnummer;
private static int anzMitarbeiter = 1;

public Mitarbeiter(String name)
{
	this.setName(name);
	this.Personalnummer = ++anzMitarbeiter;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public abstract double berechneGehalt();

public int getPersonalnummer() {
	return Personalnummer;
}




}
