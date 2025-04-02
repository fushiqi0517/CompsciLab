import java.util.Arrays;
public class makesMiddle
{
   /*Given an array of ints of even length, 
   return a new array length 2 containing the middle 
   two elements from the original array. 
   The original array will be length 2 or more.

      makeMiddle([1, 2, 3, 4]) → [2, 3]
      makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
      makeMiddle([1, 2]) → [1, 2]
      */
      
   public static int[] makeMiddle(int[] nums) 
   {
   int[] a= new int[2];
   a[0]= nums[nums.length/2-1];
   a[1]= nums[nums.length/2];
   return a;
   }


   
   static public void main (String[] args)
   {
     System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));//{2, 3}
     System.out.println(Arrays.toString(makeMiddle(new int[]{7, 1, 2, 3, 4, 9})));//{2, 3}
     System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2})));//{1, 2}
     System.out.println(Arrays.toString(makeMiddle(new int[]{5, 2, 4, 7})));//{2, 4}
     System.out.println(Arrays.toString(makeMiddle(new int[]{9, 0, 4, 3, 9, 1})));//{4, 3}				    
   }    
}
