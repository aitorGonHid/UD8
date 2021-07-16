
public class UD8Appp {

	public static void main(String[] args) {
		// Check constructors for Electrodomestico Class
		Electrodomestico nevera1 = new Electrodomestico();
		Electrodomestico nevera2 = new Electrodomestico(100,10);
		Electrodomestico nevera3 = new Electrodomestico(1000,"roJo",'b',50);
		
		System.out.println(nevera1.toString());
		System.out.println(nevera2.toString());
		System.out.println(nevera3.toString());
		
	}

}
