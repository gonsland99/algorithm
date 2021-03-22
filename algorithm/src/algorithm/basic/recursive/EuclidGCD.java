package algorithm.basic.recursive;

import java.util.Scanner;

public class EuclidGCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두정수 최대공약수 구하기");
		System.out.print("정수1: ");	 int x = sc.nextInt();
		System.out.print("정수2: ");	 int y = sc.nextInt();
		
		System.out.println("최대공약수: "+gcd(x,y));
	}
	//재귀함수: 화면안에 화면처럼 계산한 값을 만족할때까지 다시계산
	//최대공약수 구하기
	static int gcd(int x, int y){
		if(y == 0)
			return x;
		else 
			return gcd(y, x%y);
	}
}
