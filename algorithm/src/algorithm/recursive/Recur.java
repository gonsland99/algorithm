package algorithm.recursive;

import java.util.Scanner;

import algorithm.stack.IntStack;

public class Recur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int x = sc.nextInt();
		
		recur(x);

	}
	//����Լ� 
	//����ĺм�: r(4)�κ��� �Ʒ��� �Լ��� �м��ϴ� ���
	//����ĺм�: r(0)���� ���� �Լ��� �м��ϴ� ���
	static void recur(int n) {
		/*
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
		*/
		//���ð� �����������(�ݺ��� ��͸� ���� recur(n-2)�� n=n-2�� ����)
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
