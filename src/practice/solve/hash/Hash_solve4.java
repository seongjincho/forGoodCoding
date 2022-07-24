package practice.solve.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hash_solve4 {
   
	
//	문제 설명
//	스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
//
//	속한 노래가 많이 재생된 장르를 먼저 수록합니다.
//	장르 내에서 많이 재생된 노래를 먼저 수록합니다.
//	장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
//	노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때
//	, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
//
//	제한사항
//	genres[i]는 고유번호가 i인 노래의 장르입니다.
//	plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
//	genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
//	장르 종류는 100개 미만입니다.
//	장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
//	모든 장르는 재생된 횟수가 다릅니다.
//	입출력 예 설명
//	classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.
//
//	고유 번호 3: 800회 재생
//	고유 번호 0: 500회 재생
//	고유 번호 2: 150회 재생
//	pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.
//
//	고유 번호 4: 2,500회 재생
//	고유 번호 1: 600회 재생
//	따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.
//	
	
//			genres		
//			["classic", "pop", "classic", "classic", "pop"]
// 				0         1 	  2			3		   4	
//			plays
//			[500	  , 600	 , 150		, 800	   , 2500]	
//			return
//			[4,1,3,0,2]
					
    public int[] solution(String[] genres, int[] plays) {
        
//    	속한 노래가 많이 재생된 장르를 먼저 수록합니다.
//    	장르 내에서 많이 재생된 노래를 먼저 수록합니다.
//    	장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
//    	노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때
//    	, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        if(genres.length == plays.length) {
        	for (int i = 0; i < genres.length; i++) {
        		map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        	}
        }
        
        System.out.println("map : " + map.toString());
        
        List<String> list = new ArrayList<String>(map.keySet());

        System.out.println("(map.get(pop)).compareTo(map.get(classic)) : " + (map.get("pop")).compareTo(map.get("classic")) );
        System.out.println("(map.get(classic)).compareTo(map.get(pop)) : " + (map.get("classic")).compareTo(map.get("pop")) );
        
//        compareTo
//	    1. 숫자 비교
//	        기준값.compareTo(비교값);
//	        기준값 == 비교값
//	
//	        0 반환
//	        기준값 > 비교값
//	
//	        1 반환
//	        기준값 < 비교값
//	
//	        -1 반환
//        2. 문자 비교
//        같으면
//
//        0 반환
//        다르면
//
//        다른 문자의 개수만큼 리턴
//        근데 기준값과 비교값이 앞에서부터 동일한 문자가 나와야만 다른 문자 개수만큼 리턴이 가능
//        String str = "abcd";
//
//        str.compareTo("ab");
//        >> 4 - 2 = 2
//
//        str.compareTo("c");
//        >> -2
//        >> ?
//         
//
//        위 코드의 두번째 예제는 왜 -2인가?
//        기준값과 비교값이 앞에서부터 동일한 문자가 아니고 중간에 같은 문자일 경우 각각의 문자열에서 가장 낮은 아스키코드의 차이값을 리턴 하기 때문        
        
        
        System.out.println("bf list : " + list.toString());
        list.sort((value1, value2) -> (map.get(value2)).compareTo(map.get(value1))); // 이론 공부 필요 
        System.out.println("af list : " + list.toString());
        
        
        int first = 0;  // 배열[first]
        int second = 0; // 배열[second]
        int maxCount = 0;
        int tempCount = 0;
        
        List<Integer> bestlist = new ArrayList<>();
        
 
        //answer
        for (String genre : list) {
        	first = 0;
        	second = 0;
        	maxCount = 0;
        	//System.out.println("genre : " + genre);
        	// 첫번째 값 
        	for (int i = 0; i < genres.length; i++) {
				if(genre.equals(genres[i])) {
					//System.out.println(i + "  genres[i] : " + genres[i]);
					if(maxCount == 0){
						maxCount = plays[i];
						first = i;
					}else {
						tempCount = plays[i]; 
						if(maxCount < tempCount) {
							maxCount = tempCount;
							first = i;
						}
					}
					
					//System.out.println("1 maxCount : " + maxCount + " tempCount : " + tempCount +  " first : " + first); 
				}
			}
        	
        	maxCount = 0;
        	
        	// 두번째 값 
        	for (int i = 0; i < genres.length; i++) {
				if(genre.equals(genres[i])) {
					//System.out.println(i + "  genres[i] : " + genres[i]);
					if(maxCount == 0){
						maxCount = plays[i];
						second = i;
					}else {
						tempCount = plays[i]; 
						if(i !=  first && maxCount < tempCount) {
							maxCount = tempCount;
							second = i;
						}
					}
					
					//System.out.println("2 maxCount : " + maxCount + " tempCount : " + tempCount +  " second : " + second); 
				}
			}        	
        		
        	bestlist.add(first);
            //주의!!
            if(maxCount != 0) {
            	bestlist.add(second);
            }
		}
        
        
        //System.out.println("bestlist : " + bestlist);
        
        //answer
        
        int[] answer = new int[bestlist.size()];
        
        for (int i = 0; i < bestlist.size(); i++) {
        	answer[i] = bestlist.get(i);
		}
        
        
        
        
        return answer;
    }
    
    public static void main(String[] args) {
    	String[] genres = {"classic", "pop", "classic", "classic", "pop"};
    	int[] plays = {500, 600, 150, 800, 2500};	
    	
    	Hash_solve4 s4 = new Hash_solve4();
    	
    	System.out.println(Arrays.toString(s4.solution(genres, plays)));
    	
    }
}
