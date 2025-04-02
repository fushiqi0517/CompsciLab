public class AtCounter
{
   private String[][] atMat;

	public AtCounter(int rows, int cols)
	{
		//size the matrix
      //use nested loops to randomly load the matrix
      //you will need to use Math.random()
      atMat = new String[rows][cols];
      for (int r = 0; r < rows; r++)
         for (int c = 0; c < cols; c++)
         {
            int temp = (int)(Math.random()*2);
            if (temp == 1)
               atMat[r][c] = "-";
            else
               atMat[r][c] = "@";
         }
	}

	public int countAts(int r, int c)
	{
		if (r >= 0 && r < atMat.length && c >= 0 && c < atMat[r].length && atMat[r][c].equals("@"))
      {
         atMat[r][c] = "-";
         return 1+ countAts(r+1,c) + countAts(r-1,c) + countAts(r,c+1) + countAts(r,c-1);
      }
      return 0;
      
    }
    
    
    
    
    
	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix with out brackets or commas 
	 */
	public String toString()
	{
      String matrix = "";
      for (int r = 0; r < atMat.length; r++)
      {
            for (int c = 0; c < atMat[r].length; c++)
            {
               matrix += atMat[r][c];
            }
         matrix += "\n";
   	}
      return matrix;
   }
}