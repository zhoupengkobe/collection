package cn.bjsxt.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ����Set�ĳ��÷���
 * @author ko
 *
 */
public class TestSet {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add("aaa");
		set.add("bbb");
		set.add(new String("aaa"));
		
		System.out.println(set.size());
		
		System.out.println(set.contains("aaa"));
		
		set.remove("aaa");
		
		

	}

}
