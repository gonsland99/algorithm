package algorithm.basic;

import java.util.Scanner;

public class MidValue{
	static int mid3(int a, int b, int c) {
		if((a>b && c<b)||(a<b && c>b)) return b;
		else if((b>a && c<a)||(b<a && c>a)) return a;
		else return c;
		/*
		if(a>b)
			if(b>c) return b;
			else if(a<c) return a;
			else return c;
		else if(a>c) return a;
		else if(b>c) return c;
		else return b;
		*/
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세정수 중 중간값 구하기");
		System.out.print("1번째 정수 입력: "); int a = sc.nextInt();
		System.out.print("2번째 정수 입력: "); int b = sc.nextInt();
		System.out.print("3번재 정수 입력: "); int c = sc.nextInt();
		
		int mid = mid3(a, b, c);
		System.out.println("중간값: " + mid);
	}
}
