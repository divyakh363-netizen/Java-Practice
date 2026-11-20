package collectionlogic;
import java.util.LinkedHashMap;
import java.util.Map;
public class remove_adjacent_character {
		public static void main(String[] args) {
			String s = "abaccdcc";

			Map<Character,Integer> map = new LinkedHashMap<>();

			for(char x : s.toCharArray()) {
				map.put(x, map.getOrDefault(x, 0) + 1);
			}

			for(char x : map.keySet()) {
				System.out.println(x);
			}
		}
	}

