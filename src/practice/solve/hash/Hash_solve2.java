package practice.solve.hash;

import java.util.HashMap;
import java.util.Map;

public class Hash_solve2 {
    public boolean solution(String[] phone_book) {
    	// 접두어가 다름 true, 접두어가 같음 false 
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	
    	for(int i=0; i < phone_book.length; i++) {
    		map.put(phone_book[i], i);
    	}
    	
    	System.out.println("map : " + map.toString());
    	
    	for(int i=0; i<phone_book.length; i++) {
    		for(int j=0; j < phone_book[i].length(); j++) {
    			if(map.containsKey(phone_book[i].substring(0, j))) {
    				return false;
    			}
    		}
    	}
    	
    	
    	
    	return true;
    	
    }
    
    public static void main(String[] args) {
    	
    	String[] phoneBookArr = {"123","456","789"};
    	
    	
    	//"119", "97674223", "1195524421"
    	//"123","456","789"
    	//"12","123","1235","567","88"
    	
    	Hash_solve2 s2 = new Hash_solve2();
    	System.out.println("answer : " + s2.solution(phoneBookArr));
    	
    }
}
