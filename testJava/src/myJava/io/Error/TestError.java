package myJava.io.Error;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestError {

	public static void main(String[] args) {
		try {
			    InputStream input = new FileInputStream("c:\\datas\\...");
			    System.out.println("File opened..."+input );
			 
			} catch (IOException e) {
			    System.err.println("File opening failed:");
			    e.printStackTrace();
		
			 
			
			}

	}
}
