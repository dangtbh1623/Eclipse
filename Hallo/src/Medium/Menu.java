package Medium;

import javax.swing.JOptionPane;

public class Menu {
	private MedienverwaltungsCollection mvc;
	private String menu;
	public Menu (MedienverwaltungsCollection mvc)
	{
		this.mvc = mvc;
		this.menu = "\tMedienverwaltung \n\n1. Audio aufnehmen\n2. Bild aufnehmen\n3.Zeige alle Medien\n4.Zeige neues Medium\n5.Berechne durchschnittliches Erscheinungsjahr\n6. Speichern\n7. Beenden";
	}
	
	public void start()
	{
		int auswahl = 0;
		do {
		String eingabe = JOptionPane.showInputDialog(null, menu);
		try {
		auswahl = Integer.parseInt(eingabe);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(null, "Bitte nur ein Zahl eingeben!");
		}
		boolean ok = true;
		int j = 0;
		int d = 0;
		String t,o,i;
			switch(auswahl)
			{
			case 1:
				t = JOptionPane.showInputDialog(null, "Titel: ");
				do{
					try {
						j = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr: "));
						ok = true;
						}catch(NumberFormatException nfe)
						{
						JOptionPane.showMessageDialog(null, "Bitte nul ein gueltiges Jahr!");
						ok = false;
						}
						//Audio(String t, int j, String i, int d);
					}while(!ok);
				i = JOptionPane.showInputDialog(null, "Interpret: ");
				do{
				try {
					d = Integer.parseInt(JOptionPane.showInputDialog(null, "Dauer: "));
					ok = true;
					}catch(NumberFormatException nfe)
					{
					JOptionPane.showMessageDialog(null, "Bitte nul ein gueltiges!");
					ok = false;
					}
				}while(!ok);
				mvc.aufnehme(new Audio(t, j, i,d));
			break;
			case 2:
				t = JOptionPane.showInputDialog(null, "Titel: ");
				do{
					try {
						j = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr: "));
						ok = true;
						}catch(NumberFormatException nfe)
						{
						JOptionPane.showMessageDialog(null, "Bitte nul ein gueltiges Jahr!");
						ok = false;
						}
					}while(!ok);
				o = JOptionPane.showInputDialog(null, "Ort: ");
				mvc.aufnehme(new Bild(t, j, o));
				break;
			case 3:
				JOptionPane.showMessageDialog(null,mvc.zeigeMedienAlsString());
				break;
			case 4:
				JOptionPane.showMessageDialog(null,mvc.sucheNeuesMedium().druckeDatenalsString());
				break;
			case 5:
				JOptionPane.showMessageDialog(null,mvc.berechneErscheinungsjahr());
				break;
			case 6:
				mvc.zeigeMedienAlsDatei();
				break;
			default:
				break;
			}
	}while(auswahl!=7);
}
}
