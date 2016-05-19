package cn.bjsxt.gen01;
/**
 * 获取值：
 * 1.强制类型转换
 * 2.类型检查：避免转换错误 java.lang.ClassCastException
 * @author ko
 *
 */
public class APP {
	/**
	 * 获取值：强制类型转换
	 * @param args
	 */
	public static void main(String[] args) {
		
		Object obj = 80;
		int score = (int)obj;  //Object -->integer-->自动拆箱
		System.out.println(score);
		
		//存入整数 int -->Integer-->Object
		Student stu = new Student(80,90);
		//stu.getJavase();
		int javaseScore = (Integer)stu.getJavase();
		String oracleScore = null;
		if (stu.getOracle() instanceof String) {
			
			oracleScore = (String)stu.getOracle();
		}
		
		System.out.println("分数为："+javaseScore+","+oracleScore);
	}

}
