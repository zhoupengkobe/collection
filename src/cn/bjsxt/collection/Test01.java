package cn.bjsxt.collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * ����List�еĻ�������
 * @author ko
 *
 */
public class Test01 {
	public static void main(String[] args) {
	
		List list = new ArrayList();
		// ArrayList : �ײ�ʵ�������飬�̲߳���ȫ��Ч�ʸߡ����ԣ���ѯ�죬�޸ģ����룬ɾ������
		// LinkedList: �ײ�ʵ���������̲߳���ȫ��Ч�ʸߡ����ԣ���ѯ�����޸ģ����룬ɾ���죻
		//Vector�����ϰ�ȫ��Ч�ʵͣ�
		
		
		
		list.add("aaaa");
		list.add(new Date());
		list.add(new Dog());
		list.add(1234);//��װ����Զ�װ��
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
//		list.remove("aaaa");
		
//		list.remove(new Date());     //hashcode �� equals   �������new Date() ����������
//		System.out.println(list.size());
		
		System.out.println(list.size());
		
		List list2 = new ArrayList();
		
		list2.add("bbb");
		list2.add("ccc");
		
		
		list.add(list2);
		
		//��˳��Ĳ���
		
		String str = (String) list.get(0);
		
		System.out.println(str);
		
		list.set(1, "balabala");
		list.remove(0);
		
		
	}

}


class Dog{
	
}
