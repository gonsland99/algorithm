package algorithm.basic;

import java.util.Scanner;

public class Multi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.println("°ö¼À ÇÁ·Î±×·¥");
		System.out.print("x°ª: "); x=sc.nextInt();
		System.out.print("y°ª: "); y=sc.nextInt();
		
		int mul = x * y;
		System.out.println(x+" x "+y+" = "+ mul);
	}
}
