package LineareSuche;

import java.util.Scanner;

public class LineareSucheTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Anzahl: ");
		Scanner sc = new Scanner(System.in);
		int[] sucheArray = new int[sc.nextInt()];
		for(int i=0;i<sucheArray.length;i++)
		{
			System.out.println(i + ".Element: ");
			sucheArray[i]=sc.nextInt();
		}
		for(int x:sucheArray)
			System.out.print(x + " ");
		LineareSuche a = new LineareSuche(sucheArray);
		System.out.println("Wert zum Suchen: ");
		System.out.println("befindet sich in der Index: " + a.sucheWert(sc.nextInt()) );

	}

}
