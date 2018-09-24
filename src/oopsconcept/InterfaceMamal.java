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
	 @Override
		public String origin() {
		 System.out.println("Mammal origin");
			return null;
		}

	 public static void main(String[] args) {
		System.out.println();
		
		InterfaceMamal obj = new InterfaceMamal();
		obj.eat();
		obj.travel();
	}

	
}
