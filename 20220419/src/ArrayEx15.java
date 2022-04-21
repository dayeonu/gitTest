import java.util.Arrays;

public class ArrayEx15 {

	public static void main(String[] args) {

		String src = "ABCDE";
		
		for(int i =0; i<src.length(); i++) {
			char ch = src.charAt(i);//charAt메서드는 문자열에서 지정된 index에 있는 한 문자를 가져온다.
			System.out.println("src.charAt("+i+"):" + ch);
		}
		char[] chArr = src.toCharArray();  // String -> char배열 
		System.out.println(chArr); //char배열(char[])을 출력한다.
	}	
} 