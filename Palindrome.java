import java.util.Scanner;
public class Palindrome{
   public static  boolean checkPalindrome(String str){
   boolean result = true;
    int length = str.length();
	for(int i  = 0; i < length/2;i++){
	         if(str.charAt(i) != str.charAt(length-i-1)){
			   result = false;
			   break;
	   }
	}
	 return result;
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter input to be tested :");
	String input = sc.nextLine();
	  
	  if(checkPalindrome(input))
		  System.out.println( input + " yes its a palindrome");
	  else
		  System.out.println(input + "its not a palindrome");
}
}
	 
