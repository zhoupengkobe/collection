package cn.bjsxt.collection;

import java.util.ArrayList;

/**
 * �Լ�ʵ��һ��ArrayList���������Ǹ��õ����ArrayList��ĵײ�ṹ
 * @author ko
 *
 */
public class SxtArrayList {  
	
	private Object[] elementData;
	
	private int size;
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public SxtArrayList() {
		this(10);
	}
	
	public SxtArrayList(int initialCapacity) {
		if (initialCapacity<0) {
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		elementData = new Object[initialCapacity];
	}
	
	
	public void add(Object obj) {
		//�������ݺ����ݵĿ���
		if (size==elementData.length) {
			Object[] newArray = new Object[size*2+1];//����һ��������
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);// ʹ��arraycopy�������ϵ�����copy���µ�����
			elementData = newArray;
			/**
			 * ���������һ�飬��ÿ��ֵ����һ����µ�����
			 */
//			for (int i = 0; i < elementData.length; i++) {
//				newArray[i] = elementData[i];
//			}
		}
		
		elementData[size++] = obj;
	}
	
	public Object get(int index){
		rangeCheck(index);
		
		return elementData[index];
	}
	
	
	public void remove(int index) {
		//ɾ��ָ��λ�õĶ���
		rangeCheck(index);
		int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                             numMoved);
        elementData[--size] = null; // clear to let GC do its work
	}
	/**
	 * ɾ����������֮��ͬ�Ķ���
	 * @param obj
	 */
	public void remove(Object obj){
		for (int i = 0; i < size; i++) {
			if (get(i).equals(obj)) {   //ע�⣺�ײ���õ�equals����������==
				remove(i);
			}
		}
	}
	
	public Object set(int index,Object obj){
		rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = obj;
        return oldValue;
	}
	
	public void add(int index,Object obj) {
		rangeCheck(index);
		//�������ݺ����ݵĿ���
		ensureCapacity();
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		
		elementData[index] = obj;
		size++;
	}
	
	private void ensureCapacity() {
		//�������ݺ����ݵĿ���
		if (size==elementData.length) {
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
	}
	
	/**
	 * ��������Ƿ�ϸ�
	 * @param index
	 */
	private void rangeCheck(int index) {
		if (index>=size) {
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		SxtArrayList list = new SxtArrayList(3);
		list.add("333");
		list.add("444");
		list.add("555");
		list.add("666");
		list.add("777");
		list.add("333");	
		System.out.println(list.size());
		System.out.println(list.get(6));
	}

}
