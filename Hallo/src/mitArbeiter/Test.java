package mitArbeiter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KundeI a[] = new KundeI[2];
		a[0] = new Firmenkunde();
		a[1] = new Privatkunde("DAng");
		a[0].druckeWerbung();
		a[1].druckeWerbung();

}
}
