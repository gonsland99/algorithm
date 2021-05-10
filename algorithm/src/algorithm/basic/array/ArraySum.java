package algorithm.basic.array;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지 더한값 구하기");
		System.out.print("n범위값 입력: ");
		int range = sc.nextInt();
		int[] sum = new int[range];
		int total = 0;
		for(int i=0; i<range; i++) {
			sum[i] = (i+1);
			total += sum[i];
		}
		
		for(int res : sum) {
			if(res == range)
				System.out.print(res+" = ");
			else
				System.out.print(res+"+");
		}
		System.out.println(total);
	}
}
