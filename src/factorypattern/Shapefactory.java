package factorypattern;

public class Shapefactory {
	
	public Shape getShape(String shapetype){
		
		if (shapetype == null){
			return null ;	
		}
		if (shapetype.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		if (shapetype.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
			
		return null ;	
	}

}
