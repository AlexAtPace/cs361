/**
 * 
 */
package circle;

/**
 * @author Oleksandr Sverenyak
 * 
 * ANSWER TO EXERCISE 2: OLEKSANDR -> 15/2 -> 7.5 -> 7 -> Slides (6-7) name: Methods
 * 
 * EXERCISE 4: 
 * 
 * INLOAD is used to load an integer from local variable onto 
 * the operand stack.
 * IINC is used to increment values, so in our case it acts as i++
 * GOTO in simple terms creates a loop. It "goes" to a certain line
 * 
 * In Java byte code we also used:
 * ISTORE does the opposite of INLOAD, ISTORE stores values from
 * the stack to local variable.
 * 
 * I discovered that GOTOS can be used as a for loop and that is very a interesting of performing iteration.
 * It may not have been intended to be used in that way, but I believe it is a clever use of GOTO
 */

// TODO Complete the code

public class Circle extends GraphicObject implements Cloneable{

	// No use of encapsulation
	public double centerX, centerY;
	public double radius;
	public int windowNumber;

	/**
	 * 
	 */
	public Circle() {
	}

	// overloaded method in Circle
	// overridden method from GraphicObject
	@Override
	void draw() {
		System.out.println("Drawing a Circle...");
	}

	// overloaded method in Circle
	// Not overridden as it does follow the signature in GraphicObject
	public void draw(int color) {
		System.out.println("Drawing a Circle in color...");
	}

	public double circumference() {
		return 2.0 * 3.141529 * radius;
	}

	public double area() {
		return 3.141529 * radius * radius;
	}

	public boolean overlaps(Circle other) {
		return ((centerX - other.centerX) * (centerX - other.centerX)
				+ (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
						* (radius + other.radius));
	}

	@Override
	void moveTo(int newX, int newY) {
	}

	// TODO To complete
	/**
	 * @return the Circle with this EXACT format Circle: centerX = ... centerY = ... radius = ...
	 */
	@Override
	public String toString() {
		return "Circle: centerX = " + centerX + " centerY = " + centerY + " radius = " + radius + "";
	}

	// TODO To complete
	// TODO Be sure that you understand the difference between equals and ==
	/**
	 * @return true if this and obj have the same values for
	 * centerX, centerY and radius
	 */
	@Override
	public boolean equals(Object obj) {
		Circle circ = (Circle) obj;
		if(this == obj){
			return true;
		}
		if(this.centerX == circ.centerX && this.centerY == circ.centerY && this.radius == circ.radius){
			return true;
		}

		if(obj == null){
			return false;
		}

		return false;

	}

	// TODO To complete
	/**
	 * @return an exact copy of the Circle that is a new instance 
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Circle cloned = (Circle) super.clone();
		cloned.centerX = this.centerX;
        cloned.centerY = this.centerY;
        cloned.radius = this.radius;
		return cloned;
	}

}
