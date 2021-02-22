package algorithm.basic;

import java.util.Scanner;

public class MaxValueArray {
	//max값 판별
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i]>max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사람 수 입력
		System.out.println("키의 최댓값 구하기");
		System.out.print("사람 수: ");
		int num = sc.nextInt();
		//키 입력
		int[] height = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("height["+i+"]:");
			height[i] = sc.nextInt();
		}
		System.out.println("제일 큰 키는 "+maxOf(height)+"입니다.");
	}
}
