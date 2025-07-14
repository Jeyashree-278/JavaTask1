package javatask3;

public class Circle {

	int radius;
	float pi;
	public Circle()
	{
		System.out.println("Its a circle class default constructor");
	}
	public Circle(float pi,int radius)
	{
		this.pi=pi;
		this.radius=radius;
		
		
	}
	public void calculateCircumference()
	{
		float cir=2*pi*radius;
		System.out.println(cir); 
	}
	public static void main(String[] args) {
		Circle c =new Circle();
		Circle c1=new Circle(3.14f,2);
		c1.calculateCircumference();
		
		
		// TODO Auto-generated method stub

	}

}
