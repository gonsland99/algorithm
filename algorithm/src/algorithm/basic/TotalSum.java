package algorithm.basic;

import java.util.Scanner;

public class TotalSum {
	public static void main(String[] args) {
		//1~n까지 수의 총합
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0; 
		System.out.println("1부터 n까지 총합 구하는 프로그램");
		System.out.print("n을 입력해주세요: "); int n = sc.nextInt();
		/*
		while(a <= n) {
			sum += a;
			a++;
		}
		*/
		for(int i=1; i<=n; i++)
			sum += i;
			
		System.out.println("1부터 "+n+"까지 총합: "+sum);
		
		
	}
}
