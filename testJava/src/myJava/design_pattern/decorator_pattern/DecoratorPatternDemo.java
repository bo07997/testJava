package myJava.design_pattern.decorator_pattern;

public class DecoratorPatternDemo {
	/**
	 * @desc: 函数的目的/功能
	 * @param args
	 * @author: dianbo
	 * @date: 2017年9月14日 上午10:46:14
	*/
	public static void main(String[] args) {

	      Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle());

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
}
