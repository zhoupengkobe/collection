package cn.bjsxt.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * ����Map�Ļ����÷�
 * @author ko
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("����", new Wife("������"));
		map.put("����", new Wife("����"));
		
		map.remove("����");
		Wife w = (Wife) map.get("����");
		
		System.out.println(w.name);
		
	}

}


class Wife{
	String name;
	public Wife(String name){
		this.name = name;
	}
}
