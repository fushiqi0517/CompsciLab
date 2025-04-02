//this whole class is done for you
public class CheckerRunner 
{
	public static void main ( String[] args )
	{
		StringChecker demo = new StringChecker("chicken"); 
		System.out.println("looking for c "+demo.findLetter('c')); //true
		System.out.println("looking for ch "+demo.findSubString("ch")); //true
		System.out.println("looking for x "+demo.findSubString("x")); //false
		System.out.println(demo); //chicken

		StringChecker demo1 = new StringChecker("alligator");
		System.out.println("looking for g "+demo1.findLetter('g')); //true
		System.out.println("looking for all "+demo1.findSubString("all")); //true
		System.out.println("looking for gater "+demo1.findSubString("gater"));//false
		System.out.println(demo1); //alligator

		StringChecker demo2 = new StringChecker("COMPUTER SCIENCE IS THE BEST!");
		System.out.println("looking for U "+demo2.findLetter('U')); //true
		System.out.println("looking for COMP SCI "+demo2.findSubString("COMP SCI"));//false
		System.out.println("looking for SCIENCE "+demo2.findSubString("SCIENCE"));//true
		System.out.println(demo2); //COMPUTER SCIENCE IS THE BEST!
	}
}