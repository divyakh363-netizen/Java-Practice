package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;

public class remove_adjacent_number {
		public static void main(String[] args) {
			int a = 55544321;

			Map<Integer,Integer> map = new LinkedHashMap<>();

			while(a != 0) {
				int rem = a % 10;

				map.put(rem, map.getOrDefault(rem, 0) + 1);

				a = a / 10;
			}

			for(int x : map.keySet()) {
				System.out.println(x);
			}
		}
	}

