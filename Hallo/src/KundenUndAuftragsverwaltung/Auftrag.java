package KundenUndAuftragsverwaltung;


public class Auftrag
{
    //Objektattribute
    private int nummer;
    private String art;
    private int anzahlStunden = 1;
    private int stundensatz = 180;
    private String auftragsdatum;

    //Konstruktor
    public Auftrag(int nr, String datum)
    {
        nummer = nr;
        auftragsdatum = datum;
    }

    //Methoden
    public void setAnzahlStunden(int stunden)
    {
        anzahlStunden = stunden;
    }
    public void setStundensatz(int satz)
    {
        stundensatz = satz;
    }
    public void setAuftragsart(String auftragsart)
    {
        art = auftragsart;
    }
    public int getNr()
    {
        return nummer;
    }
    public String getAuftragsdatum()
    {
        return auftragsdatum;
    }
    public String getAuftragsart()
    {
        return art;
    }
    public int getAnzahlStunden()
    {
        return anzahlStunden;
    }
    public int getStundensatz()
    {
        return stundensatz;
    }
}


