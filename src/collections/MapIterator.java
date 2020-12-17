package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIterator {

	public static void main(String[] args) {
		
		HashMap<Integer , String> hm  =  new HashMap<Integer  , String> ();
		
		hm.put(2, "Jagadeesh");
		hm.put(21, "Abcder");
		hm.put(25, "Royal");
		hm.put(6, "Ramu");
		
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
		}

		
        Iterator<Map.Entry<Integer , String>> it1 = hm.entrySet().iterator();
		
		while(it1.hasNext()) {
			Map.Entry<Integer , String> mp = it1.next();
			System.out.println(mp.getValue());
		}

		
	}

}
