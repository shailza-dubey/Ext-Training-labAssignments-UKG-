package q1;

public class Circle {
	private double radius=1.0;
	private String color="Red";
	private final double PI = 3.14;
	
	public Circle(){
		
	}
	public Circle(double r)
	{
		radius=r;
	}
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}

	public static void main(String[] args) {
		Circle circle = new Circle(5.56);
		double area = circle.getArea();
		System.out.println(area);
		

	}

}
