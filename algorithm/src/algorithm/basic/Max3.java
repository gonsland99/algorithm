package algorithm.basic;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세정수 중 최댓값 구하기");
		//순차적 구조
		System.out.print("a: "); int a = sc.nextInt();
		System.out.print("b: "); int b = sc.nextInt();
		System.out.print("c: "); int c = sc.nextInt();
		
		int max = a;
		//선택적 구조
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최대값은: "+max);
	}
}
