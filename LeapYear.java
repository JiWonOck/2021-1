
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2021;
		boolean isLeapYear;
		
	  isLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	  System.out.println(isLeapYear);
	  System.out.printf("%d년도는 윤년: %s", year, isLeapYear);
		
	}

}
