package strindemo;
//https://stackoverflow.com/questions/355089/difference-between-stringbuilder-and-stringbuffer

public class StringBufferdemo {
	public static void main(String[] args) {
		int N = 7777777;
		long t;
		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			//for (int i = N; i-- > 0;) {
			for (int i = N; i > 0; i--){
				sb.append("x");
			}
			System.out.println(System.currentTimeMillis() - t);
			//System.out.println(sb);
		} 
		{
			StringBuilder sb1 = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb1.append("y");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
		
		StringBuffer SB3 = new StringBuffer();
		StringBuilder SB4 = new StringBuilder();
		
		String tmp = "String";
		
		SB3.append(tmp);
		SB3.append("Buffer");
		
		SB4.append(tmp);
		SB4.append("Builder");
		
		System.out.println(SB3);
		
		System.out.println(SB4);		
		
	}
}
