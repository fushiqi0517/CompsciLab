public class StringsFunhouseRunner
{   
   
   public static void main(String args[])
   {
      StringsFunhouse go = new StringsFunhouse();
      
      //Checking Part1: sameFirstLetter
      System.out.println(go.sameFirstLetter("hello", "howdy"));//1
      System.out.println(go.sameFirstLetter("one", "two")); //-1
      System.out.println(go.sameFirstLetter("three", "two"));//1 
      System.out.println(go.sameFirstLetter("Texas", "twostep")); //-1
      System.out.println(go.sameFirstLetter("State", "Champions"));//-1 
      System.out.println(go.sameFirstLetter("ABC", "DEF"));//-1
      
      System.out.println("\n");      
      //Checking Part 2: vowelOrDigit
      System.out.println(go.vowelOrDigit("apluscompsci")); //true
      System.out.println(go.vowelOrDigit("1forthemoney")); //true
      System.out.println(go.vowelOrDigit("chicken99")); //false
      System.out.println(go.vowelOrDigit("funkycoldsnow")); //false
      System.out.println(go.vowelOrDigit("APLUSCOMPSCI")); //true
      System.out.println(go.vowelOrDigit("77sodacans99")); //true
      System.out.println(go.vowelOrDigit("aardvark")); //true
      System.out.println(go.vowelOrDigit("cancancancan"));//false
      
      System.out.println("\n");
      //Checking Part 3: firstLastVowel
      System.out.println(go.firstLastVowel("dog#cat#pigaplus")); //no
      System.out.println(go.firstLastVowel("pigs#apluscompsci#food"));//no
      System.out.println(go.firstLastVowel("##catgiraffeapluscompscI")); //yes
      System.out.println(go.firstLastVowel("apluscatsanddogsaplus###")); //yes
      System.out.println(go.firstLastVowel("###" ));//no
      System.out.println(go.firstLastVowel("Aplusdog#13337#pigaplusprogram")); //yes
      System.out.println(go.firstLastVowel("code#H00P#code1234" ));//no
      System.out.println(go.firstLastVowel("##wowgira77##eplus"));//no
      System.out.println(go.firstLastVowel("catsandaplusdogsaplus###u" ));//yes
      System.out.println(go.firstLastVowel("7"));//no
      System.out.println(go.firstLastVowel("A"));//yes
      System.out.println(go.firstLastVowel("E"));//yes
      System.out.println(go.firstLastVowel("9AEIOUaeiou@"));//no
      
      System.out.println("\n");
      // Checking Part 4: firstRepeats
      System.out.println(go.firstRepeats("dog#cat#pigaplus")); //false
      System.out.println(go. firstRepeats("pigs#apluscompsci#food"));//true
      System.out.println(go. firstRepeats("##catgiraffeapluscompscI")); //true
      System.out.println(go. firstRepeats("apluscatsanddogsaplus###")); //true
      System.out.println(go. firstRepeats("###" ));//true
      System.out.println(go. firstRepeats("Aplusdog#13337#pigaplusprogram")); //false
      System.out.println(go. firstRepeats("code#H00P#ode1234" ));//false
      System.out.println(go. firstRepeats("wowgira77##eplus"));//true
      System.out.println(go. firstRepeats("catsandaplusdogsaplus###u" ));//false
      System.out.println(go. firstRepeats("7"));//false
      System.out.println(go. firstRepeats("A"));//false
      System.out.println(go. firstRepeats("E"));//false
      System.out.println(go. firstRepeats("9AEIOUaeiou9@"));//true	
   }     
}

