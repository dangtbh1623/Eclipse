package DuckerInterface;

public class LaserDrucker extends Geraet implements DruckerI {

	public LaserDrucker(String name) {
		super(name);
	}

	@Override
	public void drucken(String text) {
		System.out.println("LaserDrucker Drucking ..." + text);
		
	}
	

}
