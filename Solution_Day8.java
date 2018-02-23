//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s) == true) {
                System.out.println(s + "=" + phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}