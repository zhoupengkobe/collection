package cn.bjsxt.collection;

public class SxtLinkedList {
	
	private Node first;
	private Node last;
	private int size;
	
	

	public void add(Object obj) {
		Node n = new Node();

		if (first==null) {
			n.setPrevious(null);
			n.setObj(obj);
			n.setNext(null);
			
			first = n;
			last = n;
		}else {
			//ֱ����last�ڵ�������µĽڵ�
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
	
	private void rangCheck(int index) {
		if (index<0||index>=size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Object get(int index){ //2
		//index Խ����δ���
		rangCheck(index);
		//0 1 2 3 4 
		Node temp = node(index);
		if (temp!=null) {
			
			return temp.obj;
		}
		return null;
	}
	
	public Node node(int index) {
		Node temp = null;
		if (first!=null) {
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		}
		return temp;
	}
	
	public void remove(int index) {
		Node temp = node(index);
		if (temp!=null) {
			Node up = temp.previous;
			Node down = temp.next;
			
			up.next = down;
			down.previous = up;
		}
		
		size--;
	}
	
	
	public void add(int index,Object obj) {
		Node temp = node(index);
		Node newNode = new Node();
		newNode.obj = obj;
		
		if (temp!=null) {
			Node up = temp.previous;
			up.next = newNode;
			newNode.previous = up;
			newNode.next = temp;
			temp.previous = newNode;
			
			size++;
		}
	}
	
	public static void main(String[] args) {
		SxtLinkedList list = new SxtLinkedList();
		
		list.add("aaaa");
		list.add("bbbb");
		list.add(1, "dddd");
		list.add("cccc");
//		list.remove(1);
		System.out.println(list.get(1));
	}

}

