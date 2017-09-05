package myJava.design_pattern.factory;

/**
 * 
 * 优点： 1、一个调用者想创建一个对象，只要知道其名称就可以了。
 *            2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 *            3、屏蔽产品的具体实现，调用者只关心产品的接口。
 * 缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，
 *           在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 * 
 * <p>
 * <a href="FactoryPatternDemoTest.java"><i>View Source</i></a>
 * 
 * @author huanglu
 * @version 1.0
 * @since 1.0
 */
public class FactoryPatternDemoTest {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// 调用 Circle 的 draw 方法
		shape1.draw();

		// 获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取 Square 的对象，并调用它的 draw 方法
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// 调用 Square 的 draw 方法
		shape3.draw();
	}
}
