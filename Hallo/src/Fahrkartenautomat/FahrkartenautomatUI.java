package Fahrkartenautomat;

import java.util.Scanner;

public class FahrkartenautomatUI {
	private Scanner sc;
	private Fahrkartenautomat dasFahrkartenautomat;
	public FahrkartenautomatUI() {
		// TODO Auto-generated constructor stub
	sc = new Scanner(System.in);
	dasFahrkartenautomat = new Fahrkartenautomat();
	}
	
	public void start()
	{
		System.out.println("Fahrpreis eingeben: ");
		int preis = (int)(sc.nextFloat()*100);
		System.out.println("Geldbetrag eingeben: ");
		int betrag = (int)(sc.nextFloat()*100);
		dasFahrkartenautomat.DruckRechnung(preis, betrag);
		System.out.println("Danke!!");
	}

}
