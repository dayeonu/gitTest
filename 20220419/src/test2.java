
public class test2 {

	public static void main(String[] args) {

		int[][] arr = {
				{ 5,5,5,5,5 },
				{ 10,10,10,10,10 },
				{ 20,20,20,20,20,20,20 },
				{ 30,30,30,30,30,30 },
		};
				//총점, 평균 구하기
		int count=0;		
		int total = 0;
		float average=0;
		
		for(int i = 0; i<arr.length; i++) {  //4회전
			for(int j=0; j<arr[i].length; j++) {
				total += arr[i][j];
				count++;
				}
		}
				average = total/(float)(count);
				
		System.out.println("count:" + count);
		System.out.println("total=" + total);
		System.out.printf("average= %.1f", average);
			
		}
}
