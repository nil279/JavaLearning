package oopsconcept;

public class InheritanceChild extends InheritanceParent {
	 String mainSubject = "Physics";
	 public void myfun(){
		 System.out.println("Teaching from child class");
	 }
	 
	 public static void main(String args[]){
		 InheritanceChild obj = new InheritanceChild();
		 System.out.println(obj.designation);
		 System.out.println(obj.collegeName);
		 obj.myfun();
		 InheritanceParent obj2 = new InheritanceParent();
		 obj2.myfun();
	 }
}
