package myJava.design_pattern.prototype;
/**
 * 
 * 原型模式
 * 
 * <p>
 * <a href="PrototypePatternDemo.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0
 */
public class PrototypePatternDemo {
	 public static void main(String[] args) {
	      ShapeCache.loadCache();

	      Shape clonedShape = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape.getType());		

	      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	      System.out.println("Shape : " + clonedShape2.getType());		

	      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	      System.out.println("Shape : " + clonedShape3.getType());		
	   }
}
