package algorithm.basic;

import java.util.Scanner;

public class Median {
	static int med3(int a, int b, int c) {
		/* 중복되는 판단으로 효율이 떨어지는 정상동작 코드
		if((a>b && c<b)||(a<b && c>b)) return b;
		else if((b>a && c<a)||(b<a && c>a)) return a;
		else return c;
		*/
		if(a >= b)
			if(b >= c) return b;
			else if(a <= c)	return a;
			else return c;
		else if(a > c) return a;
		else if(b > c) return c;
		else return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수 중 중간값 구하기");
		System.out.print("a: "); int a = sc.nextInt();
		System.out.print("b: "); int b = sc.nextInt();
		System.out.print("c: "); int c = sc.nextInt();
		
		System.out.println("중간값: "+med3(a,b,c));
	}
}
