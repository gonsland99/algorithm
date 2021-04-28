package algorithm.basic;

public class MaxValueMethod {
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		return max;
	}
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		return max;
	}
}
