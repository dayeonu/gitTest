import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

//		1.if문을 사용하여 5개 정수를 입력받아서 가장 큰 수를 출력하는 프로그램.
//		2. 입력받은 숫자는 0~100 사이 값만 5개 입력받아서 큰 수 구하기.
		Scanner sc = new Scanner(System.in);
		int num, max = 0;
		String tmp;
		
		System.out.println("정수 5회입력: ");
		for(int i = 0; i<5; i++) {
				tmp = sc.nextLine(); 
				num = Integer.parseInt(tmp);
				
				if(num>=0 && num <101) { 
					if(max<num) max = num;
						} else{ 
							System.out.println("0~100사이 값만 넣어주세요");
					i--; //continue 사용안하고 쓰기.
					}
		}
		System.out.println("최대값: " + max);
	
	}
}