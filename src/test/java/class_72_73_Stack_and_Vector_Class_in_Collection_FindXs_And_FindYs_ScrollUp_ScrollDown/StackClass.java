package class_72_73_Stack_and_Vector_Class_in_Collection_FindXs_And_FindYs_ScrollUp_ScrollDown;

import java.util.Enumeration;
import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add("Chandan");
		s.add("Abhishek");
		s.add("pencil");
		s.add("Pencil");
	//	System.out.println(s);
		
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
