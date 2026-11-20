package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;
public class remove_adjacent_word {
		public static void main(String[] args) {
			String s = "hi hello hi";

			Map<String,Integer> map = new LinkedHashMap<>();

			for(String x : s.split(" ")) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(String x : map.keySet()) {
				System.out.println(x);
			}
		}
	}

