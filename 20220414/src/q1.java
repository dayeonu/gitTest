import java.util.Arrays;

public class q1 {

	public static void main(String[] args) {

		// �� �հ� ��� //���� 1~ 100 
		
		int[] num = new int[10];
		int sum=0;
		
		//�����Է�
		for(int i = 0; i<num.length; i++) {
			num[i]= (int)(Math.random()*99)+1;
			sum += num[i];

			System.out.println(sum);

	}
	
		
	}

}
