package javapatterndemo;

import java.io.*; 

class Staticmethod{ 
      
    public static String geekName = "this is static method class"; 
      
    public static void geek(String name){ 
          
        geekName = name; 
    } 
} 
  
class GFG { 
    public static void main (String[] args) { 
          
        // Accessing the static method geek() and  
        // field by class name itself. 
    	Staticmethod.geek("Nilesh");  
        System.out.println(Staticmethod.geekName); 
         
        // Accessing the static method geek() by using Object's reference. 
        Staticmethod obj = new Staticmethod(); 
        obj.geek("Patel"); 
        System.out.println(obj.geekName);    
          
         
    } 
} 