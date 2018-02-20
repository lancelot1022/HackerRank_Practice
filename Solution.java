import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int noTC;
        String evenLetters = "";
        String oddLetters = "";
        noTC = scan.nextInt();
        scan.nextLine(); // This line you have to add (It consumes the \n character),, Learned from StackOverflow
        for(int i = 0; i < noTC; i++) {
            String word = scan.nextLine();
            char[] arrString = word.toCharArray();
            for(int j = 0; j < arrString.length; j++) {
                if(j%2 == 0) {
                    evenLetters += arrString[j];
                } else {
                    oddLetters += arrString[j];
                }
            }
            System.out.println(evenLetters + " " + oddLetters);
            evenLetters = "";
            oddLetters = "";
        }
    }
}