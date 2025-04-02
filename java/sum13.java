public class sum13
{
   /*4 min
   Return the sum of the numbers in the array, 
   returning 0 for an empty array. 
   Except the number 13 is very unlucky, so it does not count 
   and numbers that come immediately after a 13 also do not count.   
   Note: A 13 will never follow another 13. 
   
   sum13({1, 2, 2, 1}) → 6 
   sum13({1, 13}) → 1 
   sum13({1, 13, 2, 13, 1}) → 1
   sum13({1, 13, 2, 6, 9, 13, 9, 1}) → 17
   */
   
   public static int sum13(int[] nums) 
   {
   int sum = 0;
   for(int i= 0; i<nums.length; i++)
   {
      if(nums.length == 0)
         return 0;
      if(nums[i] != 13)
         sum += nums[i];
      else
         i++;
   }
   return sum; 
   }

   
   public static void main (String[] args)
   {
     System.out.println(sum13(new int[] {1,2,2,1}));//6 
     System.out.println(sum13(new int[] {1,2,2,1,13}));//6  
     System.out.println(sum13(new int[] {1,2,13,1,13}));//3
     System.out.println(sum13(new int[] {13, 1, 2, 13, 2, 1, 13}));//3
     System.out.println(sum13(new int[] {}));//0
     System.out.println(sum13(new int[] {13}));//0
     System.out.println(sum13(new int[] {13,9}));//0
     System.out.println(sum13(new int[] {13, 1,13}));//0
     System.out.println(sum13(new int[] {5,7,2}));//14
     System.out.println(sum13(new int[] {0}));//0
     System.out.println(sum13(new int[] {1, 13, 2, 6, 9, 13, 9, 1}));//17
     
      		    
   }
} 