package algorithm.array;

import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키가 제일 큰 사람 찾기");
		System.out.print("사람수: ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print((i+1)+"번째 사람의 키: ");
			height[i] = sc.nextInt();
		}
		System.out.println("가장 큰 키는 "+maxOf(height)+" 입니다.");
	}
}

