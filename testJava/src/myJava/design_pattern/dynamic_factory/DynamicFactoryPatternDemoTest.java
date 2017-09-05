package myJava.design_pattern.dynamic_factory;

/**
 * 
 * 优点： 1、一个调用者想创建一个对象，只要知道其名称就可以了。
 *            2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 *            3、屏蔽产品的具体实现，调用者只关心产品的接口。
 *
 * 
 * <p>
 * <a href="FactoryPatternDemoTest.java"><i>View Source</i></a>
 * 
 * @author huanglu
 * @version 1.0
 * @since 1.0
 */
public class DynamicFactoryPatternDemoTest {
	public static void main(String[] args) {

		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = (Shape) ShapeFactory.getClass(Circle.class);

		// 调用 Circle 的 draw 方法
		shape1.draw();

	}
}
