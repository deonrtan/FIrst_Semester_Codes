package Prelims.exercises;

/*
Name: Tan, Deon R.
        Programming Date: 9/4/2022
        Activity Name and Number: Prelim Programming Exercise 3 */

import java.lang.*; // a class that will call out the "Math." Identifiers

public class RightTriangle2 { // class name
    public static void main (String[] args){ // special method in Java Programming that serves as the externally exposed entrance point by which a Java program can be run.

        // if you're inputting whole digit numbers to the variables you can use int or integers in here i'll be using int for my base and height
        int Base, Height;

        //on getting the exact digits of this two variables we use double, double specifically means we add 15 floating points to the digits
        // I use double in this situation is because we use a mathematical symbol of square root
        double Hypotenuse;

        //variable that indicates the height of the Right Triangle
        Height = 32; //Assigns the integer value 32 to Height.

        //variable that indicates the base of the Right Triangle
        Base = 15; //Assigns the integer value 15 to Base

        //variable that indicates the Hypotenuse of the Right Triangle
        Hypotenuse = Math.sqrt(Math.pow(Height,2) + Math.pow(Base,2)); //The formula of the Hypotenuse based on the Pythagorean Theorem is
        // c = √(a^2 + b^2) which is "a" is the base, b is the "height" and "c" is the hypotenuse so by getting this we must square root the sum of a squared and b squared to get the hypotenuse


        //this is the output of the code

        System.out.println();
        System.out.println();
        System.out.println(" **********************************************************");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" * Height of Right Triangle is " + Height + "                         *");
        System.out.println(" * Base of the right triangle is  " + Base + "                      *");
        System.out.println(" * Hypotenuse of the right triangle is " + Hypotenuse + "  *");
        System.out.println(" *                                                        *");
        System.out.println(" *                                                        *");
        System.out.println(" **********************************************************");


    } // end of main method
} // end of class

