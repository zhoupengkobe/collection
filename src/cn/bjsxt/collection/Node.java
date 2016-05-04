package cn.bjsxt.collection;

//用来表示一个节点
public class Node{
	private Object previous;  //上一个
	private Object obj; //自己的值
	private Object next; //下一个
	
	public Node(){
		
	}
	
	public Node(Object previous, Object obj, Object next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	public Object getPrevious() {
		return previous;
	}
	public void setPrevious(Object previous) {
		this.previous = previous;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object next) {
		this.next = next;
	}
	
	
}