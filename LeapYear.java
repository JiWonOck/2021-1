
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2021;
	    boolean inLeapYear = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	    System.out.printf("%s\n", inLeapYear);
	    System.out.printf("%d³âµµ´Â À±³â: %s", year, inLeapYear);
		
	}

}
