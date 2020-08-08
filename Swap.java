import java.util.Scanner;

public class Swap{
	public static void swapNumbers(int a, int b){
	 b = a + b;
	 a = b - a;
	 b = b - a;
}
   public static void main(String [] args){
	 int a = 20;
     int b = 30;
	 
     swapNumbers(a,b);
	 
	 System.out.println("a: "+ a + " "+ "b: "+ b);
	 }
	}