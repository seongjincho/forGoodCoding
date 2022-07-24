package practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class test {

	// 완전탐색,  dfs/bfs , 시뮬레이션(구현), 큐, 스택, 우선순위 큐 , 해시맵
	
	public static void main(String[] args) {


        Stack<Integer> s = new Stack<>();
        /*
			스택(Stack)은 한 쪽 끝에서만 자료를 넣거나 뺄 수 있는 선형 구조로 후입선출(LIFO - Last In First Out)로 되어 있다.
			자료를 넣는 것을 '밀어넣는다' 하여 푸쉬(push)라고 하고 반대로 넣어둔 자료를 꺼내는 것을 팝(pop)이라고 하는데
			, 이때 꺼내지는 자료는 가장 최근에 푸쉬한 자료부터 나오게 된다. 이처럼 나중에 넣은 값이 먼저 나오는 것을 LIFO 구조라고 한다.
            FILO
	        stack.pop();       // stack에 값 제거
	        stack.clear();     // stack의 전체 값 제거 (초기화)
			stack.push(3);     // stack에 값 3 추가
			stack.peek();     // stack의 가장 상단의 값 출력
	        stack.push(1);     // stack에 값 1 추가
	        stack.push(2);     // stack에 값 2 추가
	        stack.size();      // stack의 크기 출력 : 2
	        stack.empty();     // stack이 비어있는제 check (비어있다면 true)
	        stack.contains(1) // stack에 1이 있는지 check (있다면 true)
	        stack.peek(); // 제거하지 않고 본다 
	        
        */
        
        
        // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제(7) - 삽입(1) - 삽입(4) - 삭제(4)
        /*
        	4x
			1
			7x
			3
			2
			5
        */
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop(); // 상단 값 제거 
        s.push(1);
        s.push(4);
        s.pop(); // 상단 값 제거
        // 스택의 최상단 원소부터 출력
        System.out.println("스택 출력 ");
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
        
        
        
        
        
     // 큐
        
        Queue<Integer> q = new LinkedList<>();

        /*
			큐(queue)는 컴퓨터의 기본적인 자료 구조의 한가지로, 먼저 집어 넣은 데이터가 먼저 나오는 FIFO (First In First Out)구조로 저장하는 형식을 말한다.
			나중에 집어 넣은 데이터가 먼저 나오는 스택과는 반대되는 개념이다.
			
	 		FIFO
	        queue.add(2);     // queue에 값 2 추가
	        queue.offer(3);   // queue에 값 3 추가
	        queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null
	        queue.remove();     // queue에 첫번째 값 제거
	        queue.clear();      // queue 초기화
	        queue.peek();       // queue의 첫번째 값 참조  , 큐의 맨 앞에 있는 값 반환  삭제는 안됨 
        */
        // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll(); // 5 값 반환 
        q.offer(1);
        q.offer(4);
        q.poll(); // 2 값 반환 
        // 먼저 들어온 원소부터 추출
        System.out.println("큐 출력 ");
        System.out.println("q : " + q.toString());
        while (!q.isEmpty()) {
        	System.out.println("peek :" + q.peek());
            System.out.println(q.poll());
        }
        // 3714
        // 3714
       
        
        // 우선순위 큐
        /*
         	Priority Queue 특징
			높은 우선순위의 요소를 먼저 꺼내서 처리하는 구조이다.
			우선순위 큐에 들어가는 원소는 비교가 가능한 기준이 있어야한다.
			
			내부 요소는 힙으로 구성되어 이진트리 구조로 이루어져 있다.
			
			내부구조가 힙으로 구성되어 있기에 시간 복잡도는 O(NLogN)이다.
			
			우선순위를 중요시해야 하는 상황에서 주로 쓰인다.
         */
        
      //int형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        //int형 priorityQueue 선언 (우선순위가 높은 숫자 순)
        //PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        //String형 priorityQueue 선언 (우선순위가 낮은 숫자 순)
        //PriorityQueue<String> priorityQueue = new PriorityQueue<>(); 

        //String형 priorityQueue 선언 (우선순위가 높은 숫자 순)
        //PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        
        
        
        priorityQueue.add(1);     // priorityQueue 값 1 추가
        priorityQueue.add(2);     // priorityQueue 값 2 추가
        priorityQueue.offer(3);   // priorityQueue 값 3 추가
        System.out.println("우선순위 큐 출력");
        System.out.println(" " + priorityQueue.poll());
        
        //priorityQueue.peek();		//priorityQueue에 첫번째 값 참조
        //priorityQueue.poll();       // priorityQueue에 첫번째 값을 반환하고 제거 비어있다면 null
        //priorityQueue.remove();     // priorityQueue에 첫번째 값 제거
        //priorityQueue.clear();      // priorityQueue에 초기화
        
        
        
        /* 
			dfs : stack 깊이우선 검색 , 재귀함수 recursion
			bfs : queue 넓이우선 검색	
				
				
         */
        
	}	
	
	
}
