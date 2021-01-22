import java.util.*;
public class Question3 {
  public static void main(String[] args) {
    GeometricObject circle = new Circle(8);
    GeometricObject rectangle = new Rectangle(8, 12);
    GeometricObject octagon = new Octagon(8);

    List<GeometricObject> list1 = new ArrayList<GeometricObject>();
    list1.add(circle);
    list1.add(rectangle);
    list1.add(octagon);

    System.out.println("Sum of the area is: " + sumArea(list1));
    printSorted(list1);
  }

  static double sumArea(List<GeometricObject> list1) {
    double sum=0;

    for(GeometricObject i : list1) {
      sum+=i.area;
    }

    return sum;
  }

  static void printSorted(List<GeometricObject> list1) {
    System.out.println();
    System.out.println("Before sorting the List is:");
    for(GeometricObject i : list1) {
      System.out.println(i.toString());
    }
    System.out.println();

    Collections.sort(list1);

    System.out.println("Sorted List is:");
    for(GeometricObject i : list1) {
      System.out.println(i.toString());
    }
  }
}