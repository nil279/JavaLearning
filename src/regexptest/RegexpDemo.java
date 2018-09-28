package regexptest;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.apache.log4j.Logger;

public class RegexpDemo {

    public static void main(String[] args) {

    	Logger logger = Logger.getLogger(RegexpDemo.class);
    	
    	/*
    	String product = ".*http://.*";
        String text    =
          "This is the text to be searched " +
           "for occurrences of the http:// pattern.";
        String patternString = ".*http://.*";
    	*/

    	String text    = "EOD_abc_12345678_ABCD_12345678";
    	String patternString = "^EOD_(.*)_[0-9]{8}_(.*)_[0-9].*";

        Pattern pattern = Pattern.compile(patternString);
    
        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();        
        
        if(matches){
        	System.out.println("String matches = " + matches);
        }else{
        	
        }
        
        logger.info(matches);
        
        
        String prod = matcher.group(0);  
        System.out.println(prod);
                
        String product = "EOD_abc_12345678_ABCD_12345678";
    	
        if (prod.equalsIgnoreCase(product)){
        		System.out.println("matches");
        }else{
        	
        	System.out.println("doesnt match");
        }
    }
}
