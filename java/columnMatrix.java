public class columnMatrix
{
   /* 8 min
   Write the code to recursively add up the number in a column of a matrix except if the value is a zero. 


   int[][] mat = {{12,5,7,90,3},{45,6,23,1,9},{89,34,7,10,2},{8,3,78,35,28},{89,34,7,0,2}};
   columnMatrix(4,4))-> 44
   columnMatrix(2,2))->122
   */
   private static int[][] mat = {{12,5,7,90,3},{45,6,23,1,9},{89,34,7,10,2},{8,3,78,35,28},{89,34,7,0,2}};
  
   public static int columnMatrix(int row, int col)
   {
      if(row < mat.length && row >-1 && col < mat[row].length && col > -1 && mat[row][col] != 0)
      {
         int temp = mat[row][col];
         mat[row][col] = 0;
         return temp + columnMatrix(row + 1, col) + columnMatrix(row - 1, col);
      }
      return 0;
   }
   
   public static void main (String[] args)
  {
      //run each line independently
     System.out.println(columnMatrix(4,4));//44
     System.out.println(columnMatrix(2,2)); //122
     System.out.println(columnMatrix(3,2));//122
     System.out.println(columnMatrix(0,3));//136
     System.out.println(columnMatrix(-9,4)); //0
     System.out.println(columnMatrix(9,4));//0
      
  }
}