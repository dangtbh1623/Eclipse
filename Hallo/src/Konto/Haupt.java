package Konto;

public class Haupt {
	public static void main(String[] args) {
		Konto a = new Konto();
		Konto b = new Konto(100);
		a.Drucken();
		b.Drucken();
		a.einZahlen(100.0);
		a.Drucken();
		a.ausZahlen(99.0);
		System.out.println(a);
	}
}
