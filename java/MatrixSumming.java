public class MatrixSumming
{   
    //load in the matrix values
    private int[][] m =      {{1, 2, 3, 4, 5},
    									{6, 7, 8, 9, 0},
    									{6, 7, 1, 2, 5},
    									{6, 7, 8, 9, 0},
    									{5, 4, 3, 2, 1}}; 
    private int row;
    private int col;  
    
    //Complete the default constructor method
    public MatrixSumming()
    {
    row = 0;
    col = 0;
    }
    
    //Complete the constructor method
    public MatrixSumming(int r, int c)
    {
    row = r;
    col = c;  
    }
  
    //Complete the sum method
    //Think about how your current position in the matrix relates to the surrounding positions
    public int sum( int r, int c )
    {
    	//create an array that contains all positions relative to the current position
		 //loop for adding or subtracting to the row index
		 //loop for adding or subtracting to the col index
			//check your boundaries 
			     //adding the appropriate relative positions to sum
      int sum = m[r][c];
		for (int i = 0; i< m.length; i++)
      {
         for (int k = 0; k < m[i].length; k++)
         {
            if ((r-1 < 0) && (c-1 <0))//location at left up edge
            {
               if ((r == i) && (c+1==k))//right
                  sum += m[i][k];
               if ((r+1 == i) && (c+1==k))//right down
                  sum += m[i][k];
               if ((r+1 == i) && (c==k))//down
                  sum += m[i][k];
             }
             
             if ((r-1 < 0) && (c-1>=0) && (c+1<m[i].length-1))//location at up middle
             {
               if ((r == i) && (c-1==k))//left
                  sum += m[i][k];
               if ((r == i) && (c+1==k))//right
                  sum += m[i][k];
               if ((r+1 == i) && (c-1==k))//left down
                  sum += m[i][k];
               if ((r+1 == i) && (c==k))//down
                  sum += m[i][k];
               if ((r+1 == i) && (c+1==k))//right down
                  sum += m[i][k];
             }
             
            if ((r-1 < 0) && (c+1==m[i].length-1))//location at up right
            {
              if ((r == i) && (c-1==k))//left
                  sum += m[i][k];
              if ((r+1 == i) && (c-1==k))//left down
                  sum += m[i][k];
              if ((r+1 == i) && (c==k))//down
                  sum += m[i][k];
            }
            
            if ((r-1!=-1) && (c-1 <0))//location at left edge
            {
               if ((r-1 == i) && (c==k))//up
                  sum += m[i][k];
               if ((r-1 == i) && (c+1==k))//right up
                  sum += m[i][k];
               if ((r == i) && (c+1==k))//right
                  sum += m[i][k];
               if ((r+1 == i) && (c==k))//down
                  sum += m[i][k];
               if ((r+1 == i) && (c+1==k))//right down
                  sum += m[i][k];
            }
            
            if ((r-1!=-1) && (r+1 < m.length) && (c-1>=0) && (c+1<=m[i].length-1))//location at middle
            {
               if ((r-1 == i) && (c-1==k))//left up
                  sum += m[i][k];
               if ((r-1 == i) && (c==k))//up
                  sum += m[i][k];
               if ((r-1 == i) && (c+1==k))//right up
                  sum += m[i][k];
               if ((r == i) && (c-1==k))//left
                  sum += m[i][k];
               if ((r == i) && (c+1==k))//right
                  sum += m[i][k];
               if ((r+1 == i) && (c-1==k))//left down
                  sum += m[i][k];
               if ((r+1 == i) && (c==k))//down
                  sum += m[i][k];
               if ((r+1 == i) && (c+1==k))//right down
                  sum += m[i][k];
            }
            
            if ((r-1!=-1) && (r!=m.length-1)&& (c==m[i].length-1))//location at right edge
            {
              if ((r-1 == i) && (c-1==k))//left up
                  sum += m[i][k];
              if ((r-1 == i) && (c==k))//up
                  sum += m[i][k];
              if ((r == i) && (c-1==k))//left
                  sum += m[i][k];
              if ((r+1 == i) && (c-1==k))//left down
                  sum += m[i][k];
              if ((r+1 == i) && (c==k))//down
                  sum += m[i][k];
            }
            
            if ((r == m.length-1) && (c-1 <0))//location at left down edge
            {
               if ((r-1 == i) && (c==k))//up
                  sum += m[i][k];
               if ((r-1 == i) && (c+1==k))//right up
                  sum += m[i][k];
               if ((r == i) && (c+1==k))//right
                  sum += m[i][k];
            }
            
            if ((r == m.length-1) && (c-1>=0) && (c+1<=m[i].length-1))//location at down middle
            {
               if ((r-1 == i) && (c-1==k))//left up
                  sum += m[i][k];
               if ((r-1 == i) && (c==k))//up
                  sum += m[i][k];
               if ((r-1 == i) && (c+1==k))//right up
                  sum += m[i][k];
               if ((r == i) && (c-1==k))//left
                  sum += m[i][k];
               if ((r == i) && (c+1==k))//right
                  sum += m[i][k];
            }
            
            if ((r == m.length-1) && (c==m[i].length-1))//location at down right
            {
               if ((r-1 == i) && (c-1==k))//left up
                  sum += m[i][k];
               if ((r-1 == i) && (c==k))//up
                  sum += m[i][k];
               if ((r == i) && (c-1==k))//left
                  sum += m[i][k];
            }
          }
       }
                  
                  
     

      return sum;

    }
    
    //Complete the code to print out the matrix
    public void printMat()
    {
    System.out.println("Matrix values");
    for (int i= 0; i<m.length; i++)
    {
      for (int z = 0; z< m[i].length; z++)
         System.out.print(m[i][z] + " ");
      System.out.println();
    }  
    } 
		    
    //Complete the toStrng method
    public String toString()
    {
    int a = sum(row,col);
    return "The sum of " + row + ", " + col + " is " + a;
    }

}

