import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //int n = 7646; random test
        String binConversion;
        int count = 0;
        int temp = 0;
        binConversion = Integer.toBinaryString(n);
        int[] binArr = new int[binConversion.length()];
        for(int i = 0; i < binConversion.length(); i++) {
            binArr[i] = Integer.parseInt(String.valueOf(binConversion.charAt(i)));
        }
        for(int j = 0; j < binArr.length; j++) {
            if(binArr[j] == 1){
                count++;
            } else {
                count = 0;
            }
            if(temp <= count) {
                temp = count;
            }
        } 
        System.out.println(temp);
    }
}