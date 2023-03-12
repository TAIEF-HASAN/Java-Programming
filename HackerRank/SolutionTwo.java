package HackerRank;
import java.util.*;



public class SolutionTwo {

    /*
        In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

        ![image](https://user-images.githubusercontent.com/101741122/224539321-00b980e4-0d0d-40fc-a86c-ad461a148386.png)

        Task
        Given an integer,

        , perform the following conditional actions:

        If n is odd, print Weird
        If n is even and in the inclusive range of 2 to 5, print Not Weird
        If n is even and in the inclusive range of 6 to 20, print Weird
        If n is even and greater than 20, print Not Weird
        Complete the stub code provided in your editor to print whether or not n is weird.
     
     */



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        if( N>=2 && N<=5 && N%2==0 ){
            System.out.println("Not Weird");
        }
        else if( N>20 && N%2==0){
            System.out.println("Not Weird");
        }
        else{
            System.out.println("Weird");
        }
    }
}

