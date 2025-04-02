import java.util.ArrayList;
import java.util.Arrays;
public class more14
{
   /* 3 min
   Given an arrayList of ints, return true if the number 
   of 1's is greater than the number of 4's


   more14([1, 4, 1]) → true
   more14([1, 4, 1, 4]) → false
   more14([1, 1]) → true
*/
   
   public static boolean more14(ArrayList<Integer> nums) 
   {
   int num1 = 0;
   int num4 = 0;
   for (int i = 0; i<nums.size(); i++){
      if (nums.get(i) == 1)
         num1 ++;
      if (nums.get(i) == 4)
         num4 ++;
   }
   return num1>num4;
           
   }

   
   public static void main (String[] args)
   {
    
     System.out.println(more14(new ArrayList<Integer>(Arrays.asList(1,2,2,1))));//true 
     System.out.println(more14(new ArrayList<Integer>(Arrays.asList(4,1,1,1,4))));//true 
     System.out.println(more14(new ArrayList<Integer>(Arrays.asList(4,1,1,16,3,7,8,4,1))));//true 
     System.out.println(more14(new ArrayList<Integer>(Arrays.asList(5,8))));//false 
     System.out.println(more14(new ArrayList<Integer>(Arrays.asList(2,4,2,4))));//false 
     System.out.println(more14(new ArrayList<Integer>(Arrays.asList())));//false 
	    
   }
} 