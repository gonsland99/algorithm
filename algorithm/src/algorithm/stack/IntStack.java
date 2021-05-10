package algorithm.stack;

public class IntStack {
	private int max;	//���� �뷮
	private int ptr;	//���� ������
	private int[] stk;	//���� ��ü
	
	//������ �������
	public class EmptyStackException extends RuntimeException{
		public EmptyStackException() {}
	}
	
	//������ ������
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	
	//������
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];			//���ÿ� �迭 ����
		}catch (OutOfMemoryError e) {	//���� �Ұ���
			max = 0;
		}
	}
	
	//���ÿ�  x�� Ǫ��
	public int push(int x) throws OverflowIntStackException {
		if(ptr >= max)
			throw new OverflowIntStackException();
		return stk[ptr++] = x;
	}
	
	//������ �����͸� ��(������ ����)
	public int pop() throws EmptyStackException {
		if(ptr <= 0)
			throw new EmptyStackException();
		return stk[--ptr];
	}
	
	//������ �����͸� ��ũ(���� �ִ� ������ �鿩�ٺ�)
	public int peak() throws EmptyStackException {
		if(ptr <= 0)
			throw new EmptyStackException();
		return stk[ptr-1];
	}
	
	//���ÿ��� x�� ã��
	public int indexOf(int x){
		for(int i=ptr-1; i>=0; i--)
			if(stk[i] == x)
				return i;
		return -1;
	}
	
	//���� ���
	public void clear() {
		ptr = 0;
	}
	
	//���� �뷮 ��ȯ
	public int capacity() {
		return max;
	}
	
	//���� ������ ��
	public int size() {
		return ptr;
	}
	
	//���� ����
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	//���� ���� ����
	public boolean isFull() {
		return ptr >= max;
	}
	
	//���� ���
	public void dump() {
		if (ptr <= 0)
			System.out.println("������ ��� �ֽ��ϴ�.");
		else {
			for(int i=0; i<ptr; i++){
				System.out.print(stk[i]+" ");
			}
			System.out.println();
		}
	}
}
