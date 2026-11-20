package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;

public class remove_adjacent_array {
		public static void main(String[] args) {
			int[] a = {2,3,4,4,5,6,6,7};

			Map<Integer,Integer> map = new LinkedHashMap<>();

			for(int x : a) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(int x : map.keySet()) {
				System.out.println(x);
			}
		}
	}

