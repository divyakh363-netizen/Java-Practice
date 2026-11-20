package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;

public class duplicate_array {
		public static void main(String[] args) {
			int[] a = {2,3,4,4,5,6,6,7};

			Map<Integer,Integer> map = new LinkedHashMap<>();

			for(int x : a) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(Map.Entry<Integer,Integer> y : map.entrySet()) {
				if(y.getValue() > 1) {
					System.out.println(y.getKey());
				}
			}
		}
	}

