package pack2;

class A {
	void m() {
		System.out.println("hello m");
	}

	@Deprecated
	void n() {
		System.out.println("hello n");
	}
}

public class DeprecatedAnnotations {

	public static void main(String args[]) {

		A a = new A();
		a.n();
	}

}

///Java Annotations
////Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to
////indicate some additional information which can be used by java compiler and JVM.


//@Deprecated
//@Deprecated annoation marks that this method is deprecated so compiler prints warning. 
//It informs user that it may be removed in the future versions. So, it is better not to use such methods.

//At Compile Time:
//Note: DeprecatedAnnotations.java uses or overrides a deprecated API.

//Note: Recompile with -Xlint:deprecation for details.