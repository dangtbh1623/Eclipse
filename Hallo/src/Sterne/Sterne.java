package Sterne;

public class Sterne {
	private char zeichen;
	private int anzahl;
	public Sterne(char zeichen, int anzahl)
	{
		this.zeichen = zeichen;
		this.anzahl = anzahl;
	}
	
	public void DreieckDraw()
	{
		for(int i=0;i<anzahl;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(zeichen);
			}
			System.out.println();		
		}
	}
	
	public void WeihnachtBaumDraw()
	{
		for(int i=1;i<=anzahl;i++)
		{
			for(int j=1;j<=anzahl-i;j++)
			{
				System.out.print(' ');
			}
			for(int j=1;j<=(2*i)-1;j++) {
				System.out.print(zeichen);
			}
			System.out.println();
		}
	}
	

}
