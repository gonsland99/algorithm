package algorithm.basic;

import java.util.Scanner;

public class ConvRev {
	static int Convert(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEF";
		
		do {
			d[digits++] = dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;		//변환할 정수
		int cd;		//기수(진수)
		int dno;	//변환후 자릿수
		int retry;	//다시실행
		char[] cno = new char[16];
		
		System.out.println("10진수를 다른진수로 변환하는 프로그램");
		do {
			do {
				System.out.print("변환하고 싶은 양의정수: ");
				no = sc.nextInt();
			}while(no<0);
			do {
				System.out.print("어떤 진수로 변환?: ");
				cd = sc.nextInt();
			}while(0>=cd || cd>16);
			
			dno = Convert(no, cd, cno);
			
			System.out.print(cd+"진수 값은: ");
			for(int i=dno-1; i>=0; i--)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("다시 변환하시겠습니까?(1.예/ 2.아니오): ");
			retry = sc.nextInt();
			System.out.println();
		}while(retry == 1);
	}
}
