/**
 * 
 */
package mystack;

/**
 * @author Oleksandr Sverenyak
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		T popElt = theStack.val;
		theStack = theStack.next;
		return popElt;
	}

	public void push(T v) {
		theStack = new MyNode<T>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> integer = new MyStack<Integer>();
		integer.push(1);
		integer.push(2);
		integer.pop();
		integer.push(5);
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> person = new MyStack<Person>();
		person.push(new Person("Oleksandr", "Sverenyak"));
		person.push(new Person("Christelle", "Sharff"));
	}

}
