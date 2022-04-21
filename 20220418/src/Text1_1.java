import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Text1_1 {

	public static void main(String[] args) throws IOException, InterruptedException {

		int count=0;
		{
			File file = new File("data/data1.txt");
			FileInputStream src = new FileInputStream(file);
			Scanner sc = new Scanner(src);

			while(sc.hasNext()) { // sc.hasNext는 스캐너 객체로 데이터가 들어왔는지 여부를 반환하는 함수. 
				String tmp = sc.next();
				System.out.printf("%s " , tmp); //데이터의 갯수
				count++;
			}
			System.out.println("\ncount : " + count);

			sc.close();
			src.close();
		}
		
		int[] nums = new int[count];//count 10
		{
			// 배열 공간 data1.txt 내용 넣기
			File file = new File("data/data1.txt");
			FileInputStream src = new FileInputStream(file);
			Scanner sc = new Scanner(src);

			for(int i=0; i<count; i++) {
				String tmp = sc.next();
				nums[i]  = Integer.parseInt(tmp);
			}

			System.out.println("nums : " + Arrays.toString(nums));

			sc.close();
			src.close();
		}

		//배열에서 특정 숫자를 찾기
		//반복해서 찾아야 한다. 88번째 몇번째 있는지 출력

		{
			int index = -1;
			for(int i=0; i<count; i++)
				if(88 == nums[i]) {
					index = i;
					break;
				}
			System.out.println("index : " + index); 
		}

		//index 위치 변경 >>>>0 <---> 5 위치 교환 
		{
			int tmp;
			tmp = nums[0];
			nums[0] = nums[5];
			nums[5] = tmp;
			System.out.println("nums: " + Arrays.toString(nums));
		}

		//반복적으로 i <> i + 1를 교환
		{  
			for(int i = 0; i<count-1; i++) {
				int tmp = nums[i + 1];
				nums[i + 1] = nums[i];
				nums[i] = tmp;

				Thread.sleep(1000); //1초 딜레이.  

				for(int j = 0; j<50; j++)
					System.out.println();

				for(int j =0; j<count; j++) {
					if(j == i+1 || j == i + 0) 
						System.out.printf("[%d] ", nums[j]);
					else
						System.out.printf(" %d ", nums[j]);
				}
		//    System.out.println("nums :" + Arrays.toString(nums));
			}
		}
	}
}