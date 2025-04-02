public class searchOthers {
    /* 3 min
     * Return the number of times the int "num" appears in the matrix.
     * Search every row except "row" and every column except "col"      
     * 
     * Example:
     * search(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 8, 9 } }, 5, 1, 1) -> 0
     * search(new int[][] { { 1, 2, 3 }, { 4, 5, 5 }, { 1, 5, 9 } }, 5, 0, 2) -> 2
     */
    public static int search(int[][] matrix, int num, int row, int col) 
    {
    int count = 0;
    for (int i = 0; i< matrix.length; i++)
    {
      for (int c = 0; c< matrix[i].length; c++)
      {
         if ((matrix[i][c] == num) &&  (i != row) && (c != col))
            count++;
      }
    }
    return count;

    }
     

    public static void main(String[] args) {
        System.out.println(search(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 1, 8, 9 } }, 5, 1, 1)); // 0
        System.out.println(search(new int[][] { { 1, 2, 3 }, { 4, 5, 5 }, { 1, 5, 9 } }, 5, 0, 2)); // 2
        System.out.println(search(new int[][] { { 1, 2, 3, 4 }, { 4, 5, 6, 5 }, { 1, 8, 9, 5 } }, 5, 2, 3)); // 1
        System.out.println(search(new int[][] { { 1, 2, 3 }, { 4, 1, 6 }, { 1, 8, 9 } }, 1, 0, 0)); // 1
        System.out.println(search(new int[][] { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 1, 8, 9, 10 }, { 11, 12, 13, 14 } }, 5, 2, 2)); // 1
        System.out.println(search(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, 5, 1, 2)); // 0
        System.out.println(search(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }, 11, 2, 2)); // 0
        System.out.println(search(new int[][] { { 1, 2, 3 }, { 4, 1, 6 }, { 7, 8, 9 } }, 1, 2, 2)); // 2
        System.out.println(search(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } }, 10, 1, 2)); // 1
        System.out.println(search(new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } }, 13, 2, 2)); // 0
        System.out.println(search(new int[][] { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } }, 17, 2, 4)); // 0
    }
}
