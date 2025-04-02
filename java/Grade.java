import java.util.ArrayList;
import java.util.Collections;

public class Grade
{
   private double grade;
   
   public Grade(double g)
   {
      grade = g;
   }
   public double getGrade()
   {
      return grade;
   }
   public String toString()
   {
      return "The grade is " + grade;
   }
   
   public static void main (String[] args)
   {
    ArrayList<Grade> rayList = new ArrayList<Grade>();
    
    rayList.add(new Grade(88.7));
    rayList.add(new Grade(100.0));
    rayList.add(new Grade(90.5));
    rayList.add(new Grade(97.1));
    System.out.println(rayList.add(new Grade(57.9)));
    System.out.println(rayList.get(0));
    System.out.println(rayList.get(1));
    System.out.println(rayList.get(2).getGrade());
    System.out.println(rayList.size());
    System.out.println(rayList.remove(0));
    System.out.println(rayList.toString());
    System.out.println(rayList.remove(1));
    System.out.println(rayList.toString());
    
    ArrayList<Double> newList = new ArrayList<Double>();


    for(Grade item: rayList)
      newList.add(item.getGrade());   

    Collections.sort(newList);
    System.out.println(newList);
   }

}

