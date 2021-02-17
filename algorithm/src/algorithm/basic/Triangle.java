package algorithm.basic;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드 출력 프로그램");
		System.out.print("피라미드 높이: "); int h = sc.nextInt();
/*
		//왼쪽 정렬
		for(int i=0; i<h; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//역정렬
		for(int i=0; i<h; i++) {
			for(int j=h; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
		//왼쪽정렬
		for(int i=h; i>0; i--) {
			for(int j=0; j<h; j++) {
				if(i>j+1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}
	}
}
