package strindemo;

public class StringBufferdemo {
	public static void main(String[] args) {
		int N = 77777777;
		long t;
		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			for (int i = N; i-- > 0;) {
				sb.append("x");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
		{
			StringBuilder sb1 = new StringBuilder();
			t = System.currentTimeMillis();
			for (int i = N; i > 0; i--) {
				sb1.append("y");
			}
			System.out.println(System.currentTimeMillis() - t);
		}
	}
}
