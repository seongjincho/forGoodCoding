package practice.programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SolveProgrammers1 {

	
	
//  완주하지 못한 선수
//	문제 설명
//	수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//	마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//	제한사항
//	마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//	completion의 길이는 participant의 길이보다 1 작습니다.
//	참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//	참가자 중에는 동명이인이 있을 수 있습니다.

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String player : participant) {
        	System.out.println("participant player : " + player);
        	map.put(player, map.getOrDefault(player, 0) + 1); 
        	// => map.getOrDefault(player, 0) 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환한다.
        	System.out.println("participant map  : " + map.toString());
        }
        
        for (String player : completion) {
        	System.out.println("completion player : " + player);
        	map.put(player, map.get(player) - 1);
        	System.out.println("completion map  : " + map.toString());
        }

            Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
    
    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        SolveProgrammers1 sol = new SolveProgrammers1();
        System.out.println(sol.solution(part, comp));
    }

    
 

	
}
