package abstractFactory;

public class WhiteTriangle implements Triangle {
	private String color = "White";
	private int A;
	private int B;
	private int C;
public	WhiteTriangle (int a, int b, int c) {
	A = a;
	B = b;
	C = c;
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
