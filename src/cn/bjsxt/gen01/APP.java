package cn.bjsxt.gen01;
/**
 * ��ȡֵ��
 * 1.ǿ������ת��
 * 2.���ͼ�飺����ת������ java.lang.ClassCastException
 * @author ko
 *
 */
public class APP {
	/**
	 * ��ȡֵ��ǿ������ת��
	 * @param args
	 */
	public static void main(String[] args) {
		
		Object obj = 80;
		int score = (int)obj;  //Object -->integer-->�Զ�����
		System.out.println(score);
		
		//�������� int -->Integer-->Object
		Student stu = new Student(80,90);
		//stu.getJavase();
		int javaseScore = (Integer)stu.getJavase();
		String oracleScore = null;
		if (stu.getOracle() instanceof String) {
			
			oracleScore = (String)stu.getOracle();
		}
		
		System.out.println("����Ϊ��"+javaseScore+","+oracleScore);
	}

}
