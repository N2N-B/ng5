package mypack;

public class NullPointerException {
	  public static void main(String[] args) 
	   {
	      String s = null;
	      System.out.println( s.toString() );   // 's' is un-initialized and is null
	   }

}
//NullPointerException is an unchecked exception.