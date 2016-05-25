package cn.bjsxt.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ����һ��student�࣬���ԣ�name ������classNumber  ��ţ�score �ɼ�
 * ���ڽ�����Student�������List����ͳ�Ƴ�ÿ���༶���ֺܷ�ƽ���֣��ֱ��ӡ������
 * ����������˼ά���
 * @author ko
 *
 */
public class MapDemo03 {
	/**
	 * ���ڽ�����Student�������List
	 * @param list
	 */
	public static void exam(List<Student> list){
		list.add(new Student("a","001",80));
		list.add(new Student("b","001",80));
		list.add(new Student("a","002",80));
		list.add(new Student("c","003",80));
		list.add(new Student("d","003",80));
	}
	
	/**
	 * ͳ�Ʒ���
	 * @param args
	 */
	public static void count(Map<String, ClassRoom> rooms,List<Student> list){
		for (Student stu : list) {
			String no = stu.getNo();
			double score = stu.getScore();
			//���ݰ༶��Ų鿴Map�Ƿ���ڸð༶���ּ�˼·
			ClassRoom room = rooms.get(no);
			if (null==room) {//��һ��
				room = new ClassRoom(no);
				rooms.put(no, room);
			}
			//�洢�ܷ�
			room.setTotal(room.getTotal()+score);
			room.getStus().add(stu);//����ѧ��
		}
	}
	/**
	 * ��ӡ�ֺܷ�ƽ����
	 * @param rooms
	 */
	public static void printScore(Map<String, ClassRoom> rooms){
		Set<Map.Entry<String, ClassRoom>> entrySet = rooms.entrySet();
		Iterator<Map.Entry<String, ClassRoom>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, ClassRoom> entry = it.next();
			ClassRoom room = entry.getValue();
			double avg = room.getTotal()/room.getStus().size();
			System.out.println("���Ϊ��"+room.getNo()+",�ܷ�"+room.getTotal()+"��ƽ����"+avg);
			
		}
	}
	
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		exam(list);
		//ͳ��
		Map<String, ClassRoom> rooms = new HashMap<String,ClassRoom>();
		count(rooms,list);
		
		//��ӡ�ܷ���ƽ����
		printScore(rooms);
	}

}
