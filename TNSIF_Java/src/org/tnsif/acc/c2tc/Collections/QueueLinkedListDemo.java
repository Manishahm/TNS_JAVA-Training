package org.tnsif.acc.c2tc.collections;

import java.util.LinkedList;
import java.util.Queue; 

public class QueueLinkedListDemo {

	public static void main(String[] args) {
		
		Queue<Integer> queue=new LinkedList<>();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		System.out.println(queue);
		//peek at the front element without removing it
		System.out.println("Front element (using peek): " +queue.peek() );
		
		//poll -remove and return the front element
		System.out.println("Removed element(using poll): " +queue.poll());
		
		//peek again to see the new front element
		System.out.println("New front element (using peek): " +queue.peek());
		
		//remove and print the rest of the element
		System.out.println("Removed element(using poll): " + queue.poll());
		System.out.println("Removed elemen(using poll): " + queue.poll());
		
		//check if the queue is empty
		System.out.println("Is queue empty: " + queue.isEmpty() );
		
	}

}



