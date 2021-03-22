package algorithm.basic.recursive;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int x = sc.nextInt();
		
		System.out.println(x+"의 팩토리얼은 "+factorial(x)+"입니다.");
	}
	//!3 팩토리얼: 3x2 
	static int factorial(int n) {
		if(n>0)
			return n* factorial(n-1);
		else
			return 1;
	}
}
