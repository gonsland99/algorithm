package algorithm.queue;

import java.util.Scanner;

public class IntQueueTest {
	//����: LIFO(�������� �� �����Ͱ� ���ϸ��� ��µ�)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(10);
		
		while(true) {
			System.out.println("���� ������ ��: "+s.size()+" / "+s.capacity());
			System.out.print("1.��ť 2.��ť 3.��ũ 4.���� 0.���� : ");
			
			int menu = sc.nextInt();
			if(menu == 0) 
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("������: ");
				x = sc.nextInt();
				try {
					s.enque(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("ť�� ���� ��.");
				}
				break;
			case 2:
				try {
					x = s.deque();
					System.out.println("��ť ������: "+x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("ť�� �������.");
				}
				break;
			case 3:
				try {
					x = s.peak();
					System.out.println("��ũ ������: "+x);
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� �������.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}
}
