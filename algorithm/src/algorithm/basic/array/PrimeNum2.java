package algorithm.basic.array;

public class PrimeNum2 {
	//소수 구하기
	public static void main(String[] args) {
		int count = 0;	//나눗셈 한 횟수
		int ptr = 0;	//찾은 소수개수
		int range = 10; //1~range까지 소수를 구하는 범위
		int[] prime = new int[range];
		prime[ptr++] = 2;
		
		for(int i=3; i<=range; i+=2) {	//짝수는 전부 소수임으로 홀수로 판별
			int j;
			for(j=1; j<ptr; j++) {
				count++;
				if(i%prime[j] == 0)
					break;
			}
			if(ptr == j)
				prime[ptr++] = i;
		}
		for(int i=0; i<ptr; i++)
			System.out.print(prime[i]+" ");
		System.out.println();
		System.out.println("나눗셈 횟수: "+count);
	}
}
