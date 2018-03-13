import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrSize = 6;
        int arr[][] = new int[arrSize][arrSize];
        int sum = Integer.MIN_VALUE;       //since the lowest possible value is -9: -9 * 7 (size of hour glass) = -63
        int max = Integer.MIN_VALUE;     // setting it to zero will set the highest to zero if the max value is negative
        for(int i=0; i < arrSize; i++){
            for(int j=0; j < arrSize; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int k = 0; k < arrSize - 2; k++) {
            for(int l = 0; l < arrSize - 2; l++) {
                sum = arr[k][l] + arr[k][l+1] + arr[k][l+2] + 
                            arr[k+1][l+1] +
                            arr[k+2][l] + arr[k+2][l+1] + arr[k+2][l+2];
                
                if(sum > max) {
                    max = sum;
                }
                
            }   
        }
        System.out.println(max);
    }
}
