package Prelims.exercises;

public class Circle2 {

  public static void main(String[] args) {
    double radius; // double is the appropriate data type of radius because the value of radius may be a floating point number.
    double area;
    area = 27.52; // Assigns 27.52 as the area of a circle
    radius = Math.sqrt(area / Math.PI); // computes the radius of the circle with a given area,
    // "Math.sqrt" means square root in programming language to get the radius of the circle with a given area
    // the formula is "√(A / π) square root of the open and close parenthesis of area divided by Pi "

    //Show data about the circle
    System.out.println();
    System.out.println();
    System.out.println(
      " **********************************************************"
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " * Area of circle is " + area + "                                *"
    );
    System.out.println(
      " * Radius of circle is " + radius + "                 *"
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " *                                                        *"
    );
    System.out.println(
      " **********************************************************"
    );
  } // end of the main method
} // end of class
