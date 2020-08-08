public class Factorial {
    public static  int factorial1(int n) {
        if (n == 0)             //base case
        return 1;
     return n * factorial1(n - 1); //recursion
        
    }

   
    public static void main(String[] args) {
        int num =5;
        
      
        //System.out.println("Enter num : "+ num);
        System.out.println("Factorial of " + num +" is "+ factorial1(num));
        
    }
    
}