package Bruch;

public class BruchTest {

	public static void main(String[] args) {
		Bruch a = new Bruch(2);
		a.Druck();
		Bruch b = new Bruch(3, 2);
		b.Druck();
		a.multipliziere(2);
		a.Druck();
		a.multipliziere(b);
		a.Druck();
		a.dividiere(b);
		a.Druck();
		Bruch c = new Bruch(2, 5);
		c.Druck();
		c.dividiere(c);
		c.Druck();

	}

}
