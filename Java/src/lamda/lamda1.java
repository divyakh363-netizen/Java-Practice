package lamda;


interface area {
	int print(int x);
}

public class lamda1{
	public static void main(String[] args) {

		area a = (x) -> {
			int h = 6;
			return x * h;
		};

		System.out.println(a.print(10));
	}
}
