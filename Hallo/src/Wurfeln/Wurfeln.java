package Wurfeln;

public class Wurfeln {
private int wurf;

public Wurfeln()
{
	wurfeln();
}

public void wurfeln()
{
	this.wurf = (int)(Math.random()*6 + 1);
}

public int getWurf() {
	return wurf;
}



}
