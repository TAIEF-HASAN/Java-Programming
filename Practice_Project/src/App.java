import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner n = new Scanner(System.in);
        int num;
        boolean b = false;
        System.out.println("Enter number");
        num = n.nextInt();
       

        for(int i=2; i<num;i++){
            if(num%i==0){
                b = true;
                break;
            }

        }
        if (b == true){
            System.out.println("num is not prime");
        }else{
            System.out.println("prime");
        }

    }
}
