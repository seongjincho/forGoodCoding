package practice;

public class MakeExhaustiveSearch {
	
	//완전탐색
	// 순열 => 선택 순서가 결과애 영향을 미치는 경우 
	// 조합 => 선택 순서가 결과에 영향을 주지 않는 경우
	
	
	static int sequentialSearch(int[] arr, int n, int x) {
		
		for(int i = 0; i < n; ++i) {
			if(arr[i] == x) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] intArr = {1,2,4,8,11,13,18,21,24,27,30,33,37,41,44,47};
		int arrSize = intArr.length;
		
		System.out.println("sequentialSearch  : " + sequentialSearch(intArr, arrSize, 37) + " 번째");
		
		
	}
}
