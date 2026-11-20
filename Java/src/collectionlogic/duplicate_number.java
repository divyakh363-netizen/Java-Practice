package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;

public class duplicate_number {
		public static void main(String[] args) {
			int a = 12333455;

			Map<Integer,Integer> map = new LinkedHashMap<>();

			while(a != 0) {
				int rem = a % 10;

				map.put(rem, map.getOrDefault(rem, 0) + 1);

				a = a / 10;
			}

			for(Map.Entry<Integer,Integer> y : map.entrySet()) {
				if(y.getValue() > 1) {
					System.out.println(y.getKey());
				}
			}
		}
	}


