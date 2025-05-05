package class_70_Collection_List_Set_Diff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Collection_ArrayList_Iterator {
	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("l1");
		l1.add(13);
		l1.add("90");
		l1.add("Sun");
		l1.add("Moon");
		System.out.println(l1);// List follow Indexing

		/*
		 * Iterator i2 = l1.iterator(); while(i2.hasNext()) //hasNext is going to check
		 * whether my return true iteration has more elements in it {
		 * System.out.println(i2.next()); }
		 */
		ListIterator i3 = l1.listIterator();
		System.out.println("Traversing in forward direction");
		while (i3.hasNext()) {
			System.out.println(i3.next());
		}
		System.out.println("Traversing in backward direction");
		while (i3.hasPrevious()) {
			System.out.println(i3.previous());
		}

	}

}
