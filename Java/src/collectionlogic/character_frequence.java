package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;
public class character_frequence {
		public static void main(String[] args) {
			String s = "abaccdcc";

			Map<Character,Integer> map = new LinkedHashMap<>();

			for(char x : s.toCharArray()) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(Map.Entry<Character,Integer> y : map.entrySet()) {
				System.out.println(y.getKey() + " " + y.getValue());
			}
		}
	}


