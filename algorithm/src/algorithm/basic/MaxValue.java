package algorithm.basic;

import java.util.Scanner;

public class MaxValue extends MaxValueMethod{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세정수 중 최대값 구하기");
		System.out.print("1번째 정수 입력: "); int a = sc.nextInt();
		System.out.print("2번째 정수 입력: "); int b = sc.nextInt();
		System.out.print("3번재 정수 입력: "); int c = sc.nextInt();
		System.out.print("4번재 정수 입력: "); int d = sc.nextInt();
		
		//상속 및 객체를 사용한 최대값 비교
		MaxValueMethod m3 = new MaxValueMethod();
		//int max = m3.max3(a, b, c);
		int max = m3.max4(a, b, c, d);
		
		/*
		//상속 사용하기 전 같은페이지 내 구현
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		*/
		System.out.println("최대값은: " + max);
	}
}
