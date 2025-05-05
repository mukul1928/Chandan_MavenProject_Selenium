package class_70_Collection_Arraylist;

import java.util.ArrayList;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		// The parameter of add method is Object
		a.add("Ram");
		a.add("Shiva");
		a.add("Sita");
		a.add(11);
		a.add(98);
		a.add(0, "Hari");// the index position of 0 I am storing Hari here
		System.out.println(a);// it follow indexing

		ArrayList a1 = new ArrayList();
		a1.add("Krishna");
		a1.addAll(a);
		System.out.println(a1);
		// a1.remove(6);//remove index object
		a1.remove(5);
		a1.remove("Hari");
		// a1.removeAll(a);
		// System.out.println(a1);
		a.set(0, "Nidhi");// set means replace here
		System.out.println(a);
		// a.clear();
		// System.out.println(a);
		System.out.println(a.contains("Sita"));
		System.out.println(a1.containsAll(a));

	}

}
