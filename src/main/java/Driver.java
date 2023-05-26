import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.incrementBy(5);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrementBy(2);
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
