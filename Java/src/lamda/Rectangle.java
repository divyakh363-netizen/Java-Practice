package lamda;
interface Area4 {
	int print();
}

public class Rectangle {
	public static void main(String[] args) {

		Area4 a = () -> {
			int l = 10;
			int b = 5;
			return l * b;
		};

		System.out.println(a.print());
	}
}