package InheritanceOverriding;

class ToyotaVIOS extends Vehicle {
	
	 String name = "Toyota VIOS";
	 String speed = "180";
	 String color = "Silver Grey";
	 String price = "425,000.00";
	 String tireType = "Off-road";
	 
	 @Override
	 public void stop() {
		 //super.stop();//
		 System.out.println("Toyota VIOS has stopped.");
	 }
	 
	 public void drive() {
		 System.out.println("Toyota VIOS is driving.");
	 }
}
