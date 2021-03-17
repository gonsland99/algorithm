package algorithm.basic.search;

import java.util.Scanner;

public class SeqSearch {
	//선형검색: 순서대로 검색
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요수수: ");		//요소수 num 설정
		int num = sc.nextInt();
		//int [] x = new int[num];
		int [] x = new int[num+1];
		
		for(int i=0; i<num; i++) {		//요소 값 입력
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색값: ");		//찾을 값 입력
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky);	//검색 및 결과 출력
		if(idx == -1)
			System.out.println(ky+"을(를) 찾을 수 없습니다.");
		else
			System.out.println(ky+"은(는) x["+idx+"]에 있습니다.");
	}
	
	//key값을 찾는 메서드
	static int seqSearch(int[] a,int n, int key) {
		/* 	보초법
		 	: 배열 내 없는 값 검색 시 조건문을 하나 더 사용(비용이 더 발생)
		 	검색값을 배열 끝에 key값을 추가하여 조건문을 줄임(비용을 줄임)	
		*/
		/*	복잡도
			: 반복문과 같이 여러번 실행하는 프로그램을 복잡도가 높다고 표현
		*/
		a[n] = key;
		int i = 0;
		while(true) {
			if(a[i] == key)
				break;
			i++;
		}
		return i==n ? -1:i;
		
		/*
		//while문을 이용한 검색함수
		int i = 0;
		while(true) {
			if(i == n)	//검색 실패
				return -1;
			if(a[i] == key) //key값이 있다면 i번째 값을 반환
				return i;
			i++;
		}
	
		//for문을 이용한 검색함수
		for(int i=0; i<n; i++)
			if(a[i] == key)
				return i;
		return -1;
		*/
		
	}
}
