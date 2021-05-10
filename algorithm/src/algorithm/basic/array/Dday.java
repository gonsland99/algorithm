package algorithm.basic.array;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Dday {
	// D-day 계산
	static int getDday(int y, int m, int d) {
		Calendar cToday = Calendar.getInstance();
		Calendar cDday = Calendar.getInstance();
		cDday.set(y, m, d);
		long today = cToday.getTimeInMillis()/(24*60*60*1000);
		long dday = cDday.getTimeInMillis()/(24*60*60*1000);
		long day = dday - today;
		return (int)day;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("목표일을 입력하세요. ");
		System.out.print("년: ");
		int year = sc.nextInt();
		System.out.print("월: ");
		int month = sc.nextInt();
		System.out.print("일: ");
		int day = sc.nextInt();
		
		int dday = getDday(year,month,day);
		System.out.println("목표일까지 "+dday+"일 남았습니다.");
	}
}
