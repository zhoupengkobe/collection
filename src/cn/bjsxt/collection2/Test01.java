package cn.bjsxt.collection2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) throws Exception {
		Employee e = new Employee(0301,"高琪",3000,"项目部","2007-10");
		Employee e2 = new Employee(0302,"马士兵",4000,"教学部","2008-10");
		Employee e3 = new Employee(0303,"裴新",5000,"市场部","2009-10");
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e);
		list.add(e2);
		list.add(e3);
		
		printEmpName(list);
	}
	
	public static void printEmpName(List<Employee> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
	

}
