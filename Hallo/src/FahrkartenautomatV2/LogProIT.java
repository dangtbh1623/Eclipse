package FahrkartenautomatV2;
import java.util.*;


public class LogProIT {
	final int ZWEICENT = 2;
	final int EINCENT = 1;
	final int FUENF = 5;
	final int ZEHN = 10;
	final int ZWANGZIG = 20;
	final int FUENFZIG = 50;
	final int EINS = 100;
	final int ZWEI = 200;
	private int kartenBetrag;
	private boolean kasse;
	private boolean bezahlt1;
	
	public LogProIT()
	{
		this.kartenBetrag = 0;
		this.kasse = false;
		this.bezahlt1 = false;
	}
	
	public void rueckGeld(int a)
	{
		int b = a;
		while(b>0)
			if((b/ZWEI) > 0)
			{
				
				System.out.println((b/ZWEI) + " Stueck Zwei Euro");
				b = b%ZWEI;
			}
			else if((b/EINS) > 0)
			{
				
				System.out.println((b/EINS) + " Stueck Eins Euro");
				b = b%EINS;
			}
			else if((b/FUENFZIG) > 0)
			{
				System.out.println((b/FUENFZIG) + " Stueck Fuenfzig Cent");
				b = b%FUENFZIG;
			}
			else if((b/ZWANGZIG) > 0)
			{
				
				System.out.println((b/ZWANGZIG) + " Stueck Zwangzig Cent");
				b = b%ZWANGZIG;
			}
			else if((b/ZEHN) > 0)
			{
				
				System.out.println((b/ZEHN) + " Stueck Zehn Cent");
				b = b%ZEHN;
			}
			else if((b/FUENF) > 0)
			{
				System.out.println((b/FUENF) + " Stueck fuenf Cent");
				b = b%FUENF;
			}
			else if((b/ZWEICENT) > 0)
			{
				System.out.println((b/ZWEICENT) + " Stueck Zwei Cent");
				b = b%ZWEICENT;
			}
			else if((b/EINCENT) > 0)
			{
				System.out.println((b/EINCENT) + " Stueck Ein Cent");
				b = b%EINCENT;
			}
	}
	
	public void Muenzen()
	{
		System.out.println("**************************************");
		System.out.println("Waehlen Sie bitte eine folgende Muenze aus: ");
		System.out.println("1. 1 Cent");
		System.out.println("2. 2 Cent");
		System.out.println("3. 5 Cent");
		System.out.println("4. 10 Cent");
		System.out.println("5. 20 Cent");
		System.out.println("6. 50 Cent");
		System.out.println("7. 1 Euro");
		System.out.println("8. 2 Euro");
		System.out.println("**************************************");
	}
	
	public void fahrKarteMenu()
	{
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
		System.out.println("**************Herzlich willkommen************************");
		System.out.println("**************Fahrkartenautomat**************************");
		System.out.println("*********************************************************");
		System.out.println("*********************************************************");
	}
	
	public int MuenzenAuswaehlen()
	{	System.out.println("*********************************************************");
		Scanner sc2 = new Scanner(System.in);
		switch(sc2.nextInt())
		{
		case 1:
			System.out.println(EINCENT + " Cent eingegeben wurde !!!");
			return EINCENT;
			
		case 2:
			System.out.println(ZWEICENT + " Cent eingegeben wurde !!!");
			return ZWEICENT;
			
		case 3:
			System.out.println(FUENF + " Cent eingegeben wurde !!!");
			return FUENF;
			
		case 4:
			System.out.println(ZEHN + " Cent eingegeben wurde !!!");
			return ZEHN;
			
		case 5:
			System.out.println(ZWANGZIG + " Cent eingegeben wurde !!!");
			return ZWANGZIG;
			
		case 6:
			System.out.println(FUENFZIG + " Cent eingegeben wurde !!!");
			return FUENFZIG;
			
		case 7:
			System.out.println(EINS/100 + " Euro eingegeben wurde !!!");
			return EINS;
			
		case 8:
			System.out.println(ZWEI/100 + " Euro eingegeben wurde !!!");
			return ZWEI;
			
		default:
			return 0;
			
			
		}
	}
	
	public void bezahlen()
	{
		Muenzen();
		int a = MuenzenAuswaehlen();
		/*while(!bezahlt1) 
		{
			int eingegebenMuenze = MuenzenAuswaehlen();
			kartenBetrag = kartenBetrag - eingegebenMuenze;
			if(kartenBetrag<=0)
			{	
				System.out.println("Betrag: " + ((float)kartenBetrag/100));
				rueckGeld(Math.abs(kartenBetrag));
				bezahlt1 = true;
			}
				else
			{
				System.out.println("Betrag: " + ((float)kartenBetrag/100));
				Muenzen();
				eingegebenMuenze = MuenzenAuswaehlen();
				bezahlt1 = false;
			}
				
		}*/
	}
	
	
	
	public void start()
	{
		fahrKarteMenu();
		System.out.println("Karte.          \t Preis");
		System.out.println("1. Kurzstrecke. \t 1,70 Euro");
		System.out.println("2. Einzelfahrt. \t 2,80 Euro");
		System.out.println("Bitte waehlen Sie Ihr Ticket");
		Scanner sc1 = new Scanner(System.in);
		int waehltekarte = sc1.nextInt();
		while(!kasse)
		{	
			if(waehltekarte == 1)
			{
				kartenBetrag = kartenBetrag + 170;
				System.out.println("Betrag: " + ((float)kartenBetrag/100));
				System.out.println("Geben Nummer 0 fuer Zahlen oder andere Nummer fuer weitere Waehlen:");
				waehltekarte = sc1.nextInt();
				if(waehltekarte == 0)
				{
				kasse = true;
				sc1.close();
				}
			}
			else if(waehltekarte == 2)
			{
				kartenBetrag = kartenBetrag + 280;
				System.out.println("Betrag: " + ((float)kartenBetrag/100));
				System.out.println("Geben Nummer 0 fuer Zahlen oder andere Nummer fuer weitere Waehlen:");
				waehltekarte = sc1.nextInt();
				if(waehltekarte == 0)
				{
				kasse = true;
				sc1.close();
				}
			}
			if(waehltekarte == 0)
			{
				System.out.println("Betrag: " + ((float)kartenBetrag/100));
				sc1.close();
				Scanner test = new Scanner(System.in);
				int a = test.nextInt();
				Muenzen();
				while(!bezahlt1) 
				{
					int eingegebenMuenze = MuenzenAuswaehlen();
					kartenBetrag = kartenBetrag - eingegebenMuenze;
					if(kartenBetrag<=0)
					{	
						System.out.println("Betrag: " + ((float)kartenBetrag/100));
						rueckGeld(Math.abs(kartenBetrag));
						bezahlt1 = true;
					}
						else
					{
						System.out.println("Betrag: " + ((float)kartenBetrag/100));
						Muenzen();
						eingegebenMuenze = MuenzenAuswaehlen();
						bezahlt1 = false;
					}
						
				}
				kasse = true;				
				System.out.println("Vielen Dank!");
			}
				
		}
}
	
	
		
	
	
	}

