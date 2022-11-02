package abstractFactory;

public class WhiteTriangle implements Triangle {
	private String color = "White";
	private double a;
	private double b;
	private double c;
public	WhiteTriangle () {
	a = 1 + Math.random()*100;
	b = 1 + Math.random()*100;
	c = 1 + Math.random()*100;
}
public	WhiteTriangle (double newA, double newB, double newC) {
	a = newA;
	b = newB;
	c = newC;
}
public boolean ifTriangle() {
	if( (a+b)> c && (a+c)> b && (b+c)> a ) {
		return true;
	} else {
		return false;
	}
	
}
public double getA () {
	return a;
}
public double getB () {
	return b;
}
public double getC () {
	return c;
}
public String getColor () {
		return color;
	}

public double getPerimetr () {
	return a+b+c;
}
public double getSquare () {
	double p = getPerimetr()/2;
	return Math.sqrt(p*(p-a)*(p-b)*(p-c));
}
}
