package pack2;

import java.util.*;

public class SuppressWarningsAnnotations {
	@SuppressWarnings("unchecked")

	public static void main(String args[]) {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");

		for (Object obj : list)
			System.out.println(obj);

	}

}

///Java Annotations
////Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to
////indicate some additional information which can be used by java compiler and JVM.

//@SuppressWarnings
//@SuppressWarnings annotation: is used to suppress warnings issued by the compiler.

//If you remove the @SuppressWarnings("unchecked") annotation, it will show warning at compile time 
//because we are using non-generic collection.