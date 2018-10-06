package javapatterndemo;

public class test122 {
	 

	public static void main(String[] args) {
		
		SingletonDemo obj = new SingletonDemo();
		SingletonDemo ssx = obj.getInstance();
		//ssx.s="testing this class";
		System.out.println(ssx.s);
	}
}
