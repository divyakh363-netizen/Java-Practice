package lamda;
interface Area5 {
	int print(int x);
}

public class Parallelogram {
	public static void main(String[] args) {

		Area5 a = (x) -> {
			int h = 6;
			return x * h;
		};

		System.out.println(a.print(10));
	}
}
