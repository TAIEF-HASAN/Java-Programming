package HackerRank;

import java.util.Scanner;

public class SolutionFive {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String n;
        System.out.print("Enter a Decimal number: ");
        n = input.next();
        int m = Integer.parseInt(n, 2);
        System.out.println("The Number of Binary to Decimal: "+m);
        
    }
}
