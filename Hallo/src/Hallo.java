
public class Hallo {
	public static void tausch(char[] a)
	{
		char hilf = a[0];
		a[0] = a[1] ;
		a[1] = hilf;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated metaaaahod stub
		System.out.print("abc");
		System.out.println("xyz");
		char[] a= {'a','b'};
		for(char x : a)
			System.out.println(x);
		
		tausch(a);
		for(char x : a)
			System.out.println(x);
	}

}
