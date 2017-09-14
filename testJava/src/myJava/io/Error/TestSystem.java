package myJava.io.Error;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/** 
 * 系统输出流重定向
 * 
 * <p>
 * <a href="TestSystem.java"><i>View Source</i></a>
 * 
 * @author dianbo
 * @version 1.0
 * @since 1.0 
*/
public class TestSystem {
public static void main(String[] args) throws FileNotFoundException {
	OutputStream output = new FileOutputStream("E:\\test\\jar\\system.txt");
	PrintStream printOut = new PrintStream(output);
	System.setOut(printOut);
System.out.println("nihao");
System.out.flush();//调用flush())，确保System.out把数据输出到了文件中。
}
}
