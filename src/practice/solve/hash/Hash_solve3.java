package practice.solve.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_solve3 {
   
    public int solution(String[][] clothes) {
        HashMap<String, Integer> closthesMap = new HashMap<String, Integer>();
        
        String type = "";
        for (String[] item : clothes) {
			System.out.println("strings : " + Arrays.toString(item));
			type = item[1]; // headgear
			closthesMap.put(type, closthesMap.getOrDefault(type, 1) + 1); // 옷 종류별로 갯수 체크  
		}
    	
        System.out.println("closthesMap : " + closthesMap.toString());
    	
    	int answer = 0;
        
    	//closthesMap.entrySet()
    	//answer += closthesMap.size();
//    	[yellowhat, headgear]
//    	[green_turban, headgear]
    	
//    	[bluesunglasses, eyewear]
    	
    	// headgear => yellowhat, green_turban, x   => 3 
        // eyewear =>  bluesunglasses , x  => 2   
    	// 3*2 = 6 가지가 최대 경우의 수가 나타난다 하지만 모두 안입는 상태  1가지를 빼줘야 함 
    	Iterator<Map.Entry<String, Integer>> iter  = closthesMap.entrySet().iterator();
    	
    	int temp = 0;
    	while(iter.hasNext()) {
    		Map.Entry<String, Integer> entry = iter.next();
    		temp = entry.getValue();
    		System.out.println("temp : " + temp);
    		if(answer != 0) {
    			answer *= temp;
    		}else {
    			answer = temp;
    		}
    		System.out.println("answer : " + answer);
    	}
    	
    	answer = answer - 1;
       
        
        
        return answer;

    }
    
    public static void main(String[] args) {
    	
    	
    	String[][] clothes = {
    			{"yellowhat", "headgear"}
    			, {"bluesunglasses", "eyewear"}
    			, {"green_turban", "headgear"}
    	};
    	
		//{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}  => 5
    	//{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"} => 3
    	
    	System.out.println("size : " + clothes.length); //  3 
    	
    	
    	for (int i = 0; i < clothes.length; i++) {
    		for (int j = 0; j < 2; j++) {
				System.out.println("i : " + i + " j : " + j + " arrayValue : " + clothes[i][j]);
			}
		}
    	
    	
    	Hash_solve3 s3 = new Hash_solve3();
    	
    	System.out.println(s3.solution(clothes));
    	
    }
}
