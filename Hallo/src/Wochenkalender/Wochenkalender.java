package Wochenkalender;

public class Wochenkalender
{
	String[][] eintrag;
	
	public Wochenkalender()
	{
		this.eintrag = new String[24][7];
		for(int i=0;i<this.eintrag.length;i++)
			for(int j=0;j<this.eintrag[i].length;j++)
				this.eintrag[i][j] = "";
	}

	public String abfragenTermin(int tag,int stunde)
	{	
		if(tag <=7 && tag >=1 && stunde >=0 && stunde <= 23)
		{
		return eintrag[stunde][tag-1];
		}
		else
			return "Error!!!";
	}
	
	public void eintragenTermin(int tag, int vonStunde,String eintrag)
	{
		this.eintrag[vonStunde][tag-1] = eintrag;
	}
	
	public void  eintragenLangtermin(int tag,int vonStunde,int  bisStunde,
			String eintrag)
	{
		for(int i=vonStunde;i<=bisStunde;i++)
		{
			this.eintrag[i][tag-1] = eintrag;
		}
	}
	
	public void eintragenSerientermin(int vonStunde,String eintrag)
	{
		for(int i=0;i<7;i++)
			this.eintrag[vonStunde][i] = eintrag;
	}
	
	public void entfernenTermin(int tag, int vonStunde)
	{
		this.eintrag[vonStunde][tag-1] = "";
	}
	
	
	
}