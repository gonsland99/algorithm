package algorithm.basic;

import java.util.Scanner;

public class TotalSum {
	public static void main(String[] args) {
		//1~n���� ���� ����
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0; 
		System.out.println("1���� n���� ���� ���ϴ� ���α׷�");
		System.out.print("n�� �Է����ּ���: "); int n = sc.nextInt();
		/*
		while(a <= n) {
			sum += a;
			a++;
		}
		*/
		for(int i=1; i<=n; i++)
			sum += i;
			
		System.out.println("1���� "+n+"���� ����: "+sum);
		
		
	}
}
