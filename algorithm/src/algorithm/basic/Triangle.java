package algorithm.basic;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ƕ�̵� ��� ���α׷�");
		System.out.print("�Ƕ�̵� ����: "); int h = sc.nextInt();
/*
		//���� ����
		for(int i=0; i<h; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//������
		for(int i=0; i<h; i++) {
			for(int j=h; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
*/
		//��������
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
