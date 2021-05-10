package algorithm.search;

import java.util.Scanner;

public class Exam_SeqSearch {
	public static void main(String[] args) {
		int[] x; int num; int ky; int idx;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��Ұ�: ");
		num = sc.nextInt();
		x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("�˻���: ");
		ky = sc.nextInt();
		
		idx = seqSearch(x, num, ky);	
		if(idx == -1)
			System.out.println(ky+"��(��) ã�� �� �����ϴ�.");
		else
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
	}
	static int seqSearch(int[] a, int n, int key) {
	    System.out.print("  |");
	    for (int i = 0; i < n; i++)
	      System.out.printf("%3d", i);
	    System.out.println();
	    System.out.print("--+");
	    for (int i = 0; i < n; i++)
	      System.out.print("---");
	    System.out.println();

	    for (int i = 0; i < n; i++) { 
	      System.out.print("  | ");
	      for (int j = 0; j < i; j++)
	        System.out.print("   ");
	      System.out.println(" *");
	      System.out.printf("%2d|", i);
	      for (int j = 0; j < n; j++)
	        System.out.printf("%3d", a[j]);
	      System.out.println();
	      if (a[i] == key)
	        return i;
	    }
	    return -1;
	}
}
