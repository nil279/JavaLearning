package filesneed;

import java.io.File;
import java.util.Properties;


/*
 * Class to read and write to property files 
 */

public class PropertyFile {

	protected Properties     props = new Properties();
	protected File file;
	protected String comment=null;
	
	public PropertyFile() {	}
	
	public PropertyFile(String Directory,String filename){
		init(new File(Directory, filename));
	}
	
	private void init(File PropertyFile){
		try {
				file = PropertyFile;
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
