package cn.bjsxt.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * this is a cat and that is a mice and where is the food?
 * ͳ��ÿ�����ʳ��ֵĴ���
 * 
 * �洢��Map��
 * key :String 
 * value : �Զ�������
 * 
 * "�ּ�" ˼·
 * 1.Ϊ����key��������
 * ֮�������д�Ŷ�Ӧ��value
 * 2.��һ�δ��������������ֵvalue
 * �ڶ���֮��ֱ��ʹ���������
 * @author ko
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		String str = "this is a cat and that is a mice and where is the food";
		//�ָ��ַ���
		String[] strArray = str.split(" ");
		//�洢��Map��
		Map<String, Letter> letters = new HashMap<String,Letter>();
		
		for (String temp : strArray) {
			//  Ϊ���е�key��������
			if (!letters.containsKey(temp)) {
				letters.put(temp, new Letter());
			}
			//֮�������д�Ŷ�Ӧ��value
			Letter col = letters.get(temp);//ֱ��ʹ������
			col.setCount(col.getCount()+1);
		}	
		
		//���Map��ֵ
		Set<String> keys = letters.keySet();
		for (String key : keys) {
			Letter col = letters.get(key);
			System.out.println("��ĸ"+key+",����"+col.getCount());
		}
	}

}
