package cn.bjsxt.gen03;
/**
 * /**
 * ����Ϊ������
 * 1.����
 * 2.����
 * 
 * Ҫôͬʱ������Ҫô������ڵ��ڸ��������
 * ����������������෺��
 * 1.��������
 * �����У��游�����
 * �����У����������
 * 2.������д��
 * �游�ඨ
 * @author ko
 *
 * @author ko
 *
 * @param <T>
 */
public abstract class Father<T,T1> {
	T name;
	public abstract void test(T t);
}

/**
 * ��������ʱָ����������
 * ��������Ϊ��������
 * ����ͬ��
 * @author ko
 *
 */

class Child1 extends Father<String, Integer>{
	String t2;
	@Override
	public void test(String t) {
		
	}
	
}
/**
 * ����Ϊ�����࣬������ʹ��ʱȷ��
 * @author ko
 *
 * @param <T1>
 * @param <T>
 * @param <T3>
 */
class Child2<T1,T,T3> extends Father<T, T1>{
	T1 t2;

	@Override
	public void test(T t) {
		
	}
	
}
/**
 * ����Ϊ���ͣ����಻ָ�����ͣ����͵Ĳ�����ʹ��Object�滻
 * @author ko
 *
 * @param <T1>
 * @param <T2>
 */
class Child3<T1,T2> extends Father{
	T1 name2;

	@Override
	public void test(Object t) {
		
	}
	
}
/**
 * �����븸��ͬʱ����
 * @author ko
 *
 */
class Child4 extends Father{
	String name;

	@Override
	public void test(Object t) {
		
	}
	
}

/**
 * �����������������ʹ�÷���
 */
//class Child5 extends Father<T, T1>{
//	String name;
//
//	@Override
//	public void test(T t) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}