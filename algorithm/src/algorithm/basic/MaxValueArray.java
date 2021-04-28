package algorithm.basic;

import java.util.Scanner;

public class MaxValueArray {
	//최대값 함수
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i]>max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �ִ� ���ϱ�");
		System.out.print("��� ��: ");
		int num = sc.nextInt();
		//Ű �Է�
		int[] height = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("height["+i+"]:");
			height[i] = sc.nextInt();
		}
		System.out.println("���� ū Ű�� "+maxOf(height)+"�Դϴ�.");
	}
}
