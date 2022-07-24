package practice;
import java.util.EmptyStackException;

class Queue<T>{
	class Node<T> {
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
		}
	}
	
	private Node<T> first;
	private Node<T> last;
	
	
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if(last != null) {
			last.next = t;
		}
		last = t;
		if(first == null) {
			first = last;
		}
	}
	
	public T remove() {
		if (first == null) {
			throw new EmptyStackException();
		}		
		T data = first.data; // 데이터백업
		first = first.next;
		
		if(first == null) {
			last = null;
		}
		
		return data;
	}
	
	public T peek() {
		if (first == null) {
			throw new EmptyStackException();
		}		
		
		return first.data;
	}
	
	public boolean isEmpty() {
		return first == null;
	}


}



public class MakeQueue {
	public static void main(String[] args) {
		Queue<Integer> s = new Queue<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		System.out.println(s.remove());
		System.out.println(s.remove());
		System.out.println(s.peek());
		System.out.println(s.remove());
		System.out.println(s.isEmpty());
		System.out.println(s.remove());
		System.out.println(s.isEmpty());
		
	}

}
