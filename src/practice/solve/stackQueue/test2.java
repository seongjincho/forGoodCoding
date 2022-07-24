package practice.solve.stackQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class test2 {


	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		// for 문을 이용한 방법
		int[] f = new int[list.size()];
		for(int i = 0; i<list.size(); i++) {
			f[i] = list.get(i);
		}
		System.out.println(Arrays.stream(f).boxed().collect(Collectors.toList()));
		//Java 8에서 제공하는 Stream을 사용
		int[] i = list.stream().mapToInt(Integer::intValue).toArray(); // int 배열로
		Integer[] i2 = list.toArray(new Integer[list.size()]); // Integer 배열로
		
		System.out.println(Arrays.stream(i).boxed().collect(Collectors.toList()));
		System.out.println(Arrays.stream(i2).collect(Collectors.toList()));
		
	}
}
