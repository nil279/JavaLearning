package factorypattern;

//https://www.tutorialspoint.com/design_pattern/abstract_factory_pattern.htm

public class FactoryPatternDemo {

	
	public static void main(String[] args) {
		
		Shapefactory shapeFactory = new Shapefactory();
	      
		//get an object of Circle and call its draw method.
	      Shape shape1 = shapeFactory.getShape("CIRCLE");
	    
	    //call draw method of Circle
	      shape1.Draw();
	      
	      
	      Shape shape2 = shapeFactory.getShape("square");
	      shape2.Draw();
	      
	}
}
