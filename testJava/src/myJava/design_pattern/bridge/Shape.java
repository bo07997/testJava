package myJava.design_pattern.bridge;

public abstract  class Shape {
	protected DrawAPI drawAPI;
	   protected Shape(DrawAPI drawAPI){
	      this.drawAPI = drawAPI;
	   }
	   public abstract void draw();	
}

class Circle extends Shape {
	   private int x, y, radius;

	   public Circle(int x, int y, int radius, DrawAPI drawAPI) {
	      super(drawAPI);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() {
	      drawAPI.drawCircle(radius,x,y);
	   }
	}