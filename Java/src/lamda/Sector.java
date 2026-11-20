package lamda;
interface Area7 {
	double print(int r);
}

public class Sector {
	public static void main(String[] args) {

		Area7 a = (x) -> {
			double theta = 60;
			return 0.5 * x * x * theta;
		};

		System.out.println(a.print(6));
	}
}