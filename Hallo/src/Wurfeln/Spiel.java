package Wurfeln;

public class Spiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wurfeln a = new Wurfeln();
		Wurfeln b = new Wurfeln();
		boolean win = false;
		int anz = 0;
		do
		{
			System.out.println(anz+1 + ".Versuch: ");
			a.wurfeln();
			System.out.println("a: " + a.getWurf());
			b.wurfeln();
			System.out.println("b: " + b.getWurf());
			if(a.getWurf() == b.getWurf())
				win = true;
			anz++;
		}while (anz < 3 && !win);
		if(win)
			System.out.println("You are winner");
		else
			System.out.println("You are closer");

	}

}
