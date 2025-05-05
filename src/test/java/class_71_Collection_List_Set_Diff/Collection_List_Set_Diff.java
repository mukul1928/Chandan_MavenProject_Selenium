package class_71_Collection_List_Set_Diff;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_List_Set_Diff {

	public static void main(String[] args) {
		System.out.println("List Behaviour");

		List l1 = new ArrayList();
		l1.add("l1");
		l1.add(13);
		l1.add("90");
		l1.add("Sun");
		l1.add("Moon");
		System.out.println(l1);// List follow Indexing
		l1.add("Moon");
		System.out.println(l1);// List allow duplicates
		l1.add(null);
		l1.add(null);
		System.out.println(l1);// it accepts the multiple null
		//order of insertion it follow

		System.out.println("Set Behaviour");

		Set s1 = new HashSet();
		s1.add("pencil");
		s1.add("place");
		s1.add("pen");
		s1.add("pendrive");
		s1.add("peacock");
		System.out.println(s1);// Set doesn't follow Indexing
		s1.add("peacock");
		System.out.println(s1);// Set doesn't allow duplicates
		s1.add(null);
		s1.add(null);
		System.out.println(s1);// it doesn't accept the multiple null
		//it doesn't follow the order of insertion

	}

}
