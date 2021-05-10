package algorithm.array;

import java.util.Scanner;

public class ReverseArray {
	//버블정렬
	static void swap(int[] a,int idx1,int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	//역순정렬(버블정렬 이용)
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++)
			swap(a, i, a.length-i-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		reverse(x);
		//입력한 순서대로 역순정렬
		System.out.println("======= 역순정렬 결과 =======");
		for(int i=0; i<num; i++)
			System.out.println("x["+i+"] = "+x[i]);
	}
}
