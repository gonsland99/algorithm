package algorithm.basic;

public class Max3m {
	//메서드를 이용한 최대값 구하기
	static int max3(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		return max;
	}
	public static void main(String[] args) {
		
		System.out.println(max3(1,2,3));
		System.out.println(max3(3,2,1));
		System.out.println(max3(1,3,2));
	}
}
