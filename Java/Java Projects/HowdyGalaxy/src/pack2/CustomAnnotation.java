package pack2;

//Creating annotation  
import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
	int value();
}

//Applying annotation  
class Hello {
	@MyAnnotation(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}

//Accessing annotation  

public class CustomAnnotation {

	public static void main(String args[]) throws Exception {

		Hello h = new Hello();
		Method m = h.getClass().getMethod("sayHello");

		MyAnnotation manno = m.getAnnotation(MyAnnotation.class);
		System.out.println("value is: " + manno.value());
		h.sayHello();
	}

}

//Java Annotations
//Java Annotation is a tag that represents the metadata i.e. attached with class, interface, methods or fields to
//indicate some additional information which can be used by java compiler and JVM.

//Java Custom Annotations
//Java Custom annotations or Java User-defined annotations are easy to create and use.
//The @interface element is used to declare an annotation. For example:
//
//@interface MyAnnotation{}  