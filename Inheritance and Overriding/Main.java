package InheritanceOverriding;

public class Main {

	public static void main(String[] args) {
		ToyotaVIOS vios = new ToyotaVIOS();
		
		vios.drive();
		vios.stop();
		
		System.out.println("\nToyota VIOS Specifications:");
        System.out.println("Name: " + vios.name);
        System.out.println("Price: P" + vios.price);
        System.out.println("Speed: " + vios.speed + " km/h");
        System.out.println("Color: " + vios.color);
        System.out.println("Tire Type: " + vios.tireType);
        
   	    System.out.println("--------------------------------");
   	    
		U2SpyPlane plane = new U2SpyPlane();
		
		plane.fly();
		plane.stop();
		
		System.out.println("\nU-2 Spy Plane Specifications:");
        System.out.println("Name: " + plane.name);
        System.out.println("Price: P" + plane.price);
        System.out.println("Speed: " + plane.speed + " km/h");
        System.out.println("Color: " + plane.color);
		System.out.println(plane.speed + "km/h");
		System.out.println(plane.color);
		System.out.println("Php " + plane.price);
		System.out.println("Wingspan: " + plane.wingspan + " m");
		
   	    System.out.println("--------------------------------");
   	    
		FandangoYacht boat = new FandangoYacht();
		
		boat.sail();
		boat.stop();
		
		System.out.println("\nFandango Yacht Specifications:");
        System.out.println("Name: " + boat.name);
        System.out.println("Price: P" + boat.price);
        System.out.println("Speed: " + boat.speed + " km/h");
        System.out.println("Color: " + boat.color);
		System.out.println(boat.speed + "km/h");
		System.out.println(boat.color);
		System.out.println("Php " + boat.price);
		System.out.println("Main Sail Color: " + boat.mainsailcolor);
	}

}

