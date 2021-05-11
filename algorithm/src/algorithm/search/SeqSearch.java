package algorithm.search;

import java.util.Scanner;

//선형 검색: 순서대로
public class SeqSearch {
	static int seqSearch(int[] a, int n, int key) {
		//while문
//		int i = 0;
//		while(true) {
//			if(i == n)	
//				return -1;	//검색실패
//			if(a[i] == key) 
//				return i;	//검색성공
//			i++;
//		}
		//for문
		for(int i=0; i<n; i++) {
			if(a[i] == key)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("찾을숫자: ");
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky);
		if(idx == -1)
			System.out.println(ky+"은(는) 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
}
