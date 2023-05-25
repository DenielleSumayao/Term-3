package InheritanceOverriding;

public class Main {

	public static void main(String[] args) {
		ToyotaVIOS vios = new ToyotaVIOS();
		vios.drive();
		vios.stop();
		
		System.out.println("\nTOYOTA VIOS SPECIFICATIONS:");
        System.out.println("Name: " + vios.name);
        System.out.println("Price: P" + vios.price);
        System.out.println("Speed: " + vios.speed + " km/h");
        System.out.println("Color: " + vios.color);
        System.out.println("Tire Type: " + vios.tireType);
        
        
	}

}
