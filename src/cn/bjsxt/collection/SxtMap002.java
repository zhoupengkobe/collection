package cn.bjsxt.collection;

import java.util.LinkedList;

/**
 * �Զ���Map��������
 * 1.��߲�ѯ��Ч��
 * @author ko
 *
 */
public class SxtMap002 {
	
	LinkedList[] arr = new LinkedList[999];//Map�ĵײ�ṹ���ǣ�����+����
	int size;
	
	public void put(Object key,Object value){
		SxtEntry e = new SxtEntry(key, value);
		
		int a = key.hashCode()%arr.length;
		if (arr[a]==null) {
			LinkedList list = new LinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			LinkedList list = arr[a];

			for (int i = 0; i < list.size(); i++) {
				SxtEntry e2 = (SxtEntry) list.get(i);
				if (e2.key.equals(key)) {
					e2.value = value;//��ֵ�ظ�ֱ�Ӹ���
					return;
				}
			}
			
			arr[a].add(e);
		}
	}
	
	public Object get(Object key) {
//		return arr[key.hashCode()%999];
		int a = key.hashCode()%arr.length;
		if (arr[a]!=null) {
			LinkedList list = arr[a];
			for (int i = 0; i < list.size(); i++) {
				SxtEntry e = (SxtEntry) list.get(i);
				if (e.key.equals(key)) {
					return e.value;
				}
			}
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {
		SxtMap002 m = new SxtMap002();
		m.put("����", new Wife("����"));
		m.put("����", new Wife("����"));
		
		Wife w = (Wife) m.get("����");
		
		System.out.println(w.name);
	}

}
