import java.util.Scanner;
public class makeAbba
{
    /*
    Given two strings, a and b, return the result of putting them together in the order abba, 
    e.g. "Hi" and "Bye" returns "HiByeByeHi".


    Hi Bye → "HiByeByeHi"
    Yo Alice → "YoAliceAliceYo"
    What Up → "WhatUpUpWhat"
   */
   
      
   public static void main (String[] args)
   {
     Scanner key = new Scanner(System.in);
     String one = key.next();
     String two = key.next();
     String together = one + two + two + one;
     System.out.println(together);        
   }
} 