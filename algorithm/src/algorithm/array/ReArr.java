package algorithm.array;

import java.util.Random;
import java.util.Scanner;

public class ReArr {
	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 개수: "); int size = sc.nextInt();
		
		int[] num = new int[size];
		for(int i=0; i<num.length; i++) {
			num[i] = rd.nextInt(100);
			System.out.print(" "+num[i]);
		}
		
		reverse(num);
		System.out.println();
		for(int i=0; i<num.length; i++) {
			System.out.print(" "+num[i]);
		}
		
		
	}
}
