package algorithm.basic.recursive;

import java.util.Scanner;

import algorithm.basic.stack.IntStack;

public class Recur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int x = sc.nextInt();
		
		recur(x);

	}
	//재귀함수 
	//하향식분석: r(4)로부터 아래로 함수를 분석하는 방법
	//상향식분석: r(0)부터 위로 함수를 분석하는 방법
	static void recur(int n) {
		/*
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
		*/
		//스택과 꼬리재귀제거(반복된 재귀를 위한 recur(n-2)를 n=n-2로 변경)
		IntStack s = new IntStack(n);
		while(n>0) {
			if(n>0) {
				s.push(n);
				n = n-1;
				continue;
			}
			if(s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n-2;
				continue;
			}
			break;
		}
	}
	
}
