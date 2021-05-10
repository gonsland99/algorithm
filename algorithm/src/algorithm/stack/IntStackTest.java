package algorithm.stack;

import java.util.Scanner;

public class IntStackTest {
	//����: LIFO(�������� �� �����Ͱ� ���ϸ��� ��µ�)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(10);
		
		while(true) {
			System.out.println("���� ������ ��: "+s.size()+" / "+s.capacity());
			System.out.print("1.Ǫ�� 2.�� 3.��ũ 4.���� 0.���� : ");
			
			int menu = sc.nextInt();
			if(menu == 0) 
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("������: ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� ��.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("�� ������: "+x);
				}catch(IntStack.EmptyStackException e) {
					System.out.println("������ �������.");
				}
				break;
			case 3:
				try {
					x = s.peak();
					System.out.println("��ũ ������: "+x);
				}catch(IntStack.EmptyStackException e) {
					System.out.println("������ �������.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}
}
