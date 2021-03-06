package cn.bjsxt.map;

import java.util.ArrayList;
import java.util.List;

/**
 * 班级
 * @author ko
 *
 */
public class ClassRoom {
	private String no;
	private List<Student> stus;//学生列表
	private double total;//总分
	
	
	/**
	 * @param no
	 * @param stus
	 * @param total
	 */
	public ClassRoom(String no) {
		this();
		this.no = no;
		
	}
	
	public ClassRoom() {
		stus = new ArrayList<Student>();
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

}
