package myJava.design_pattern.abstract_factory;
/**
 * 
 * 用于创建工厂
 * 
 * <p>
 * <a href="FactoryProducer.java"><i>View Source</i></a>
 * 
 * @author huanglu
 * @version 1.0
 * @since 1.0
 */
public class FactoryProducer {
	   public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	      } else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      return null;
	   }
	}
