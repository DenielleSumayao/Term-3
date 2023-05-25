package InheritanceOverriding;

public class FandangoYacht extends Vehicle{
	
	 String name = "Fandango Yacht";
	 String speed = "33";
	 String color = "White";
	 String price = "3,100,000.00";
	 String mainsailcolor = "white";
	 
	 @Override
	 public void stop() {
		 //super.stop();//
		 System.out.println("Fandango Yacht has stopped.");
	 }
	 
	 public void sail() {
		 System.out.println("Fandango Yacht is floating.");
	 }
}
