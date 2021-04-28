package algorithm.basic;

import java.util.Scanner;

public class TotalSum {
	public static void main(String[] args) {
		//1~n���� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지 합 구하기");
		System.out.print("n의 값: "); int n = sc.nextInt();

		int sum = 0; 
		for(int i=1; i<=n; i++) {
			sum += i;
			if(i<n) System.out.print(i+" + ");
			else System.out.print(i+" = ");
		}
		/*
		while(a <= n) {
			sum += a;
			a++;
		}
		*/
		System.out.println(sum);
		//System.out.println("1부터 "+n+"까지 합: "+sum);
		
		
	}
}
