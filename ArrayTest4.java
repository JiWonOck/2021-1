//Ȯ�� for�� �ǽ� : ������ �� ���ڿ� �迭 ����
public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30};
		String[] s = {"���", "������ġ", "Ŀ��"};
		int sum = 0;
		
		for (int value : numbers) {
			System.out.print(value + " ");
			sum = sum + value;
			
		}
		System.out.println("���� "+sum);
		
		for (String a : s)
			System.out.print(a + " ");
	}

}
