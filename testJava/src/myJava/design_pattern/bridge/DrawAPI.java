package myJava.design_pattern.bridge;

public interface DrawAPI {
	
	public void drawCircle(int radius, int x, int y);
	
}

class RedCircle implements DrawAPI {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: red, radius: "
	         + radius +", x: " +x+", "+ y +"]");
	   }
	}
class GreenCircle implements DrawAPI {
	   @Override
	   public void drawCircle(int radius, int x, int y) {
	      System.out.println("Drawing Circle[ color: green, radius: "
	         + radius +", x: " +x+", "+ y +"]");
	   }
	}