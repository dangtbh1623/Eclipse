package KundenUndAuftragsverwaltung;


public class Kunde
{
    //Referenz-Attribut für Assoziation
    private Auftrag einAuftrag;

    //Objektattribute
	private String firmenname;
	private String firmenadresse;
	private int auftragssumme = 0;

	//Konstruktor
	public Kunde(String name)
	{
		firmenname = name;
	}

	//Kombinierte Schreibmethode
	public void aendernAdresse (String name, String adresse)
	{
		firmenname = name;
		firmenadresse = adresse;
	}

	//Schreibende Methoden
	public void setFirmenname (String name)
	{
		 firmenname = name;
	}
	public void setFirmenadresse (String adresse)
	{
		 firmenadresse = adresse;
	}

	//Lesende Methoden
	public String getFirmenname()
	{
		return firmenname;
	}

	public String getFirmenadresse()
	{
		return firmenadresse;
	}

	public int getAuftragssumme()
	{
		return auftragssumme;
	}

	
	//Verbindung zu Auftrag herstellen
	public void setAuftrag(Auftrag auftrag)
	{
	    einAuftrag = auftrag;

	    // Auftragssumme anpassen
		auftragssumme = einAuftrag.getAnzahlStunden() * einAuftrag.getStundensatz();

	}

	//Referenz auf Auftrag lesen
	public Auftrag getAuftrag()
	{
	    return einAuftrag;
	}

	//Referenz zu Auftrag löschen
	public void removeAuftrag()
    {
		 einAuftrag = null;
	}

}

