package class_71_Collection_List_Set_Diff;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set_Iterator {
	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add("pencil");
		s1.add("place");
		s1.add("pen");
		s1.add("pendrive");
		s1.add("peacock");
		System.out.println(s1);

		Iterator i2 = s1.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}
