package Prelims.Done;

public class RightTriangle {

  public static void main(String[] args) {
    //leg 1
    int altitude = 15;
    //leg 2
    int base = 25;

    int Hypotenuse = (altitude * 2) + (base * 2);

    int Perpendicular = 20;

    double area = 0.5 / (base * altitude);

    double perimeter = Hypotenuse + base + altitude;

    System.out.println();
    System.out.println();
    System.out.println(
      " **********************************************************"
    );
    System.out.println(" * *");
    System.out.println(" * *");
    System.out.println(
      " * Hypotenuse of the right triangle is  " + Hypotenuse + " *"
    );
    System.out.println(
      " * Perpendicular of Right Triangle is " + Perpendicular + " *"
    );
    System.out.println(
      " * Altitude of the right triangle is  " + altitude + " *"
    );
    System.out.println(" * Area of the Right Triangle is * " + area + " *");
    System.out.println(
      " * Perimeter of the right triangle is *" + perimeter + " *"
    );
    System.out.println(" * *");
    System.out.println(" * *");
    System.out.println(
      " **********************************************************"
    );
  }
}
