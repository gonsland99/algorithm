package algorithm.array;

import java.util.Scanner;

public class MinNum{
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세정수 중 최소값 구하기");
		System.out.print("1번째 정수 입력: "); int a = sc.nextInt();
		System.out.print("2번째 정수 입력: "); int b = sc.nextInt();
		System.out.print("3번재 정수 입력: "); int c = sc.nextInt();
		
		int min = min3(a, b, c);
		System.out.println("최소값은: " + min);
	}
}
