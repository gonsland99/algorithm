package programmers;

import java.util.Scanner;

public class Decimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ҽ�����: ");
		int range = sc.nextInt();
		System.out.println(decimalCnt(range));
	}

	// N ���� �Ҽ� ���� �޼ҵ�
	public static int decimalCnt(int n) {
		int answer = 0;
		boolean chk;

		for (int i=2; i<=n; i++) {
			chk = true;
			for (int j=i; j<i; j++)
				if (i%j == 0) {
					chk = false;
					break;
				}
			if(chk)	answer++;
		}
		return answer;
	}
}