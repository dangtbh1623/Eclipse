package Dose;

public class Dose {
private double radius;
private double hoehe;
private static int AnzahlDose;

public Dose()
{
	AnzahlDose++;
}

public Dose(double nradius, double nhoehe)
{
	this.radius = nradius;
	this.hoehe = nhoehe;
	AnzahlDose++;
}

public double getRadius() {
	return radius;
}


public double getHoehe() {
	return hoehe;
}

public double berechneUmfang()
{
	return 2*Math.PI*radius;
}

public double berechneDeckelflaeche()
{
	return Math.PI*Math.pow(radius,2);
}

public double berechneMantelflaeche()
{
	return berechneUmfang()*hoehe;
}

public double berechneOberflaeche()
{
	return 2*berechneDeckelflaeche()*berechneMantelflaeche();
}

public double berechneVolume()
{
	return berechneDeckelflaeche()*hoehe;
}

public String toString()
{
	return "AnzahlExistenDose: " + AnzahlDose + " radius: " + radius + " Hoehe: " +hoehe + " Deckelflaeche: " +  berechneDeckelflaeche() + " Mantelflaeche: " +  berechneMantelflaeche() + " Oberflaeche: " +  berechneOberflaeche() + " Volume: " +  berechneVolume();
}



}
