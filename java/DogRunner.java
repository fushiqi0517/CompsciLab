public class DogRunner
{
	public static void main( String[] args )
	{
				
		// instantiate a dog object and call it d
      //the name of the dog should be rover
		Dog d = new Dog("rover");
		
		System.out.println( d.getDogYears( 7 ) );
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		System.out.println( d.getDogYears( 11 ) );
		System.out.println( d.getName() );
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		d.increaseAgeByOne();
		System.out.println( d.getDogYears( 8 ) );
		
		// instantiate a dog object and call it g
      // this dog should be named bob and be 3 years old
		
      Dog g = new Dog("Bob", 3);
      
		System.out.println( g.getName() );
		System.out.println( g.getDogYears( 5 ) );
		System.out.println( g );
					
	}
}
