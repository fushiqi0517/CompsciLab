public class teaParty
{
   /*We are having a party with amounts of tea and candy. 
   Return the int outcome of the party encoded as 
   0=bad, 1=good, or 2=great. A party is good (1) if both 
   tea and candy are at least 5. However, if either tea or 
   candy is at least double the amount of the other one, 
   the party is great (2). However, in all cases, if either 
   tea or candy is less than 5, the party is always bad (0).


      teaParty(6, 8)); // 1
      teaParty(3, 8)); // 0
      teaParty(20, 6)); // 2   */
   
   public static int teaParty(int tea, int candy) 
   {
    if (tea>= 5 && candy>= 5)
    {
    if (tea/candy >=2 || candy/tea >= 2)
    return 2;
    else
    return 1;
    }
    else
    return 0;
      
   }


   public static void main(String args[])
   {
         System.out.println(teaParty(6, 8)); // 1	
         System.out.println(teaParty(3, 8)); // 0		
         System.out.println(teaParty(20, 6)); // 2		
         System.out.println(teaParty(12, 6)); // 2		
         System.out.println(teaParty(11, 6)); // 1		
         System.out.println(teaParty(11, 4)); // 0		
         System.out.println(teaParty(4, 5)); // 0		
         System.out.println(teaParty(5, 5)); // 1		
         System.out.println(teaParty(6, 6)); // 1		
         System.out.println(teaParty(5, 10)); // 2		
         System.out.println(teaParty(5, 9)); // 1		
         System.out.println(teaParty(10, 4)); // 0		
         System.out.println(teaParty(10, 20)); // 2
   }
}