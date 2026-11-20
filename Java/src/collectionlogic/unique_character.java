package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;
public class unique_character {
		public static void main(String[] args) {
			String s = "abaccdcc";

			Map<Character,Integer> map = new LinkedHashMap<>();

			for(char x : s.toCharArray()) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(Map.Entry<Character,Integer> y : map.entrySet()) {
				if(y.getValue() == 1) {
					System.out.println(y.getKey());
				}
			}
		}
	}

