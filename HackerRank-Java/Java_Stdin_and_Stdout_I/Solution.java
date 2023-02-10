package HackerRank-Java.Java_Stdin_and_Stdout_I';

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
        int a = scan.nextInt();
         System.out.println(a);   
        }
        scan.close();
    }
}