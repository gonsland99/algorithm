package algorithm.recursive;

import java.util.Scanner;

import algorithm.stack.IntStack;

public class Hanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϳ����� ž ���ݰ���: ");
		int a = sc.nextInt();
		
		move(a, 1, 3);
	}
	static void move(int n, int x, int y) {
		if(n > 1)
			move(n-1, x, 6-x-y);
		System.out.println("����"+n+"�� "+x+"��տ��� "+y+"������� �ű�.");
		if(n > 1)
			move(n-1, 6-x-y, y);
	}
}
