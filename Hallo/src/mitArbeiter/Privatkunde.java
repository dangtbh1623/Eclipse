package mitArbeiter;

public class Privatkunde extends Person implements KundeI {

	public Privatkunde(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void druckeWerbung() {
		System.out.println("Lieber Kunde ..." + getName());
	}

	@Override
	public void druckeDaten() {
		System.out.println(getName());

	}

}
