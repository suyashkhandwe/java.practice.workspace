/**
 * 
 */
package data.structure.implementation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Suyash MyQueue class exposes methods to handle basic functions in a
 *         queue
 */
public class MyQueue implements IMyQueue {

	Queue queue = null;

	/**
	 * Creates a new queue
	 */
	public MyQueue() {
		queue = new LinkedList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyQueue#add(java.lang.String)
	 */
	@Override
	public void add(String element) {
		queue.add(element);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyQueue#peek()
	 */
	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return (String) queue.peek();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyQueue#poll()
	 */
	@Override
	public String poll() {
		// TODO Auto-generated method stub
		return (String) queue.poll();
	}
}