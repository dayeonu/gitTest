
public class 메서드선언1 {
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
	//1번 
	public static void main(String[] args) {

		int num =add(10,20);
		System.out.println(num);
	}
	
	//private 사용하면 이 안에서만 스겟다고 함. 
	//호출 할때, static 을 앞에 써야 add를 호출할 수 있음. 
	//몸체 
	static int add(int i, int j ) { //반환타입(자료형)도 동일해야함, int i, int j는 매개변수
		return i+j; // 리턴할때, num에게 값이 넘어감 
	}
}
	 
 