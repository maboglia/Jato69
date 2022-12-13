package collezioni;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProvaMap {

	public static void main(String[] args) {
		//   Set   Collection 
		Map<String, String> capitali = new HashMap<>();
		
		capitali.put("Francia", "Parigi");
		capitali.put("Germania", "Bonn");
		capitali.put("Italia", "Roma");
		
		System.out.println(capitali.get("Francia"));
		
		Set<String> stati = capitali.keySet();
		Collection<String> valori = capitali.values();
		
		for (String stato : stati) {
			System.out.println(stato + ": " +  capitali.get(stato));
		}
		
		valori.forEach(System.out::println);
		

		for (Entry<String, String> coppia : capitali.entrySet()) {
			System.out.println(coppia.getKey());
			System.out.println(coppia.getValue());
		}
		
	}

}
