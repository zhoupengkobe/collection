package cn.bjsxt.gen01;
/**
 * 自定义泛型，泛型类，泛型接口，泛型方法，使用泛型
 * 例子：一个学生的成绩有三种情况，整数，小数，字符串----如何处理
 * Object 可以接受任意类型，因为发生多态
 * 
 *
 * @author ko
 *
 */
public class Student {
	
	private Object javase;
	private Object oracle;
	
	public Student(){
		
	}
	
	public Student(Object javase, Object oracle) {
		super();
		this.javase = javase;
		this.oracle = oracle;
	}
	public Object getJavase() {
		return javase;
	}
	public void setJavase(Object javase) {
		this.javase = javase;
	}
	public Object getOracle() {
		return oracle;
	}
	public void setOracle(Object oracle) {
		this.oracle = oracle;
	}
	
	
	
}
