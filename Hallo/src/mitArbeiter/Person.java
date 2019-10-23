package mitArbeiter;

public abstract class Person {
private String name;

public Person(String n)
{
	this.name = n;
}

public String getName() {
	return name;
}

public abstract void druckeDaten();

}
