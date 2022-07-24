package practice;

public class SqlPractice {

	/*
	보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 0시부터 23시까지
	, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요.
	 이때 결과는 시간대 순으로 정렬해야 합니다.	
	
	이 문제 풀이는 처음 보는 문법을 사용해서 꼭 익혀야하는 문제이다.

	먼저 가장 어려운 부분은 데이터베이스에 없는 시간까지 0부터 23시까지를 만들어야한다. 따라서 0부터 23시까지의 테이블을 먼저 만들어주어야한다.
	SET @HOUR = -1;
	SELECT (@HOUR := @HOUR+1) AS HOUR
	FROM ANIMAL_OUTS
	WHERE @HOUR < 23;
	SET 함수의 경우 어떠한 변수에 특정한 값을 넣어줄 때 사용한다.
	@는 변수명 앞에 넣어주어야한다. 즉, @HOUR=-1이라는 것은 HOUR 변수에 -1을 넣어준다는 뜻이다.
	다음으로 :=기호는 대입해준다는 뜻이다. 즉, 기존 HOUR 변수는 -1인데 그 HOUR 변수를 +1로 대입해준다는 뜻으로 0이되고 
	또 0이 +1이 대입되어 1이 되면서 WHERE절인 23미만일때까지 대입되어 22가 될때 멈추며 22는 23이 된다
	이렇게 하면 0부터 23까지의 테이블이 완성된다.
	다음으로 해결할 것은 COUNT한 테이블을 만들어주는 것이다.
	HOUR 변수와 시간이 같을 때(HOUR(DATETIME) =@HOUR) 카운트한다.
	전체 코드는 아래와 같다.

	코드
	SET @hour =-1;
	SELECT (@hour := @hour+1) AS HOUR,
	        (SELECT COUNT(*) 
	         FROM ANIMAL_OUTS 
	         WHERE HOUR(DATETIME) = @hour) AS COUNT 
	FROM ANIMAL_OUTS
	WHERE @hour < 23
	ORDER BY HOUR;
	
	*/
}
