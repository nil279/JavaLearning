package filesneed;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/*
 * Class to read and write to property files 
 */

public class PropertyFile {

	protected Properties props = new Properties();
	protected File file;
	protected String comment = null;

	public PropertyFile() {
	}

	public PropertyFile(String Directory, String filename) {
		init(new File(Directory, filename));
	}

	private void init(File PropertyFile) {
		try {
			file = PropertyFile;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public String retrieveValue(String keyName) {
		try {
			FileReader fr = new FileReader(file);
			props.load(fr);
			fr.close();
			return props.getProperty(keyName);
		} catch (UnsupportedEncodingException e) {
			//log.error("Failed to retrieve value for key='" + keyName					+ "'. Error: " + e);
		} catch (IOException e) {
			//log.error("Failed to retrieve value for key='" + keyName					+ "'. Error: " + e);
		}
		return null;
	}
}
