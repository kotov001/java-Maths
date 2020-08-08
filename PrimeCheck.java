public class PrimeCheck {
   public static boolean isPrime(int n,int i){
       if(n<=2)
         return true;           //base case
         if(n%i==0)
           return false;
         if(i*i < n)
         return true;
         return isPrime(n,i+1);   //recursion
      }
  public static void main(String [] args){
      int num = 17;
       if(isPrime(num,0x2))
         System.out.println("yes its a prime number");
         else
            System.out.println("not a prime number");


}
}
