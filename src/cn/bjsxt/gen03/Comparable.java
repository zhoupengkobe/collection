package cn.bjsxt.gen03;
/**
 * ���ͽӿڣ���̳�ͬ��
 * ��д�����游�����
 * @author ko
 *
 * @param <T>
 */
public interface Comparable<T> {
	void comapre(T t);
}
//��������ָ����������

class Comp implements Comparable<Integer>{

	@Override
	public void comapre(Integer t) {
		// TODO Auto-generated method stub
		
	}
	
}

//����
class Comp1 implements Comparable{

	@Override
	public void comapre(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

//������������෺��
class Comp2 implements Comparable{

	@Override
	public void comapre(Object t) {
		// TODO Auto-generated method stub
		
	}
	
}

//���෺��>=���෺��
class Comp3<T> implements Comparable<T>{

	@Override
	public void comapre(T t) {
		// TODO Auto-generated method stub
		
	}
	
}
//���෺�ͣ������������
