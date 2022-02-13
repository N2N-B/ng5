package mypack;

public class FinalizedGarbageCollector {
	 @SuppressWarnings("unused")
	public static void main(String[] args)
	    {
		  FinalizedGarbageCollector sti = new FinalizedGarbageCollector();
		 
	      //  String sti = new String("RR");
	        sti = null;
	  
	        // Requesting JVM to call Garbage Collector method
	        System.gc();
	        System.out.println("Main Completes");
	    }

	    // Here overriding finalize method
	    public void finalize()
	    {
	        System.out.println("finalize method overriden");
	    }

}

//It is a method that the Garbage Collector always calls just before the deletion/destroying the object which is eligible for Garbage Collection, so as to
//perform clean-up activity. Clean-up activity means closing the resources associated with that object such as Database Connection, Network Connection or 
//we can say resource de-allocation. Remember it is not a reserved keyword.

//Once the finalize method completes immediately Garbage Collector destroy that object. finalize method is present in Object class and its syntax is:
//protected void finalize throws Throwable{}

//Now, the finalize method which is present in the Object class, has an empty implementation, in our class clean-up activities are there, 
//then we have to override this method to define our own clean-up activities.

//FinalizedGarbageCollector sti = new FinalizedGarbageCollector();
//sti = null;
//Now our class i.e, FinalizedGarbageCollector class finalize method is called. 

//Output:

//finalize method overriden
//Main Completes

//So basically, Garbage Collector calls finalize method on that class object which is eligible for Garbage collection.
//So if String object is eligible for Garbage Collection then String class finalize method is going to be called and not the FinalizedGarbageCollector class 
//finalize method.

//Garbage Collector is to free heap memory by destroying unreachable objects.
//Garbage collector is best example of Daemon thread as it is always running in background.
//There are generally four different ways to make an object eligible for garbage collection.
//1.Nullifying the reference variable
//2.Re-assigning the reference variable
//3.Object created inside method
//4.Island of Isolation

//We can also request JVM to run Garbage Collector. There are two ways to do it :
//Using System.gc() method : System class contain static method gc() for requesting JVM to run Garbage Collector.
//Using Runtime.getRuntime().gc() method : Runtime class allows the application to interface with the JVM in which the application is running. 
//Hence by using its gc() method, we can request JVM to run Garbage Collector.
