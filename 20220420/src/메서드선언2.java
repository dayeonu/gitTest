
public class 메서드선언2 {
/*
	void add(int i, int j ) --> 함수 정의(몸체)
	반환형 함수이름	매개변수 
	
	void는 반환값이 없다.
	int 정수형 int를 리턴한다.
	double(10,20) --> 함수 호출
	함수이름(인자, 인자)
	
	1.인자o , 반환o
	2.인자o , 반환x
	3.인자x , 반환o
	4.인자x , 반환x
	
## 두 정수를 더하는 기능으로 함수 표현 ##
	
	*/
	//2	번째 형태 
	
	public static void main(String[] args) {

		 add(10,20);
		
	}
	static void add(int i , int j) {
		
		System.out.println(i+j);
		
	}
	
}	
	 
 