package myJava.design_pattern.abstract_factory;
/**
 * 
 * 抽象工厂
 * 
 * <p>
 * <a href="AbstractFactory.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0
 */
public abstract  class AbstractFactory {
	abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
