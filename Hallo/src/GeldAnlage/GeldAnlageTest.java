package GeldAnlage;

import java.util.Scanner;

public class GeldAnlageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("StartKapital eingeben: ");
		double startkapital = sc.nextDouble();
		System.out.println("Zinssatz eingeben: ");
		double zinssatz = sc.nextDouble();
		GeldAnlage anlage = new GeldAnlage(startkapital, zinssatz);
		for(int i=0; i< 10;i++)
			System.out.println("Nach " + i + " Jahr: " + anlage.berechneEndkapital(i));
		sc.close();
		
	}

}
