package myJava.design_pattern.singleton;
/**
 * 
 * JDK 版本：JDK1.5 起
是否 Lazy 初始化：是
是否多线程安全：是
实现难度：较复杂
描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
getInstance() 的性能对应用程序很关键。
 * 
 * <p>
 * <a href="DCL_singleton.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0
 */
public class DCL_singleton {
	//volatile防止28行指令重排
	   private volatile static DCL_singleton singleton;  
	    private DCL_singleton (){}  
	    
	    public static DCL_singleton getSingleton() {
	    	
	    if (singleton == null) {  
	        synchronized (DCL_singleton.class) {  
	        if (singleton == null) {  
	            singleton = new DCL_singleton(); 
	            //问题所在，。但A2和A3的重排序，将导致线程B在B1处判断出instance不为空，
	         //   线程B接下来将访问instance引用的对象。此时，线程B将会访问到一个还未初始化的对象。
	        }  
	        }  
	    }  
	    
	    return singleton;  
	    }  

}
