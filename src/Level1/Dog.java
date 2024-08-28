package Level1;

public class Dog {
	protected String breed;
	protected int age;
	protected double weight;
	
	public Dog(String breed,int age,double weight) {
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}
	
	public int dogAge() {
		int dogage = 0;
		switch (age){
		case 1:
			System.out.println("Dogs age in human years is: ");
			dogage = 15;
			break;
		case 2:
			System.out.println("Dogs age in human years is: ");
			dogage = 24;
			break;
		case 3:
			System.out.println("Dogs age in human years is: ");
			dogage = 28;
			break;
		case 4:
			System.out.println("Dogs age in human years is: ");
			dogage = 32;
			break;
		case 5:
			System.out.println("Dogs age in human years is: ");
			dogage = 36;
			break;
		case 6:
			System.out.println("Dogs age in human years is: ");
			dogage = 40;
			break;
		case 7:
			System.out.println("Dogs age in human years is: ");
			dogage = 44;
			break;
		case 8:
			System.out.println("Dogs age in human years is: ");
			dogage = 48;
			break;
		case 9:
			System.out.println("Dogs age in human years is: ");
			dogage = 52;
			break;
		case 10:
			System.out.println("Dogs age in human years is: ");
			dogage = 56;
			break;
		case 11:
			System.out.println("Dogs age in human years is: ");
			dogage = 60;
			break;
		case 12:
			System.out.println("Dogs age in human years is: ");
			dogage = 64;
			break;
		case 13:
			System.out.println("Dogs age in human years is: ");
			dogage = 68;
			break;
		case 14:
			System.out.println("Dogs age in human years is: ");
			dogage = 72;
			break;
		case 15:
			System.out.println("Dogs age in human years is: ");
			dogage = 76;
			break;

		}
		return dogage;
	}
	
	public void dogDetails() {
		System.out.println("Your Dog Details: ");
		System.out.println("Breed: "+ breed);
		System.out.println("Age: "+ age);
		System.out.println("Weight: "+ weight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dg = new Dog("German", 3,12.5);
		
		dg.dogDetails();
		System.out.println(dg.dogAge());
		
	}

}
