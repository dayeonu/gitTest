
public class test6 {

	public static void main(String[] args) {

		int[][] score= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
			};
		//score.length:5 , score[i]length:3
		
		int[][] result = new int[score.length + 1][score[0].length +1];

		for(int i = 0; i<score.length; i++) {  //5번
			for(int j = 0; j<score[i].length; j++) { //3번
				
				result[i][j] =score[i][j];
		// 가로 합		
				result[i][ result[0].length-1] +=score[i][j];
		// 세로 합 		
				result[i][result.length-1] += score[i][j];
				
			}
		}
		for(int i =0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
		} System.out.println();
	}
}


