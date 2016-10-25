/**
 * 
 */
package data.structure.implementation;

import java.util.Stack;

/**
 * @author Suyash MyStack class exposes methods to handle basic functions in a
 *         stack
 */
public class MyStack implements IMyStack {

	Stack stack = null;

	/**
	 * Creates a new stack
	 */
	public MyStack() {
		stack = new Stack();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyStack#empty()
	 */
	@Override
	public boolean empty() {
		return stack.empty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyStack#peek()
	 */
	@Override
	public String peek() {
		return (String) stack.peek();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyStack#pop()
	 */
	@Override
	public String pop() {
		return (String) stack.pop();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyStack#push(java.lang.String)
	 */
	@Override
	public String push(String item) {
		return (String) stack.push(item);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see data.structure.implementation.IMyStack#search(java.lang.String)
	 */
	@Override
	public int search(String item) {
		return stack.search(item);
	}

}
