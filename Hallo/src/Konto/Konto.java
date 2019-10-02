package Konto;

public class Konto {
private int kontonummer;
private double kontostand = 0.0;
private static int anzahlKonten = 0;

public Konto()
{
	anzahlKonten+=1;
	this.kontonummer = 10000 + anzahlKonten;
	
}

public Konto(double Kontostand)
{
	this.kontostand = Kontostand;
	anzahlKonten+=1;
	this.kontonummer = 10000 + anzahlKonten;
}

public int getKontoNummer()
{
	return kontonummer;
}

public double getKontoStand()
{
	return kontostand;
}

public void einZahlen(double betrag)
{
	this.kontostand+=betrag;
}

public void ausZahlen(double betrag)
{
	this.kontostand-=betrag;
}

public int getKontonummer()
{
	return kontonummer;
}

public void Drucken()
{
	System.out.println("Nummer: " + kontonummer + "; Kontostand: " + kontostand);
}

public String toString()
{
	return kontonummer + " " + kontostand;}
}

