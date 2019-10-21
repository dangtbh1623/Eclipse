package MitarbeiterVerwaltung;

public abstract class Mitarbeiter {
private String name;
private int personalnummer;
private static int anzMitarbeiter = 1;

public Mitarbeiter(String name)
{
	this.setName(name);
	this.personalnummer = ++anzMitarbeiter;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public abstract double berechneGehalt();


public int getPersonalnummer() {
	return personalnummer;
}



	
}
