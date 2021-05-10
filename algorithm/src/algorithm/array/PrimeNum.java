package algorithm.array;

public class PrimeNum {
	//소수 구하기
	public static void main(String[] args) {
		int count = 0;
		int range = 10;
		
		for(int i=2; i<=range; i++) {
			int j;
			for(j=2; j<range-1; j++) {
				count++;
				if(i%j == 0)
					break;
			}
			if(i == j)
				System.out.print(i+" ");
		}System.out.println();
		System.out.println("나눗셈 횟수: "+count);
	}
}
