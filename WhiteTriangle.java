package abstractFactory;

public class WhiteTriangle implements Triangle {
	private String color = "White";
	private int A;
	private int B;
	private int C;
public	WhiteTriangle () {
	A = 1 + (int)Math.random()*100;
	B = 1 + (int)Math.random()*100;
	C = 1 + (int)Math.random()*100;
}
public boolean ifTriangle() {
	if( (A+B)>C && (A+C)>B && (B+C)>A) {
		return true;
	} else {
		return false;
	}
	
}

public String getColor () {
	return color;
}
}
