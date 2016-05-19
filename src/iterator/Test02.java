package iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;


public class Test02 {

	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("aa", "aaaa");
		map.put("bb", "bbbb");
		//遍历Map的第一种方式		
		Set key = map.keySet();
		
		for (Iterator iter = key.iterator(); iter.hasNext();) {
			String keyStr = (String) iter.next();
			
			System.out.println(keyStr+"---"+map.get(keyStr));
			
		}
		
		//遍历Map的第二种方式
		Set<Entry> set2 = map.entrySet();
		
		for (Iterator iterator = set2.iterator(); iterator.hasNext();) {
			Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey()+"---"+entry.getValue());
		}
	}

}
