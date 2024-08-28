package Level1;

public class Phone {
	protected String make;
	protected String model;
	protected int storage;
	
	public Phone(String make,String model,int storage) {
		this.make = make;
		this.model = model;
		this.storage = storage;
	}
	
	public int PhonePrice() {
		int price = 0;
		if(make.toLowerCase().contains("samsung") && make.toLowerCase().contains("ultra")) {
			price += 200;
		}else {
			price += 150;
		}
		
		price += storage*10;
		
		return price;
	}
	
	public void phoneDetails() {
		System.out.println("Your Phone Details: ");
		System.out.println("Make: "+ make);
		System.out.println("Model: "+ model);
		System.out.println("Storage: "+ storage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone ph1 = new Phone("Samsung","Galaxy 24 Ultra",512);
		Phone ph2 = new Phone("IPhone","15 Pro Max",512);
		
		ph1.phoneDetails();
		System.out.println("Phone price: "+ ph1.PhonePrice());
		
		
		ph2.phoneDetails();
		System.out.println("Phone price: "+ ph1.PhonePrice());
	}

}
