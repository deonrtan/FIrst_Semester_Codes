package Finals.Activities;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        int Array[] = {9,2,1,23,54};
        for (int i = 0; i < Array.length - 1; i++){
            for (int j = 1; j < Array.length - 1 - i; j++) {
                if(Array[j] > Array[j+1]){
                    int temp = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j+1] = temp;
                    System.out.println(Array[j+1]);
                }       
            }  
        } 
    }
}
