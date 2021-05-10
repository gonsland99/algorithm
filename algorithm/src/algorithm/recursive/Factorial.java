package algorithm.recursive;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�: ");
		int x = sc.nextInt();
		
		System.out.println(x+"�� ���丮���� "+factorial(x)+"�Դϴ�.");
	}
	//!3 ���丮��: 3x2 
	static int factorial(int n) {
		if(n>0)
			return n* factorial(n-1);
		else
			return 1;
	}
}
