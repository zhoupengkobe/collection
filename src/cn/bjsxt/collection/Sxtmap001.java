package cn.bjsxt.collection;


/**
 * 自定义实现Map的功能！
 * 暂不完美，每次查的时候都要遍历一次数组，这样效率比较低，后面解决效率问题！
 * Map：存放键值对，根据键对象找对应的值对象，键不能重复！
 * @author ko
 *
 */
public class Sxtmap001 {
	
	SxtEntry[] arr = new SxtEntry[990];
	int size;
	
	public void put(Object key,Object value){
		SxtEntry e = new SxtEntry(key, value);
		//解决键值重复的处理
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				arr[i].value = value;
				return;
			}
		
		}
		
		arr[size++] = e;
	}
	
	public Object get(Object key){
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return arr[i].value;
			}
		
		}
		return null;
		
	}
	
	public boolean containsKey(Object key){
		for (int i = 0; i < size; i++) {
			if (arr[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean containsValue(Object value){
		for (int i = 0; i < size; i++) {
			if (arr[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Sxtmap001 m = new Sxtmap001();
		m.put("高琪", new Wife("杨幂"));
		m.put("高琪", new Wife("李四"));
		
		Wife w = (Wife) m.get("高琪");
		
		System.out.println(w.name);

	}

}


class SxtEntry{
	Object key;
	Object value;
	
	
	public SxtEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	
}
