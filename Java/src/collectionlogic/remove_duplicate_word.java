package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;
public class remove_duplicate_word {
		public static void main(String[] args) {
			String s = "hi hello hi";

			Map<String,Integer> map = new LinkedHashMap<>();

			for(String x : s.split(" ")) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(Map.Entry<String,Integer> y : map.entrySet()) {
				if(y.getValue() >= 1) {
					System.out.println(y.getKey());
				}
			}
		}
	}

