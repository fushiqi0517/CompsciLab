public class Triangle1
{
//no more methods are neede; you don't need modifier nor constructor methods
   public void createTriangle(int num, String letter)
	{
   // add code here to create your triangles
   for (int i = 1; i<=num; i++)
   {
      for (int j = 1; j<=i; j++)
      {
         System.out.print(letter);
      }
      System.out.print("\n");
   }
   
   for (int i = 1; i<=num; i++)
   {
      for (int j = num-i+1; j>0; j--)
      {
         System.out.print(letter);
      }
      System.out.print("\n");
   }
   System.out.println("\n");
	}
}
