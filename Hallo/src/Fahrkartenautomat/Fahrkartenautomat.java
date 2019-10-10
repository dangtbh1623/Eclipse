package Fahrkartenautomat;

public class Fahrkartenautomat {
	private static final int[] muenzenWert = {200,100,50,20,10,5};
	private static final String[] muenzenName = {"2Euro","1Euro","50Cent","20Cent","10Cent","5Cent"};
	
	public Fahrkartenautomat()
	{
		
	}
	
	public int[] berechneRueckgeld(int FahrPreis,int GeldBetrag)
	{
		int[] rueckgeld = new int[6];
		int rest = GeldBetrag - FahrPreis;
		for(int i=0;i<muenzenWert.length;i++)
		{
			rueckgeld[i] = rest/muenzenWert[i];
			rest %= muenzenWert[i];
		}
		return rueckgeld;		
	}
	
	public void DruckRechnung(int FahrPreis,int GeldBetrag)
	{
		int[] rueckgeld = berechneRueckgeld(FahrPreis,GeldBetrag);
		for(int i=0;i<rueckgeld.length;i++)
		{	
			if(rueckgeld[i]!=0)
			System.out.print(rueckgeld[i] + "*" + muenzenName[i] + " ");
		}
		System.out.println();
	}
	

}
