package class_74_StringBuilder_And_StringBuffer;

public class StringBuilder {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Chandan");
		s = s.append(" Kumar Pandey");// its modified
		System.out.println(s);

		String b = "Chandan";
		b = b.concat(" Kumar Pandey");// The String is immutable something which can't be changed called immutable
		System.out.println(b);

	}

}
