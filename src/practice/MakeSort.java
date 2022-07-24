package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MakeSort {

	public static void main(String[] args) {
		 
		//1. Collections.sort()
//		Collections.sort(list);
//		ArrayList를 오름차순으로 정렬합니다.
//
//		Collections.sort(list, Collections.reverseOrder());
//		Collections.sort()의 2번째 파라미터로
//		내림차순 정렬을 나타내는 Comparator를 전달해서,
//		ArrayList를 내림차순으로 정렬하였습니다.
//
//		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
//		String.CASE_INSENSITIVE_ORDER 를 전달하면, 대소문자 구분없이 오름차순으로 정렬됩니다.
//		여기서 'a'와 'A'는 같은 순위로 취급되므로, 원래의 순서를 유지합니다.
//
//		Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
//		대소문자 구분없이, 내림차순으로 정렬합니다.
		
		
        // ArrayList 준비
        ArrayList<String> list = new ArrayList<>(Arrays.asList("C", "A", "B", "a"));
        System.out.println("1.원본 : " + list); // [C, A, B, a]
 
        // 오름차순으로 정렬
        Collections.sort(list);
        System.out.println("1.오름차순 : " + list); // [A, B, C, a]
 
        // 내림차순으로 정렬
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("1.내림차순 : " + list); // [a, C, B, A]
 
        // 대소문자 구분없이 오름차순
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
        System.out.println("1.대소문자 구분없이 오름차순 : " + list); // [a, A, B, C]
 
        // 대소문자 구분없이 내림차순
        Collections.sort(list, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("1.대소문자 구분없이 내림차순 : " + list); // [C, B, a, A]
        
        
        
//        2. List.sort() - Java 8이후
//        default void sort(Comparator<? super E> c)
//        Java 8 이후부터는 List에서는 sort() 메소드를 호출하여 정렬할 수 있습니다.
        
//        오름차순/내림차순/대소문자 구분없이 정렬하기

            // ArrayList 준비
            System.out.println("2.원본 : " + list);  // [C, A, B, a]
     
            // 오름차순으로 정렬
            list.sort(Comparator.naturalOrder());
            System.out.println("2.오름차순 : " + list);  // [A, B, C, a]
     
            // 내림차순으로 정렬
            list.sort(Comparator.reverseOrder());
            System.out.println("2.내림차순 : " + list); // [a, C, B, A]
            
            // 대소문자 구분없이 오름차순 정렬
            list.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.println("2.대소문자 구분없이 오름차순 : " + list); // [a, A, B, C]
            
            // 대소문자 구분없이 내림차순 정렬
            list.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
            System.out.println("2.대소문자 구분없이 내림차순 : " + list); // [C, B, a, A]
            
//        Collections 객체를 사용하는 대신
//        List객체의 sort()메소드를 사용하여 정렬하였습니다.
//        sort()의 파라미터로 Comparator를 넘겨주는데, 앞의 예제와 달리
//        Comparator 객체에서 Comparator를 가져와서 넘겨주었습니다.
        
            Map<String, Integer> map = new HashMap<String, Integer>();  
            map.put("hiphop", 2500);
            map.put("classic", 1450);
            map.put("pop", 3100);
            
            
            List<String> mList = new ArrayList<String>(map.keySet());
            
           // System.out.println("mList 1 : " + mList.toString());
            
            //mList.sort((value1, value2) -> (map.get(value2)).compareTo(map.get(value1))); 
            // Value 기준으로 내림차순 정렬.
            mList.sort((value1, value2) -> map.get(value2) - map.get(value1));
            System.out.println("==내림차순 정렬==");
            System.out.println("mList 내림차순 : " + mList.toString());
            // Value 기준으로 오름차순 정렬.
            System.out.println("==오름차순 정렬==");
            mList.sort((value1, value2) -> map.get(value1) - map.get(value2));
            System.out.println("mList 오름차순 : " + mList.toString());
        
            //System.out.println("mList 2 : " + mList.toString());
        
    }	
	
}
