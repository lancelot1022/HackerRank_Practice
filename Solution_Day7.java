import java.io.*;
import java.util.*;


public class Solution_Day7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //get 1st input: n = size of array
        int[] arrInput = new int[n];
        int[] arrReverse = new int[n];
        String output = "";
        
        for(int i = 0; i < n; i++) {
            arrInput[i] = scan.nextInt(); //store each input separated by space into an array index
        }
        
        for(int i = 0; i < n; i++) {
            arrReverse[i] = arrInput[n - 1 - i]; // set value of reversed array note: [n - 1 - i] is assign last value of array to the
        }                                        // 1st index of reversed array 
        
        for(int i = 0; i < n; i++) {
            output = output + arrReverse[i] + " "; // only solution I can think of right now,, although it will pass TCs all outputs
        }                                          // will have an extra space at the end..
        System.out.println(output);
        scan.close();
    }
}
