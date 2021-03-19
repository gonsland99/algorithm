package algorithm.basic.queue;

import algorithm.basic.stack.IntStack.EmptyStackException;
import algorithm.basic.stack.IntStack.OverflowIntStackException;

public class IntQueue {
	private int max;	//큐 용량
	private int front;	//첫번째 요소 커서
	private int rear;	//마지막 요소 커서
	private int num;	//현재 데이터 수
	private int[] que;	//큐 본체
	
	//큐가 비어있는 예외
		public class EmptyIntQueueException extends RuntimeException{
			public EmptyIntQueueException() {}
		}
		
	//큐가 가득찬 예외
		public class OverflowIntQueueException extends RuntimeException{
			public OverflowIntQueueException() {}
		}
	
	//생성자
		public IntQueue(int capacity) {
			num = front = rear = 0;
			max = capacity;
			try {
				que = new int[max];			//스택용 배열 생성
			}catch (OutOfMemoryError e) {	//생성 불가능
				max = 0;
			}
		}
	
	
	//데이터 인큐
		public int enque(int x) throws OverflowIntQueueException {
			if(num >= max)
				throw new OverflowIntQueueException();
			que[rear++] = x;
			num++;
			if(rear == max)
				rear = 0;
			return x;
		}
	
	//데이터를 디큐
		public int deque() throws EmptyIntQueueException{
			if(num <= 0)
				throw new EmptyIntQueueException();
			int x= que[front++];
			num--;
			if(front == max)
				front = 0;
			return x;
		}
		
	//데이터를 피크(프런트 데이터 들여다봄)
	public int peak() throws EmptyIntQueueException {
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	//큐에서 x를 찾음
	public int indexOf(int x){
		for(int i=0; i<num; i++) {
			int idx = (i+front) % max;
			if(que[i] == x)
				return idx;
		}
		return -1;
	}
	
	//큐 비움
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐 용량 반환
	public int capacity() {
		return max;
	}
	
	//큐 데이터 수
	public int size() {
		return num;
	}
	
	//큐 유무
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//큐 가득 여부
	public boolean isFull() {
		return num >= max;
	}
	
	//큐 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i=0; i<num; i++)
				System.out.print(que[(i+front) % max]+" ");
			System.out.println();
		}
	}
}
