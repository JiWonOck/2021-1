//확장 for문 실습 : 정수형 및 문자열 배열 예제
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30};
		String[] s = {"사과", "샌드위치", "커피"};
		int sum = 0;
		
		for (int value : numbers) {
			System.out.print(value + " ");
			sum = sum + value;
			
		}
		System.out.println("합은 "+sum);
		
		for (String a : s)
			System.out.print(a + " ");
	}

}
