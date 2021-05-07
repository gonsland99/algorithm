package algorithm.basic.array;

import java.util.Scanner;

public class ConvertNum {
	//16진수 변환
	static int Convert(int x, int r, char[] d) {
		int digits = 0; //변환 후 자릿수
		String dchar = "0123456789ABCDEF";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;		//정수
		int cd;		//기수(진수)
		int dno;	//변환 후 자릿수
		int retry;	//프로그램 반복 여부
		char[] cno = new char[16];
		
		System.out.println("10진수 변환");
		do {
			do {
				System.out.print("변환할 10진수: ");
				no = sc.nextInt();
			}while(no<0);
			do {
				System.out.print("변환할 진수(2~16진수): ");
				cd = sc.nextInt();
			}while(0>=cd || cd>16);
			
			dno = Convert(no, cd, cno);
			
			System.out.print(cd+"진수로 변환한 값: ");
			for(int i=dno-1; i>=0; i--)
				System.out.print(cno[i]);
			
			System.out.print("종료 하시겠습니까?(1.아니오/ 2.예)");
			retry = sc.nextInt();
			System.out.println();
		}while(retry == 1);
	}
}
