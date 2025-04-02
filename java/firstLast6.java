public class firstLast6
{
   /*
   Given an array of ints, return true if 6 appears as either the 
   first or last element in the array. 
   The array will be length 1 or more.
   
   
   firstLast6([1, 2, 6]) → true
   firstLast6([6, 1, 2, 3]) → true
   firstLast6([13, 6, 1, 2, 3]) → false
   */
   public static boolean firstLast6(int[] nums) 
   {
   return nums[0] == 6 || nums[nums.length-1] == 6;
      
   }

   
   public static void main (String[] args)
   {
     System.out.println(firstLast6(new int[] {1,2,6}));//true	    
     System.out.println(firstLast6(new int[]{6, 1, 2, 3}));//true	
     System.out.println(firstLast6(new int[]{13, 2, 6, 1, 6}));//true
     System.out.println(firstLast6(new int[]{13, 2, 6, 1}));//false	
     System.out.println(firstLast6(new int[]{1, 2, 3}));//false
     System.out.println(firstLast6(new int[]{3, 6, 1}));//false
     System.out.println(firstLast6(new int[]{3, 6}));//true	
     System.out.println(firstLast6(new int[]{6}));//true	
     System.out.println(firstLast6(new int[]{3}));//false		    
   }
     
}