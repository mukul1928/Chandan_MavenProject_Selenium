package class_72_73_Stack_and_Vector_Class_in_Collection_FindXs_And_FindYs_ScrollUp_ScrollDown;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("Jyoti");
		v.add(15.3);
		Enumeration e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
