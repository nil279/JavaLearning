
public class Uniquechar2 {

	static {
		System.out.println("THis is static block");
	}

	public static void main(String[] args) {
		System.out.println("test");
		String str = "niiiiinileshnileshpatelnileshpatelleshnileshpatelttttteeeennnnniiiillleesshhpatellsss";
		String temp = "";

		for (int i = 0; i < str.length(); i++) {

			if (temp.indexOf(str.charAt(i)) == -1) {
				temp = temp + str.charAt(i);
			}

		}
		System.out.println(temp);

	}

	public class world {

		//// ..........

	}

	public class continenet extends world {

		// ............

	}

	public class country extends continenet {

		// ......................

	}

}
