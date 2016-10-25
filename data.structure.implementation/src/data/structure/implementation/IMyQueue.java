/**
 * 
 */
package data.structure.implementation;

/**
 * @author Suyash Implements base methods for MyQueue class. More methods to be
 *         implemented soon
 */
public interface IMyQueue {
	/**
	 * Adds the given string element to the Queue
	 * 
	 * @param element
	 *            Element to be added to the queue
	 */
	public void add(String element);

	/**
	 * Retrieves, but does not remove, the head of this queue, or returns null
	 * if this queue is empty.
	 * 
	 * @return Head of the queue or null
	 */
	public String peek();

	/**
	 * Retrieves and removes the head of this queue, or returns null if this
	 * queue is empty.
	 * 
	 * @return Element of the queue or null
	 */
	public String poll();
}