package algorithm.search;

import java.util.Scanner;

public class SeqSearch {
	//�����˻�: ������� �˻�
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����: ");		//��Ҽ� num ����
		int num = sc.nextInt();
		//int [] x = new int[num];
		int [] x = new int[num+1];
		
		for(int i=0; i<num; i++) {		//��� �� �Է�
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻���: ");		//ã�� �� �Է�
		int ky = sc.nextInt();
		
		int idx = seqSearch(x, num, ky);	//�˻� �� ��� ���
		if(idx == -1)
			System.out.println(ky+"��(��) ã�� �� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
	
	//key���� ã�� �޼���
	static int seqSearch(int[] a,int n, int key) {
		/* 	���ʹ�
		 	: �迭 �� ���� �� �˻� �� ���ǹ��� �ϳ� �� ���(����� �� �߻�)
		 	�˻����� �迭 ���� key���� �߰��Ͽ� ���ǹ��� ����(����� ����)	
		*/
		/*	���⵵
			: �ݺ����� ���� ������ �����ϴ� ���α׷��� ���⵵�� ���ٰ� ǥ��
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
		//while���� �̿��� �˻��Լ�
		int i = 0;
		while(true) {
			if(i == n)	//�˻� ����
				return -1;
			if(a[i] == key) //key���� �ִٸ� i��° ���� ��ȯ
				return i;
			i++;
		}
	
		//for���� �̿��� �˻��Լ�
		for(int i=0; i<n; i++)
			if(a[i] == key)
				return i;
		return -1;
		*/
		
	}
}
