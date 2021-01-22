public class Octagon extends GeometricObject {
	Octagon (double length) { 
		this.area = (1+Math.sqrt(2))*2*length;
		this.length = length;
	}

	public String toString() {
		return "Area of Octagon of side length " + this.length + " is " + this.area;
	}
}