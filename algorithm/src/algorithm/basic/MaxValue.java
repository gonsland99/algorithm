package algorithm.basic;

import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ִ밪 ���ϴ� ���α׷�");
		System.out.print("1��° ���� �Է����ּ���: "); int a = sc.nextInt();
		System.out.print("2��° ���� �Է����ּ���: "); int b = sc.nextInt();
		System.out.print("3��° ���� �Է����ּ���: "); int c = sc.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("3���� �� �� �ִ밪��: " + max);
	}
}
