
public class fakultaet {
	public static long fakultaetRechnen(int n)
	{
		long erg = 1;
		for(int i=1;i<=n;i++)
			erg*=i;
		return erg;
	}

	public static void main(String args[])
	{	
		int n = 4;
		System.out.println(fakultaetRechnen(n));
	}
}
