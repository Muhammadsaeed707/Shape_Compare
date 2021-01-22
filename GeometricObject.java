public class GeometricObject implements Comparable<GeometricObject> {
	protected double length;
	protected double width;
	protected double area;

	public int compareTo(GeometricObject arg0) {
		return (int) (this.area-arg0.area); 
	}
}