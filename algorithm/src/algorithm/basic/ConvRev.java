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
		int no;		//��ȯ�� ����
		int cd;		//���(����)
		int dno;	//��ȯ�� �ڸ���
		int retry;	//�ٽý���
		char[] cno = new char[16];
		
		System.out.println("10������ �ٸ������� ��ȯ�ϴ� ���α׷�");
		do {
			do {
				System.out.print("��ȯ�ϰ� ���� ��������: ");
				no = sc.nextInt();
			}while(no<0);
			do {
				System.out.print("� ������ ��ȯ?: ");
				cd = sc.nextInt();
			}while(0>=cd || cd>16);
			
			dno = Convert(no, cd, cno);
			
			System.out.print(cd+"���� ����: ");
			for(int i=dno-1; i>=0; i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�ٽ� ��ȯ�Ͻðڽ��ϱ�?(1.��/ 2.�ƴϿ�): ");
			retry = sc.nextInt();
			System.out.println();
		}while(retry == 1);
	}
}
