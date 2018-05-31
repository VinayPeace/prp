package basics;

public class CarExample {
	public static void main(String []args) {
		Carblue car=new Carblue();
		
		 car.setSpeed((200));
		 CarExample carExample = new CarExample();
		 
		 carExample.aMethod(car);
		 System.out.println("speed"+car.getSpeed());
	}
	public void aMethod(Carblue car) {
		car.setSpeed(300);
		
	}
}
