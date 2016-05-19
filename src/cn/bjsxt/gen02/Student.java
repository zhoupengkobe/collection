package cn.bjsxt.gen02;
/**
 * �����ࣺ����ʱʹ�÷���
 * ��ĸ��
 * T Type ��ʾ����.
 * K  V  �ֱ��ʾ��ֵ�е�Key Value
 * E ����Element��
 * ʹ��ʱȷ������
 * ע�⣺
 * 1.����ֻ��ʹ���������ͣ�����ʹ�û������͡�
 * 2.����������ʱ����ĸ������ʹ�þ�̬���Ի��߾�̬������
 * @author ko
 *
 * @param <T>
 */
public class Student<T1,T2> {
	
	private T1 javaScore;
	private T2 oracleScore;
	
	//��������ʱ����ʹ�þ�̬����|��̬������
	//private static T2 oracleSoure;
	
	public T1 getJavaScore() {
		return javaScore;
	}



	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}



	public T2 getOracleScore() {
		return oracleScore;
	}



	public void setOracleScore(T2 oracleScore) {
		this.oracleScore = oracleScore;
	}



	public static void main(String[] args) {
		//ʹ��ʱָ�����ͣ��������ͣ�
		Student<String, Integer> stu = new Student<String,Integer>();
		//1.��ȫ�����ͼ��
		stu.setJavaScore("����");
		//2.ʡ�ģ�����ת��
		Integer it = stu.getOracleScore();   //Ҳ����ʹ��int���գ���Ϊ���Զ����䡣
	}

}
