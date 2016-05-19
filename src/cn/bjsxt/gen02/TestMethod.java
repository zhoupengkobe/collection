package cn.bjsxt.gen02;

import com.sun.xml.internal.ws.Closeable;

/**
 * ���ͷ���<>  ��������ǰ��
 * ֻ�ܷ��ʶ������Ϣ�������޸���Ϣ
 * @author ko
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("a"); //T -->String 

	}
	
	//���ͷ���
	public static <T> void test(T a){
		System.out.println(a);
	}
	// extends <=  ����T��closeable�ӿ� ��ʵ����  T... a ��ʾ�ɱ����
	public static <T extends Closeable> void test(T... a){
		for (T t : a) {
			if (t!=null) {
				t.close();
			}
		}
	}

}
