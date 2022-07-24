package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MakeHashMap {

	/*	entrySet() 메서드는 key와 value의 값 모두 출력

	keySet() 메서드는 key의 값만 출력

	Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법*/

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("key01", "value01");
		map.put("key02", "value02");
		map.put("key03", "value03");
		map.put("key04", "value04");
		map.put("key05", "value05");

		// 방법 01 : entrySet()이  keySet() 보다 속도가 빠름 , entrySet()은 key와 value 모두가 필요할 경우 사용
		for (Entry<String, String> entry : map.entrySet()) { // Map.Entry<String, String>
			System.out.println("방법 01[key] : " + entry.getKey() + ", [value]:" + entry.getValue());
		}
		System.out.println("--------------END-----------------------------");
		// 방법 02 : keySet()   키의 값만 가지고 있다 ,  keySet()은 key 값만 필요할 경우 사용하는데 key값만 받아서 get(key)를 활용하여 value도 출력
		for (String key : map.keySet()) {   
			String value = map.get(key);
			System.out.println("방법 02[key] : " + key + ", [value]:" + value);
		}
		System.out.println("--------------END-----------------------------");
		// 방법 03 : entrySet().iterator()
		Iterator<Map.Entry<String, String>> iteratorE = map.entrySet().iterator();
		while (iteratorE.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("방법 03[key] : " + key + ", [value]:" + value);
		}
		System.out.println("--------------END-----------------------------");
		// 방법 04 : keySet().iterator()
		Iterator<String> iteratorK = map.keySet().iterator();
		while (iteratorK.hasNext()) {
			String key = iteratorK.next();
			String value = map.get(key);
			System.out.println("방법 04[key] : " + key + ", [value]:" + value);
		}
		System.out.println("--------------END-----------------------------");	
	}

}
