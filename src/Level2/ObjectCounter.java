package Level2;

public class ObjectCounter {
	private static int count = 0;
	
	public ObjectCounter() {
		count++;
	}
	
	static int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCounter obj1 = new ObjectCounter();
		ObjectCounter obj2 = new ObjectCounter();
		ObjectCounter obj3 = new ObjectCounter();
		ObjectCounter obj4 = new ObjectCounter();
		
		System.out.println("Number of times object is created: "+ getCount());

	}

}
