package algorithm.basic;
import java.util.Scanner;
// 가우스 공식에 의해 1, 2, …, n의 합을 구합니다.

class SumGauss {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값：");
		int n = stdIn.nextInt();
		
		//가우스의 덧셈(1부터 10까지 합: (1+10)*10/2)
		int sum = (1+n)*(n/2) + (n%2 == 1 ? (1+n)/2 : 0); 
		// n/2 홀수이면 몫만 남기때문에 나머지값을 더해줌
		// ex)1~9덧셈 9/2=4 홀수이기때문에 부족한 (1+9)/2 = 5를 더해줌
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
