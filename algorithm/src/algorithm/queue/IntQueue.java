package algorithm.queue;

import algorithm.stack.IntStack.EmptyStackException;
import algorithm.stack.IntStack.OverflowIntStackException;

public class IntQueue {
	private int max;	//ť �뷮
	private int front;	//ù��° ��� Ŀ��
	private int rear;	//������ ��� Ŀ��
	private int num;	//���� ������ ��
	private int[] que;	//ť ��ü
	
	//ť�� ����ִ� ����
		public class EmptyIntQueueException extends RuntimeException{
			public EmptyIntQueueException() {}
		}
		
	//ť�� ������ ����
		public class OverflowIntQueueException extends RuntimeException{
			public OverflowIntQueueException() {}
		}
	
	//������
		public IntQueue(int capacity) {
			num = front = rear = 0;
			max = capacity;
			try {
				que = new int[max];			//���ÿ� �迭 ����
			}catch (OutOfMemoryError e) {	//���� �Ұ���
				max = 0;
			}
		}
	
	
	//������ ��ť
		public int enque(int x) throws OverflowIntQueueException {
			if(num >= max)
				throw new OverflowIntQueueException();
			que[rear++] = x;
			num++;
			if(rear == max)
				rear = 0;
			return x;
		}
	
	//�����͸� ��ť
		public int deque() throws EmptyIntQueueException{
			if(num <= 0)
				throw new EmptyIntQueueException();
			int x= que[front++];
			num--;
			if(front == max)
				front = 0;
			return x;
		}
		
	//�����͸� ��ũ(����Ʈ ������ �鿩�ٺ�)
	public int peak() throws EmptyIntQueueException {
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	//ť���� x�� ã��
	public int indexOf(int x){
		for(int i=0; i<num; i++) {
			int idx = (i+front) % max;
			if(que[i] == x)
				return idx;
		}
		return -1;
	}
	
	//ť ���
	public void clear() {
		num = front = rear = 0;
	}
	
	//ť �뷮 ��ȯ
	public int capacity() {
		return max;
	}
	
	//ť ������ ��
	public int size() {
		return num;
	}
	
	//ť ����
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//ť ���� ����
	public boolean isFull() {
		return num >= max;
	}
	
	//ť ���
	public void dump() {
		if (num <= 0)
			System.out.println("ť�� ��� �ֽ��ϴ�.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[(i+front) % max]+" ");
			System.out.println();
		}
	}
}
