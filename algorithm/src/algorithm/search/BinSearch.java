package algorithm.search;

import java.util.Scanner;

//이진트리검색
public class BinSearch {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;		//첫번째 인덱스
		int pr = n-1;	//마지막 인덱스
		
		do {
			int pc = (pl+pr)/2;	//중간 인덱스
			if(a[pc] == key)
				return pc;
			else if(a[pc] < key)
				pl = pc+1;
			else
				pr = pc-1;
		}while(pl <= pr);
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력할것!");
		System.out.print("x[0]: ");
		x[0]=sc.nextInt();
		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"]: ");
				x[i]=sc.nextInt();
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("찾을숫자: ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky);
		if(idx == -1)
			System.out.println(ky+"이 없습니다.");
		else
			System.out.println(ky+"은 x["+idx+"]에 있습니다.");
	}
	

	
}
