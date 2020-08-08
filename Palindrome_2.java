/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Llewdor
 */
public class Palindrome_2 {

    public static boolean isPalindrome(String str){
        if(str.length() == 0 || str.length()== 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length() -1))
            return isPalindrome(str.substring(1,str.length() -1));
        return false;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string : ");
        String strInput = sc.nextLine();
        
       if(isPalindrome(strInput))
            System.out.println(strInput+ " yes");
       else
            System.out.println(strInput + " no");
        
    }
    
}
