package abstractFactory;

public class BlackTriangle implements Triangle {
	private String color = "Black";
	private int A;
	private int B;
	private int C;
public	BlackTriangle (int a, int b, int c) {
	A = a;
	B = b;
	C = c;
}
public boolean ifTriangle() {
	if( (A+B)>C && (A+C)>B && (B+C)>A ) {
		return true;
	} else {
		return false;
	}
	
}
	public String getColor () {
		return color;
	}
}
