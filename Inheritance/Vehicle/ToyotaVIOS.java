package InheritanceOverriding;

class ToyotaVIOS extends Vehicle {
	
	 String name = "Toyota VIOS";
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
