package algorithm.basic.queue;

import java.util.Scanner;

public class IntQueueTest {
	//스택: LIFO(마지막에 들어간 데이터가 제일먼저 출력됨)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(10);
		
		while(true) {
			System.out.println("현재 데이터 수: "+s.size()+" / "+s.capacity());
			System.out.print("1.인큐 2.디큐 3.피크 4.덤프 0.종료 : ");
			
			int menu = sc.nextInt();
			if(menu == 0) 
				break;
			
			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					s.enque(x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득 참.");
				}
				break;
			case 2:
				try {
					x = s.deque();
					System.out.println("디큐 데이터: "+x);
				}catch(IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 비어있음.");
				}
				break;
			case 3:
				try {
					x = s.peak();
					System.out.println("피크 데이터: "+x);
				}catch(IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비어있음.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}
}
