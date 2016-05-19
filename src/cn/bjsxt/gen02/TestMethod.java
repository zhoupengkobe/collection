package cn.bjsxt.gen02;

import com.sun.xml.internal.ws.Closeable;

/**
 * 泛型方法<>  返回类型前面
 * 只能访问对象的信息，不能修改信息
 * @author ko
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("a"); //T -->String 

	}
	
	//泛型方法
	public static <T> void test(T a){
		System.out.println(a);
	}
	// extends <=  表明T是closeable接口 的实现类  T... a 表示可变参数
	public static <T extends Closeable> void test(T... a){
		for (T t : a) {
			if (t!=null) {
				t.close();
			}
		}
	}

}
