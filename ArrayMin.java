//�迭���� �ּڰ� ã��
public class ArrayMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {10, 3, 19, 6, 18, 4, 1, 20};
		int min;
		
		min = s[0];
		
		for(int i=1; i<s.length; i++) {
			if( s[i]<min)
				min = s[i];
		}
		
		System.out.printf("�ּҰ��� %d", min);
		//System.out.print("�ּҰ��� " + min); �� ����

	}

}