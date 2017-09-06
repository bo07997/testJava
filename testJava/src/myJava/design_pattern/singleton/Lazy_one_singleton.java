package myJava.design_pattern.singleton;
/**
 * 
 * 是否 Lazy 初始化：是
是否多线程安全：否
实现难度：易
描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，
所以严格意义上它并不算单例模式。
这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。
 * 
 * <p>
 * <a href="Lazy_one_singleton.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0
 */
public class Lazy_one_singleton {
	 private static Lazy_one_singleton instance;  
	    private Lazy_one_singleton (){}  
	  
	    public static Lazy_one_singleton getInstance() {  
	    if (instance == null) {  
	        instance = new Lazy_one_singleton();  
	    }  
	    return instance;  
	    }  
}
