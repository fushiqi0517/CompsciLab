import java.util.Arrays;
public class leftShift
{
   /*
   Return an array that is "left shifted" by one 
   so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
   You may modify and return the given array, 
   or return a new array.   
   
   leftShift({6, 2, 5, 3}) → {2, 5, 3, 6} 
   leftShift({1, 2}) → {2, 1} 
   leftShift({1}) → {1}
   */
   
   public static int[] leftShift(int[] nums) 
   {
   if(nums.length != 0)
   {
   int a = nums[0];
   for(int i = 0; i< nums.length-1; i++){
      nums[i]=nums[i+1];
   }
   nums[nums.length-1] = a;
   }
   return nums;
   }

   
   public static void main (String[] args)
   {
     System.out.println(Arrays.toString(leftShift(new int[]{6, 2, 5, 3})));//[2, 5, 3, 6]	    
     System.out.println(Arrays.toString(leftShift(new int[]{1, 2})));// [2, 1]
     System.out.println(Arrays.toString(leftShift(new int[]{1})));//[1]
     System.out.println(Arrays.toString(leftShift(new int[]{})));//[]	
     System.out.println(Arrays.toString(leftShift(new int[]{1, 1, 2, 2, 4})));//[1, 2, 2, 4, 1]
     System.out.println(Arrays.toString(leftShift(new int[]{3, 6, 1})));//[6, 1, 3]
     System.out.println(Arrays.toString(leftShift(new int[]{1, 1, 1})));//[1, 1, 1]
     System.out.println(Arrays.toString(leftShift(new int[]{1, 2, 3})));//[2, 3, 1]    		    
   }
}

