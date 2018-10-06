public class methodExample {

    public void print() {

        System.out.println("Print method without parameters.");

    }
    public String abc(String str)  {
    	return str;
    }
    
    public int abc(Integer inte)  {
    	return inte;
    }

    public void print(String name) {

        System.out.println("Print method with parameter");

    }

    public static void main(String args[]) {

        //methodExample obj1 = new methodExample();

      //  obj1.print();

        //obj1.print("xx");
    	methodExample vv = new methodExample();
    	String xx = vv.abc("Nilesh");
    	int xc = vv.abc(5);
    	System.out.println(xx);
    	System.out.println(xc);

    }

}