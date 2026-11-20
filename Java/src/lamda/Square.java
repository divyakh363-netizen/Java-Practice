package lamda;

interface Area3 {
	int print();
}

public class Square {
	public static void main(String[] args) {

		Area3 a = () -> {
			int s = 5;
			return s * s;
		};

		System.out.println(a.print());
	}
}