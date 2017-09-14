package myJava.design_pattern.decorator_pattern;

/** 
 * 功能描述
 * 
 * <p>
 * <a href="Shape.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0 
*/
public interface  Shape {
	void draw();
}
class Rectangle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Shape: Rectangle");
	   }
	}
class Circle implements Shape {

	   @Override
	   public void draw() {
	      System.out.println("Shape: Circle");
	   }
	}