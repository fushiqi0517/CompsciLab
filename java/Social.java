public class Social
{
   private int total;
   private String socialNum;
   
   public Social(String a)
   {
      //your code here
      total = 0;
      socialNum = a;
   }
   
   
   //complete the chopAndAdd method (see instructions)
   //do not change the method header
   //make sure you assign total the value of the sum or -1
	public void chopAndAdd()
	{
      if (socialNum.indexOf("-") == 3 && socialNum.lastIndexOf("-") == 6 && socialNum.length() == 11)
      {
        total = Integer.parseInt(socialNum.substring(0,socialNum.indexOf("-")))+ Integer.parseInt(socialNum.substring(socialNum.indexOf("-")+1 ,socialNum.lastIndexOf("-"))) + Integer.parseInt(socialNum.substring(socialNum.lastIndexOf("-")+1));
        
      }
      else
      {
        total = -1;
      }
	}
   
   //complete the toString method (See sample output)
	public String toString()
	{
      return "SS# " + socialNum + " has a total of " + total;
	}
   
   
}