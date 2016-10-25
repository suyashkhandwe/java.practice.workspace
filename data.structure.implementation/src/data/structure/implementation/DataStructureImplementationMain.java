/**
 * 
 */
package data.structure.implementation;

/**
 * @author Suyash Main entry for the code
 */
public class DataStructureImplementationMain {

	/**
	 * @param args
	 *            : Command line arguments for main method
	 */
	public static void main(String[] args) {
		MyStack testStack = new MyStack();

		testStack.push("100");
		System.out.println(testStack.empty());
		System.out.println(testStack.peek());
		testStack.push("x");
		System.out.println(testStack.search("x"));
		System.out.println(testStack.pop());
		System.out.println(testStack.search("x"));
		System.out.println(testStack.pop());
	}
}