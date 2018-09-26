package regexptest;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

import org.apache.log4j.Logger;

public class RegexpDemo {

    public static void main(String[] args) {

    	Logger logger = Logger.getLogger(RegexpDemo.class);
        String text    =
            "This is the text to be searched " +
            "for occurrences of the http:// pattern.";

        String patternString = ".*http://.*";

        Pattern pattern = Pattern.compile(patternString);
    
        Matcher matcher = pattern.matcher(text);
        boolean matches = matcher.matches();        
        logger.info(matches);
    }
}
