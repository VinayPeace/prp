package basics;

public class Carblue {
	String model;
	double speed;
	
	public Carblue() {
	}
	
		public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

		public boolean start() {
			return true;
		}
		
					public  void accelerate() {
					}
					public static void main(String []args) {
						Carblue car1=new Carblue();
						Carblue car2=new Carblue();
						
						car1.speed=20.0;
						car2.speed=30.0;
						
						System.out.println(car1.speed);
						System.out.println(car2.speed);
						}
}

