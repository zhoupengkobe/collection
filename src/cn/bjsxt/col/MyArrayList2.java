package cn.bjsxt.col;

import java.util.Iterator;

/**
 * �򻯵�����,����ӿ��ṩ����
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
		 * �ж��Ƿ������һ��Ԫ��
		 * 
		 * @return
		 */
		public boolean hasNext() {
			return cursor + 1 < size;
		}

		/**
		 * ��ȡ��һ��Ԫ��
		 * 
		 * @param args
		 */
		public String next() {
			cursor++;// �ƶ�һ��
			return elem[cursor];
		}

		// ɾ��Ԫ��
		public void remove() {
				//û��ʵ��
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
