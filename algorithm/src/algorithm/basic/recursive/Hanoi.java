package algorithm.basic.recursive;

import java.util.Scanner;

import algorithm.basic.stack.IntStack;

public class Hanoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("하노이의 탑 원반개수: ");
		int a = sc.nextInt();
		
		move(a, 1, 3);
	}
	static void move(int n, int x, int y) {
		if(n > 1)
			move(n-1, x, 6-x-y);
		System.out.println("원반"+n+"을 "+x+"기둥에서 "+y+"기둥으로 옮김.");
		if(n > 1)
			move(n-1, 6-x-y, y);
	}
}
