package cn.bjsxt.collection;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class TestEquals {

	public static void main(String[] args) {
		
		List list = new ArrayList();
//		String s1 = new String("aaa");
//		String s2 = new String("aaa");
		
		Integer s1 = new Integer(243);
		Integer s2 = new Integer(243);
		
		list.add(s1);
		list.add(s1);
		System.out.println(list.size());
		
		Map map = new HashMap();
		//�������ظ�
		map.put(s1, "AAAA");
		map.put(s2, "BBBBBB");
//		System.out.println(map.get("aaa"));
		System.out.println(map.get(243));

	}

}
