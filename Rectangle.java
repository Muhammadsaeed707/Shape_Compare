public class Rectangle extends GeometricObject {
	Rectangle(double length, double width) { 
		this.area = length * width;
		this.length = length;
		this.width = width;
	}

	public String toString() {
		return "Area of Rectangle with dimensions " + this.length+ " x " + this.width + " is " + this.area;
	}
}