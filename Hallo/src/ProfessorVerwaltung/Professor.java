package ProfessorVerwaltung;

public class Professor {
private String name;
private int postfach;
private Raum buero;

public Professor(String name, Raum buero)
{
	setBuero(buero);
	setName(name);
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPostfach() {
	return postfach;
}
public void setPostfach(int postfach) {
	this.postfach = postfach;
}

public Raum getBuero() {
	return buero;
}

public void setBuero(Raum buero) {
	this.buero = buero;
	this.getBuero().setBesitzer(this);
}

public String toString()
{
		return "Professor: " + getName() + " " + getPostfach();
}
}
