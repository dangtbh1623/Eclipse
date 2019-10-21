package DuckerInterface;

public class Faxgeraet extends Geraet implements FaxI{

	public Faxgeraet(String name) {
		super(name);
	}

	@Override
	public void senden(String text) {
		System.out.println("Faxgeraet sending ..." + text); 
		
	}

}
