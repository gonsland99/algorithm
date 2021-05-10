package algorithm.recursive;

import java.util.Scanner;

public class EuclidGCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ִ����� ���ϱ�");
		System.out.print("����1: ");	 int x = sc.nextInt();
		System.out.print("����2: ");	 int y = sc.nextInt();
		
		System.out.println("�ִ�����: "+gcd(x,y));
	}
	//����Լ�: ȭ��ȿ� ȭ��ó�� ����� ���� �����Ҷ����� �ٽð��
	//�ִ����� ���ϱ�
	static int gcd(int x, int y){
		if(y == 0)
			return x;
		else 
			return gcd(y, x%y);
	}
}
