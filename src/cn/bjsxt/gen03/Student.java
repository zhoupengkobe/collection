package cn.bjsxt.gen03;
/**
 * ���͵Ĳ���
 * 1���̳�|ʵ������ ��ָ������
 * 2��ʹ��ʱ��ָ������
 * ͳһObject�Դ�
 * 1����������������ʹ��Object
 * 2.����ȫ��ͬ��Object,�������������ͼ��
 * @author ko
 *
 * @param <T>
 */
public class Student<T> {
	private T javaScore;
	private T oracleScore;
	
	// ��������ʱ����ʹ�� ��̬����|��̬������
	//private static T1 test;
	
	public T getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(T javaScore) {
		this.javaScore = javaScore;
	}
	public T getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(T oracleScore) {
		this.oracleScore = oracleScore;
	}
	

	public static void main(String[] args) {
		Student stu1 = new Student();
		//��������ʹ��Object
		Student<Object> stu = new Student<Object>();
		//stu.setJavaScore("af");//��Object�Դ�
		
		test(stu1);//stu1 �൱��Object���ǲ���ȫ��ͬ��Object
		//�������������ͼ��
		//test(stu);
		test1(stu1);
		test1(stu);
	}
	
	public static void test(Student<Integer> a ){
		
	}
	
	public static void test1(Student<?> a) {
		
	}
	
}
