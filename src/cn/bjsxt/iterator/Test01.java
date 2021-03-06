package cn.bjsxt.iterator;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class Test01 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		//通过索引遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Iterator iter2 = list.iterator();iter2.hasNext();){
			String str = (String) iter2.next();
			System.out.println(str);
			iter2.remove();
		}
		
		System.out.println(list.size()+"************");
		
		Set set = new HashSet();
		set.add("高1");
		set.add("高2");
		set.add("高3");
		//通过迭代器遍历List
		Iterator iter = set.iterator();//返回一个迭代器进行遍历
//使用while循环遍历		
		while (iter.hasNext()) {
			String str = (String) iter.next();
			
			System.out.println(str);
			
		}
//使用for循环进行遍历
//		for (Iterator iter = set.iterator();iter.hasNext();) {
//			String str = (String) iter.next();
//			System.out.println(str);
//		}
		
	}

}
