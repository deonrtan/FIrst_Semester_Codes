package Finals.Activities;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int length;
        System.out.println("Enter the number of length");
        length = input.nextInt();

        int [] numbers = new int[length];

        for (int i = 0; i <= length - 1; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = input.nextInt();
        }
        input.close();
        System.out.print("The numbers you inputted are: ");
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + ",");
        }
    }
}
