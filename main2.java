package report03;

public class main2 {

	public static void main(String[] args) {
		SList<String> s = new SList<String> (); //연결 리스트  객체 s 생성
		s.insertFront("orange"); 
		s.insertFront("apple");
		s.insertAfter("cherry", s.head.getNext());
		s.insertFront("pear");
		
		//(머리)오렌지
		//(머리)사과- 오렌지
		//(머리)사과- 오렌지- 체리 -> 머리의 다음의 다음에 체리를 추가
		//(머리)배- 사과- 오렌지- 체리
		
		s.print();
		System.out.println(": s의 길이=" + s.size()+ "\n");
		System.out.println("체리가 \t" + s.search("cherry")+ "번째에 있다.");
		System.out.println("키위가 \t" + s.search("kiwi")+ "번째에 있다.\n");
		s.deleteAfter(s.head);
		s.print();
		System.out.println(": s의 길이=" + s.size());
		System.out.println();
		s.deleteFront();
		s.print();
		System.out.println(": s의 길이=" + s.size());
		System.out.println();
		
		SList<Integer> t= new SList<Integer>(); //연결 리스트 객체 t 생성
		t.insertFront(500); t.insertFront(200);
		t.insertAfter(400, t.head);
		t.insertFront(100);
		t.insertAfter(300, t.head.getNext());
		t.print();
		System.out.println(": t의 길이=" + t.size());
		
		//(머리)500
		//(머리)200-500
		//(머리)200-400-500
		//(머리)100-200-400-500
		//(머리)100-200-300-400-500
		

	}

}
