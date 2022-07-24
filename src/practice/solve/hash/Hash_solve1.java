package practice.solve.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Hash_solve1 {
	
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        
	        for (String player : participant) {
	        	map.put(player, map.getOrDefault(player, 0) + 1);
			}

	        System.out.println("participant map : " + map.toString());
	        
	        for (String winner : completion) {
	        	map.put(winner, map.get(winner) - 1);
			}
	        
	        System.out.println("completion map : " + map.toString());
	        
	        Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
	        
	        while(iter.hasNext()){
	            Map.Entry<String, Integer> entry = iter.next();
	            if (entry.getValue() != 0){
	                answer = entry.getKey();
	                break;
	            }
	        }
	        
	        return answer;
	    }

	
	public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
		
		Hash_solve1 s1 = new Hash_solve1();
		System.out.println("answer : " + s1.solution(participant,completion)); 
		
	}
}
