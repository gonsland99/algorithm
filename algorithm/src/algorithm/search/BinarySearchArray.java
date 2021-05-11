package algorithm.search;

import java.util.Arrays;
import java.util.Scanner;

//Arrays.binarySerach를 이용
public class BinarySearchArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력!");
		System.out.println("x[0]: ");
		x[0] = sc.nextInt();
		for(int i=1; i<num; i++) {
			do {
				System.out.println("x["+i+"]: ");
				x[i] = sc.nextInt();
			}while(x[i] > x[i-1]);
		}
		System.out.println("찾을숫자: ");
		int key = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0)
			System.out.println(key+"은(는) 없습니다.");
		else
			System.out.println(key+"은(는) x["+idx+"]에 있습니다.");
	}
}
