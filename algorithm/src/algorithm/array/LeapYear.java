package algorithm.array;

import java.util.Scanner;

public class LeapYear {

	static String isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "윤년(366일)" : "평년(365일)";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("해당년도 윤년(366일)/평년(365일) 판별기");
		System.out.print("- 판별하고 싶은 연도: "); 
		int year = sc.nextInt();
		
		System.out.printf("해당년도는 "+isLeap(year)+" 입니다.");
	}
}
