import java.util.Scanner;
public class Fibonacci{
	public static int fibonacci(int n){
	if(n==0)
	  return n;
    if(n==0|| n==1)
		return 1;
     return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String[] args){
	int num ;
	Scanner in = new Scanner(System.in);
    System.out.print("Enter num :");
    num = in.nextInt();
	
	int i = 0;
	System.out.print("fibonacci series: ");
	 while(num > i){
		 i++;
		 System.out.print(fibonacci(i)+" ");
	 }
 }
}
		
	
