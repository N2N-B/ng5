package javacollection;

import java.util.*;

public class QueueExample {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		QueueExample queueExample = new QueueExample();
		Queue queue = queueExample.createQueuelistForIntegers();
		queueExample.printQueuelistForIntegers(queue);
	}

	@SuppressWarnings("rawtypes")
	private Queue createQueuelistForIntegers() {
		PriorityQueue<Integer> queueofintegers = new PriorityQueue<Integer>();// Creating Queuelist of integers
		queueofintegers.add(100);// Adding first object in Queuelist
		queueofintegers.add(200);// Adding second object in Queuelist
		queueofintegers.add(260);// Adding third object in Queuelist
		queueofintegers.add(40);// Adding fourth object in Queuelist
		return queueofintegers;
	}

	@SuppressWarnings("rawtypes")
	private void printQueuelistForIntegers(Queue queue) {
		System.out.println("Retrieve the head of the list using peek: " + queue.peek());
		System.out.println("Retrieve & remove the head of the queue using poll - 1st attempt: " + queue.poll());
		System.out.println("Retrieve & remove the head of the queue using poll - 1st attempt: " + queue.poll());
		// Traversing list through for-each loop
		for (Object traversingQueuelistForIntegersThroughForEachLoop : queue) {
			System.out.println(traversingQueuelistForIntegersThroughForEachLoop);

		}
	}

}


//Queue Interface
//Queue interface maintains the first-in-first-out order.
//It can be defined as an ordered list that is used to hold the elements which are about to be processed.
//There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
//
//Queue interface can be instantiated as:
//
//Queue<String> q1 = new PriorityQueue();  
//Queue<String> q2 = new ArrayDeque();  

//Queue Interface declaration
//public interface Queue<E> extends Collection<E>  

//PriorityQueue
//The PriorityQueue class implements the Queue interface. 
//It holds the elements or objects which are to be processed by their priorities. 
//PriorityQueue doesn't allow null values to be stored in the queue.
//PriorityQueue<Integer> queueofintegers = new PriorityQueue<Integer>();// Creating Queuelist of integers
