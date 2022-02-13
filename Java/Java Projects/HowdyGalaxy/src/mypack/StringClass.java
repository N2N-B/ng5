package mypack;

public class StringClass {

	public static void main(String[] args) {
		String s1 = "AllisWell";
		String s2 = "CoolBaby";

		System.out.println("Original String is: " + s1);
		System.out.println(s1.length());
		System.out.println(s1.substring(4));

		s1 = s1.concat("NarenBagavathy");
		System.out.println("String gets concatenated : " + " " + s1);

		System.out.println(s1.compareTo(s2));
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());

		// converts datatypes into string
		int a1 = 80;
		String sdt = String.valueOf(a1);
		System.out.println(sdt);
		// replace string
		String repalce = s2.replace('o', 'u');
		System.out.println(repalce);
		// contains("")
		System.out.println(repalce.contains("u"));
		// equals
		String x = "Welcome to my galaxy";
		String y = "Welcome to my galaxy";
		System.out.println(x.equals(y));
		// charAt
		System.out.println(x.charAt(7));
		// endsWith
		System.out.println(y.endsWith("y"));

		// StringBuffer
		StringBuffer sr = new StringBuffer("Welcome to my space");
		System.out.println(sr);

		// StringBuffer append and insert method
		StringBuffer se = new StringBuffer("Welcome to my home");
		se.append(" " + "Have a ball");
		System.out.println(se);
		se.insert(4, 'u');
		System.out.println(se);

		// StringBuilder
		StringBuilder sb = new StringBuilder("Welcome to my universe");
		System.out.println(sb);

		// StringBuilder append and insert method
		StringBuilder sbr = new StringBuilder("Welcome to my universe");
		sbr.append(" " + "Have a football");
		System.out.println(sbr);
		sbr.insert(3, 'u');
		System.out.println(sbr);
		
		String str = new String("naren");
	    str = "prashanth";
		System.out.println(str);




	}

}



//In Java, string is basically an object that represents sequence of char values. 

//For example:

//char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
//String s=new String(ch);  
//is same as:

//String s="javatpoint";  
//Java String class provides a lot of methods to perform operations on strings such as compare(), concat(),
//equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.

//The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.

//CharSequence Interface
//The CharSequence interface is used to represent the sequence of characters. 
//String, StringBuffer and StringBuilder classes implement it. 
//It means, we can create strings in Java by using these three classes.

//The Java String is immutable which means it cannot be changed. 
//Whenever we change any string, a new instance is created.
//For mutable strings, you can use StringBuffer and StringBuilder classes.