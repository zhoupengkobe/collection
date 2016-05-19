package cn.bjsxt.collection2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {

	public static void main(String[] args) {
		//一个Map对象对应一行记录；
		Map map = new HashMap();
		map.put("id", 0301);
		map.put("name", "高琪");
		map.put("salary", 3000);
		map.put("department", "项目部");
		map.put("hireDate", "2007-10");
		
		Map map2 = new HashMap();
		map2.put("id", 0302);
		map2.put("name", "马士兵");
		map2.put("salary", 4000);
		map2.put("department", "教学部");
		map2.put("hireDate", "2008-11");
		
		Map map3 = new HashMap();
		map3.put("id", 0303);
		map3.put("name", "裴新");
		map3.put("salary", 5000);
		map3.put("department", "市场部");
		map3.put("hireDate", "2009-12");
		
		List<Map> list = new ArrayList<Map>();
		
		list.add(map);
		list.add(map2);
		list.add(map3);
		
		printEmpName(list);
	}
	
	public static void printEmpName(List<Map> list) {
		for (int i = 0; i < list.size(); i++) {
			Map tempmap = list.get(i);
			System.out.println(tempmap.get("name")+"--"+tempmap.get("salary"));
		}
		
	}

}
