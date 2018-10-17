package singletonpattern;

public class Singletondemo {

	public static void main(String[] args) {
		
		Singletonclass obj = new Singletonclass();
		Singletonclass ssx = obj.getInstance();
		//ssx.s="testing this class";
		System.out.println(ssx.s);
	}
}
