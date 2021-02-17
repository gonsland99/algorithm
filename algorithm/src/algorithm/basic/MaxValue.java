package algorithm.basic;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("최대값 구하는 프로그램");
		System.out.print("1번째 수를 입력해주세요: "); int a = sc.nextInt();
		System.out.print("2번째 수를 입력해주세요: "); int b = sc.nextInt();
		System.out.print("3번째 수를 입력해주세요: "); int c = sc.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("3개의 수 중 최대값은: " + max);
	}
}
