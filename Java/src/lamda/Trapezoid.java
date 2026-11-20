package lamda;

interface Area6 {
	void print(int a);
}

public class Trapezoid {
	public static void main(String[] args) {

		Area6 x = (a) -> {
			int b = 10;
			int h = 6;
			System.out.println(0.5 * (a + b) * h);
		};

		x.print(8);
	}
}