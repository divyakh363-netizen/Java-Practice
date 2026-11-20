package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;
public class word_frequence {
		public static void main(String[] args) {
			String s = "hi hello hi";

			Map<String,Integer> map = new LinkedHashMap<>();

			for(String x : s.split(" ")) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(Map.Entry<String,Integer> y : map.entrySet()) {
				System.out.println(y.getKey() + " " + y.getValue());
			}
		}
	}

