package algorithm.array;

import java.util.Scanner;

public class MaxOfNum {
	//세개의 수중 최대값 구하는 메서드
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세정수 중 최대값 구하기");
		System.out.print("1번째 정수 입력: "); int a = sc.nextInt();
		System.out.print("2번째 정수 입력: "); int b = sc.nextInt();
		System.out.print("3번재 정수 입력: "); int c = sc.nextInt();
		
		int max = max3(a, b, c);
		
		System.out.println("최대값은: " + max);
	}
}
