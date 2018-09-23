package oopsconcept;

public class InterfaceMamal implements Interfaceanimal {

	@Override
	public void eat() {
		 System.out.println("Mammal eats");		
	}

	@Override
	public void travel() {
		 System.out.println("Mammal travels");
	}

	 public int noOfLegs() {
	      return 0;
	   }

	 public static void main(String[] args) {
		System.out.println();
		
		InterfaceMamal obj = new InterfaceMamal();
		obj.eat();
		obj.travel();
	}
}
