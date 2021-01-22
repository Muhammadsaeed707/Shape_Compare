public class Circle extends GeometricObject {
	Circle(double radius){
		this.area = Math.PI*2*radius;
		this.length = radius;
	}

	public String toString() {
		return "Area of Circle of radius " + this.length + " is " + this.area;
	}
}