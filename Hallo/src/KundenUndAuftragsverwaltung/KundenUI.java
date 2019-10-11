package KundenUndAuftragsverwaltung;


public class KundenUI
{
	//Deklarieren von zwei Attributen fuer Kundenobjekte
	private Kunde ersterKunde, zweiterKunde;
	//Deklarieren von Referenz-Attributen auf Auftragsobjekte *******
	private Auftrag einAuftrag, nochEinAuftrag;

	//Konstruktor
	public KundenUI()
	{
		System.out.println("Kundenverwaltung\n\n");
		erzeugeKunden();
		zeigeKunden();
	}

	private void erzeugeKunden()
	{

		//Erzeugen eines Objekts
		ersterKunde = new Kunde("KFZ-Zubehoer GmbH");

		//Adresse eintragen
	    ersterKunde.setFirmenadresse("44137 Dortmund, Poststr. 12");

	    //********************************************
	    //Erfassen eines Auftrags
	    einAuftrag = new Auftrag(3,"15.11.13");
	    einAuftrag.setAuftragsart("Programmierung");
	    einAuftrag.setAnzahlStunden(45);
	    //Zuordnung zum ersten Kunden
	    ersterKunde.setAuftrag(einAuftrag);
	    //********************************************


		//Erzeugen eines neuen Objekts
		zweiterKunde = new Kunde("Tankbau KG");

        //Adresse ändern
	    zweiterKunde.aendernAdresse("Tankbau & Partner KG", "44867 Bochum, Suedstr. 23");
	}

	private void zeigeKunden()
	{
	    //Lokale Attribute zum Merken der Ergebnisse der Methodenaufrufe
	    String gemerkterText;
	    int gemerkteZahl;

	    //Anzeigen der Attributinhalte auf der Konsole
	    gemerkterText = ersterKunde.getFirmenname();
	    //Mit append wird der Text an den vorhandenen Text angehängt
	    System.out.println(gemerkterText);
	    gemerkterText = ersterKunde.getFirmenadresse();
	    System.out.println(gemerkterText);
	    gemerkteZahl = ersterKunde.getAuftragssumme();
	    System.out.println("Auftragssumme: " + gemerkteZahl +"\n");

	    //************************************************
	    //Anzeigen des Auftrags
	    nochEinAuftrag = ersterKunde.getAuftrag();
	    System.out.println("Auftragsnummer: "+ nochEinAuftrag.getNr());
	    System.out.println(nochEinAuftrag.getAuftragsart());
	    System.out.println("Anzahl Stunden: "+ nochEinAuftrag.getAnzahlStunden());
	    System.out.println("Stundensatz: "+ nochEinAuftrag.getStundensatz());
	    System.out.println("Auftragsdatum: " + nochEinAuftrag.getAuftragsdatum()+"\n");
	    //Ende der Auftragsausgabe
	    //*****************************

	    //Anzeigen der Attributinhalte -- Kurzform
	    System.out.println(zweiterKunde.getFirmenname());
	    System.out.println(zweiterKunde.getFirmenadresse());
	    System.out.println("Auftragssumme: " + zweiterKunde.getAuftragssumme() +"\n");
    }

    //Hauptprogramm
	public static void main(String[] args)
	{
	    //Erzeugen eines Objekts vom Typ KundenUI
	    KundenUI dasKundenUI = new KundenUI();
	}

}




