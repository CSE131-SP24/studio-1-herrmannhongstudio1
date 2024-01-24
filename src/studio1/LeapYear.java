package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		//System.out.print((double)(year/4));
		boolean by4 = year%4 == 0;
		boolean by100 = year%100 != 0;
		boolean by400 = year%400 == 0;
		boolean leapYear = (by4 && by100) || by400;
		System.out.print("leap year" + leapYear);
	}

}
