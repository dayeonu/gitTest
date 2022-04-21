import java.util.Scanner;

public class 함수문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float age = sc.nextFloat();
		float feeCalcRate = sc.nextFloat();
		/*		
			메인함수
			input함수를 통해 나이를 입력 받아야함.
			feeCalcRate 함수를 통해 할인율 계산을 받아야함.
			output 함수를 통해 요금을 계산 

		 */	

		float num = add(age,feeCalcRate);
		System.out.println(num);
	}

	static float add(int i, int j ) { //반환타입(자료형)도 동일해야함, int i, int j는 매개변수
		float result = i*j;
		return result; // 리턴할때, num에게 값이 넘어감 	
	}
}