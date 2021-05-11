package algorithm.search;

class Id{
	private static int counter = 0;
	private int id;
	//Instance 메서드
	public Id() {id = ++counter;}
	public int getId() {return id;}
	//static 메서드
	public static int getCounter() {return counter;}	
}
public class IdTest {
	public static void main(String[] args) {
		//인스턴스 메서드 호출
		Id a = new Id();
		Id b = new Id();
		System.out.println("a의 아이디: "+a.getId());
		System.out.println("b의 아이디: "+b.getId());
		
		//static 메서드 호출
		System.out.println("생성된 아이디 수: "+Id.getCounter());
	}
}
