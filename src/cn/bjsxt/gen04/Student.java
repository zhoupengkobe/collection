package cn.bjsxt.gen04;
/**
 * ? ��ʹ��
 * ?���Ͳ�����ʹ��ʱȷ������
 * ��ʹ�ã���������|���������ϣ������������ʹ��ʱ
 * �� extend :<=���� ָ������
 * �� super :>= ���� ָ������Ϊ�������
 * @author ko
 *
 * @param <T>
 */
public class Student<T> {
	T score;
	
	
	public static void main(String[] args) {
		Student<?> stu = new Student<String>();
		test(new Student<Integer>());
		test2(new Student<Apple>());
		
		//test3(new Student<Apple>());//����û�ж�̬
	}
	
	public static void test(Student<?> stu){
		
	}
	
	public static void test3(Student<Fruit> stu){
		
	}
	public static void test2(Student<? extends Fruit> stu){
		
	}
}
