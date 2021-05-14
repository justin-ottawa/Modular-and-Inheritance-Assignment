import java.util.Scanner;
//Main Class
public class Shape { 
	public double length;
	public double width;
	public double height;
	public double base;
	public double PI;
	public double radius;
	public String shapeType;
	//Constructor
	public Shape() {
		length = 0.0;
		width = 0.0;
		height = 0.0;
		base = 0.0;
		PI = Math.PI;
		radius = 0.0;
		shapeType = null;
	}
	//encapsulation
	protected void setLength(double newValue) {
		this.length = newValue;
	}
	protected void setWidth(double newValue) {
		this.width = newValue;
	}
	protected void setHeight(double newValue) {
		this.height = newValue;
	}
	protected void setBase(double newValue) {
		this.base = newValue;
	}
	protected void setRadius(double newValue) {
		this.radius = newValue;
	}
	protected void setShape(String newShape) {
		this.shapeType = newShape;
	}
	//Main Method
	public static void main(String[] args) {
		//Instantiation for main method
		Scanner in = new Scanner(System.in);
		Shape sh = new Shape();
		//used to kill the while loop
		boolean key = true;
		while(key) {
			System.out.print("Please state the type of your shape (rectangle, triangle, circle): ");
			String inputShape = in.next();
			sh.setShape(inputShape);
			
			switch(sh.shapeType) {
			//Rectangle case
			case "Rectangle":
			case "rectangle":
			case "Rect":
			case "rect":
			case "R":
			case "r":
				//Instantiation
				Rectangle r = new Rectangle();
				//input length
				System.out.print("What is your length: ");
				double inputValue_length = in.nextDouble();
				r.setLength(inputValue_length);
				//input width 
				System.out.print("What is your width: ");
				double inputValue_width = in.nextDouble();
				r.setWidth(inputValue_width);
				//Calling helper method
				r.output();
				//Closing scanner / while loop / switch case
				in.close();
				key = false;
				break;
			//Triangle case
			case "Triangle":
			case "triangle":
			case "Tri":
			case "tri":
			case "T":
			case "t":
				//Instantiation
				Triangle t = new Triangle();
				//Input height
				System.out.print("What is your height: ");
				double inputValue_height = in.nextDouble();
				t.setHeight(inputValue_height);
				//Input base
				System.out.print("what is your base: ");
				double inputValue_base = in.nextDouble();
				t.setBase(inputValue_base);
				//Input side A and side B
				System.out.println("Please input 2 extra values for your perimeter (side A and side B)");
				System.out.print("Side A: ");
				double inputValue_a = in.nextDouble();
				t.setLength(inputValue_a);
				System.out.print("Side B: ");
				double inputValue_b = in.nextDouble();
				t.setWidth(inputValue_b);
				//Calling helper method
				t.output();
				//Closing scanner / while loop / switch case
				in.close();
				key = false;
				break;
			//Circle case
			case "Circle":
			case "circle":
			case "Circ":
			case "circ":
			case "C":
			case "c":
				//Instantiation
				Circle c = new Circle();
				//Input radius
				System.out.print("What is your radius: ");
				double inputValue_radius = in.nextDouble();
				c.setRadius(inputValue_radius);
				//Calling helper method
				c.output();
				//Closing Scanner / while loop / switch case
				in.close();
				key = false;
				break;
			//If no case is stated
			default:
				System.out.println("That is not a valid shape, please check if it is spelled correctly.");
			}
		}
	}
}
//Rectangle Class
class Rectangle extends Shape{
	//Area Method for rectangles
	public double calcArea() {
		double area = this.length * this.width;
		area = (double)Math.round(area*100d) / 100d;
		return area;
	}
	//Perimeter Method for rectangles
	public double calcPerim() {
		double perimeter = (this.length * 2.0) + (this.width * 2);
		perimeter = (double)Math.round(perimeter*100d) / 100d;
		return perimeter;
	}
	//Helper Method for rectangles
	public void output() {
		System.out.println("The area is " + calcArea());
		System.out.println("The perimeter is " + calcPerim());
	}
}
//Triangle Class
class Triangle extends Shape{
	//Area Method for triangles
	public double calcArea() {
		double area = 0.5 * this.base * this.height;
		area = (double)Math.round(area*100d) / 100d;
		return area;
	}
	//Perimeter Method for triangles
	public double calcPerim() {
		double perimeter = this.length + this.width + this.base;
		perimeter = (double)Math.round(perimeter*100d) / 100d;
		return perimeter;
	}
	//Helper Method for triangles
	public void output() {
		System.out.println("The area is " + calcArea());
		System.out.println("The perimeter is " + calcPerim());
	}
}
//Circle class
class Circle extends Shape{
	//Area Method for circles
	public double calcArea() {
		double area = this.PI * (this.radius * this.radius);
		area = (double)Math.round(area*100d) / 100d;
		return area;
	}
	//Perimeter Method for circles
	public double calcPerim() {
		double perimeter = 2 * this.PI * this.radius;
		perimeter = (double)Math.round(perimeter*100d) / 100d;
		return perimeter;
	}
	//Helper Method for circles
	public void output() {
		System.out.println("The area is " + calcArea());
		System.out.println("The circumfrence is " + calcPerim());
	}
}
