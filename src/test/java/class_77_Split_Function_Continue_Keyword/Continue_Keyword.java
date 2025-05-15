package class_77_Split_Function_Continue_Keyword;

//Continue keyword in java can be used to skip any particular iteration
public class Continue_Keyword {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
