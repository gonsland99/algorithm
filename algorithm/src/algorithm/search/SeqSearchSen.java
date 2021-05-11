package algorithm.search;

import java.util.Scanner;

//선형 검색(보초법): 배열끝에 찾고자 하는 값(보초)을 넣어 경우의 수를 줄임
//복잡도 O(n): return문과 같이 한번사용시 O(1), 반복문과 같이 n에 비례하여 사용시 O(n)이라고 표기 
public class SeqSearchSen {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		a[n] = key;
		//while문
		/*
		while(true) {
			if(a[i] == key)	
				break;
			i++;
		}
		return i == n ? -1 : i;
		*/
		for(i=0; i<n; i++) {
			if(a[i] == key)	//O(n)
				return i;	//O(1)
		}return -1;			//O(1)
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
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
