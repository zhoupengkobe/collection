package cn.bjsxt.gen01;
/**
 * �Զ��巺�ͣ������࣬���ͽӿڣ����ͷ�����ʹ�÷���
 * ���ӣ�һ��ѧ���ĳɼ������������������С�����ַ���----��δ���
 * Object ���Խ����������ͣ���Ϊ������̬
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
