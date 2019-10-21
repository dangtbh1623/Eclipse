package DuckerInterface;

public class Kombigeraet extends Geraet implements DruckerI, FaxI {

	public Kombigeraet(String name) {
		super(name);
	}

	@Override
	public void senden(String text) {
		System.out.println("Kombigeraet sending ..." + text); 
		
	}

	@Override
	public void drucken(String text) {
		System.out.println("Kombigeraet printing ..." + text); 
		
	}

}
