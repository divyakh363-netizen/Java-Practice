package map;
import java.util.Map;
import java.util.Map.Entry;
import java.util.LinkedHashMap;

public class MapAllMethods {
	public static void main(String[] args) {
		Map<String,Integer> m= new LinkedHashMap();
		
		m.put("a1",1);
		m.put("a2",2);
		m.put("a3",6);
		m.put("a1",4);
		System.out.println(m);

		Map<String,Integer> m1= new LinkedHashMap();
		
		m1.put("a4",5);
		m1.put("a5",8);
		m1.put("a6",9);
		m1.put("a8",3);
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
//		m.clear();
//		System.out.println(m.isEmpty());
		System.out.println(m.get("a1"));
		System.out.println(m.containsKey("a1"));
		System.out.println(m.containsValue(3));
		System.out.println(m.keySet());
		System.out.println(m.values());
//		m.remove("a1");
		m.remove("a1",4);
		m.putAll(m1);
		System.out.println(m.entrySet());
		for (Entry<String, Integer> x: m.entrySet()) {
			System.out.println(x.getKey()+" "+x.getValue());
		}
        
		
	
	}
	
}
