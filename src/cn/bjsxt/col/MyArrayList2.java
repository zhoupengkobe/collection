package cn.bjsxt.col;

import java.util.Iterator;

/**
 * 简化迭代器,加入接口提供方法
 * hasNext
 * next
 * 
 * @author ko
 *
 */
public class MyArrayList2 {
	private String[] elem = {"a","b","c","d","e","f","g"};
	private int size = elem.length;
	
	private class MyIt implements Iterator<String> {

		private int cursor = -1;

		/**
		 * 判断是否存在下一个元素
		 * 
		 * @return
		 */
		public boolean hasNext() {
			return cursor + 1 < size;
		}

		/**
		 * 获取下一个元素
		 * 
		 * @param args
		 */
		public String next() {
			cursor++;// 移动一次
			return elem[cursor];
		}

		// 删除元素
		public void remove() {
				//没有实现
		}

	}
	
	public Iterator<String> iterator(){
		return new MyIt();
	}
	
	public static void main(String[] args) {
		MyArrayList2 list = new MyArrayList2();
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
