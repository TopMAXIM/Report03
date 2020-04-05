package report03;

import java.util.NoSuchElementException;

public class SList <E extends Comparable<E>>{
	protected Node head;  // 연결 리스트의 첫 노드 가리킴
	private int size;  
	public Node getHead() {return head;}
	public void setHead(Node n) {head =n;}
	public SList() {      // 연결 리스트 생성자
		head= null;       //초기화
		size= 0;          //초기화
	}
	
	public int size() {return size;}
	public boolean isEmapty() {return size==0;}
	
	//탐색, 삽입, 삭제 연산을 위한 메소드 선언 
	public int search(E target) {  //target을 탐색
		Node p = head;
		for(int k =0; k<size; k++) {
			if(target==p.getItem())
				return k;
		 p = p.getNext();
		}return -1;               // 탐색을 실패한 경우 -1 리턴
	}
	
	public void insertFront(E newItem) { //연결리스트 맨 앞에 새 노드 삽입
		head= new Node(newItem, head);
		size++;
	}
	
	public void insertAfter(E newItem, Node p) {//노드 p 바로 다음에 새 노드 삽입
		p.setNext(new Node(newItem, p.getNext()));
		size++;
	}
	
	public void deleteFront() { //리스트의 첫 노드 삭제
		if(size==0)
			throw new NoSuchElementException(); //강제로 예외를 발생시키다
		                                        //https://blog.hexabrain.net/125
		head= head.getNext();
		size--;
	}
	
	public void deleteAfter(Node p) { // p가 가리키는 노드의 다음 노드를 삭제
		if(p == null)
			throw new NoSuchElementException();
		Node t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);
		size--;
		
	}
	
	public void print() {//연결리스트 노드들의 항목들을 차례로 출력
	   for (Node p = head; p!=null; p= p.getNext())
		   System.out.print(p.getItem() + "\t");
	   System.out.println();
	}
	}


