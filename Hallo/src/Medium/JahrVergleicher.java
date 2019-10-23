package Medium;

import java.util.Comparator;

public class JahrVergleicher implements Comparator<Medium> {

	@Override
	public int compare(Medium o1, Medium o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getJahr(), o2.getJahr());
	}
	

}
