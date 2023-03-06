package com.mycompany.java_practice_project.ExceptionHandling;

public class ExceptionExample {
    public static void main(String[] args) {
        //we can use multiple catch block under the try block
        try {

            int[]arr = new int[4];
            arr[4] = 10;

            int x = 10;
            int y = 0;
            int result = x/y;
            System.out.println("Result: "+result);

            

            
        //if we give a individual exception name then exception must have to match with Exact exception which has been rise, otherwise program will be terminated  
        } catch (StringIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Exception :"+e);
        //after that if we use a Exception class then the program will be execute equally there will be no error rise
        }catch(ArithmeticException e){
            System.out.println("Exception: "+e);
            
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception: "+e);
        }catch(Exception e){
            System.out.println("Exception: "+e);
        }
        //we can avoid the exception using finally keyword, which we written in finally keyword the block will run.
        finally{
            System.out.println("Last line of the program");
        }


       
        
        
    }
}
