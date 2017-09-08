package myJava.design_pattern.singleton;
/**
 * 
JDK 版本：JDK1.5 起
是否 Lazy 初始化：否
是否多线程安全：是
实现难度：易
描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，
绝对防止多次实例化。这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，它不仅能避免多线程同步问题，
而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。不过，由于 JDK1.5 之后才
加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
不能通过 reflection attack 来调用私有构造方法。
 * 
 * <p>
 * <a href="Enum_singleton.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0
 */
public enum  Enum_singleton {
	    INSTANCE(1,"AAA"),INSTANCE2(2,"BBB");
	    public void whateverMethod() {  
	    }  
	    int code;
	    String value;
		private Enum_singleton(int code, String value) {
			this.code = code;
			this.value = value;
		}
	    
}
