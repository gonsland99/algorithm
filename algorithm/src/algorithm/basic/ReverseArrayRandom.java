package algorithm.basic;

import java.util.Random;
import java.util.Scanner;

public class ReverseArrayRandom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.println("���� ���� ���α׷�");
		System.out.print("�� ���� ������ �Է��ϼ���: ");
		int count = sc.nextInt();
		
		int[] nums = new int[count];
		for(int i=0; i<nums.length; i++) {
			nums[i] = rd.nextInt(10); 
			System.out.print(nums[i]+"\t");
		}
		System.out.println();
		for(int i=0; i<nums.length/2; i++) {
			int t = nums[i];
			nums[i] = nums[nums.length-i-1];
			nums[nums.length-i-1] = t;
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+"\t");
		}
		
	}
	
}
