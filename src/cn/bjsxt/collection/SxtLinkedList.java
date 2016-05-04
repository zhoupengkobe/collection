package cn.bjsxt.collection;

public class SxtLinkedList {
	
	private Node first;
	private Node last;
	private int size;
	
	

	private void add(Object obj) {
		Node n = new Node();

		if (first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else {
			//直接往last节点后增加新的节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			
			last = n;
			
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public static void main(String[] args) {
		SxtLinkedList list = new SxtLinkedList();
		
		list.add("aaaa");
		list.add("bbbb");
		System.out.println(list.size());
	}

}

