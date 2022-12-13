package Prelims.Done;

public class Rectangle {

  public static void main(String[] args) {
    // if you're inputting whole digit numbers to the variables you can use int or integers
    int length, width, perimeter, area;

    //getting the length of the rectangle
    length = 30; //Assigns the integer value 30 to Length

    //getting the width of the rectangle
    width = 15; //Assigns the integer value 15 to Width

    // getting the perimeter of the rectangle by multiplying the length by 2 and also multiplying the width by 2 and adding them together
    perimeter = (2 * length) + (2 * width);

    // by getting the area of the rectangle we must multiply the length and the width
    area = length * width;

    //output of the code
    System.out.println();
    System.out.println();
    System.out.println(" ***************************************");
    System.out.println(" *                                     *");
    System.out.println(" *                                     *");
    System.out.println(" * Length of the rectangle = " + length + "        *");
    System.out.println(" * width of the rectangle = " + width + "         *");
    System.out.println(
      " * perimeter of the rectangle = " + perimeter + "     *"
    );
    System.out.println(" * area of the rectangle = " + area + "         *");
    System.out.println(" *                                     *");
    System.out.println(" *                                     *");
    System.out.println(" ***************************************");
  } // End of main method
} // End of class
