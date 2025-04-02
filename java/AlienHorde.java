import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
      //initalize ArrayList
      //and fill with size amount of aliens (75 pixels apart) 
      //if your row is full (out of bounds of screen)
      //move down a row (75 pixels)
      //starting point is 25, 50
      //first add aliens with speed of 0 to make sure you spacing is good
      aliens = new ArrayList<Alien>();
      int x = 25;
      int y = 50;
      for(int i = 1; i <= size; i++)
      {
         if(x > 800 - 30)
         {
            x = 25;
            y += 75;
         }
         aliens.add(new Alien(x,y,30,30,2));
         x += 75;
      }
	}

	public void add(Alien al)
	{
      aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
      for (Alien a : aliens)
      {
         a.draw(window);
      }
      
	}

	public void moveEmAll()
	{
      for (Alien a : aliens)
      {
         a.move("");
      }
	}

   public void removeDeadOnes(List<Ammo> shots)
	{
      //Part 3
      //for every shot in the list
      //check if you've hit any alien in the list
      //(do the coordinates of the shot fall between the boundarises of the alien)
      //if they do then remove the alien and the shot
      //make sure you break out of the loop if this happens
      for(int s = shots.size()-1; s >= 0; s--)//
      {
         for(int a = aliens.size()-1; a >= 0; a--)//
         {
            Ammo am = shots.get(s);//
            Alien al = aliens.get(a);//
            if ((am.getX() >= al.getX() && am.getX() <= al.getX()+al.getWidth()) ||

                 (am.getX()+am.getWidth() >= al.getX() && am.getX()+am.getWidth() <= al.getX()+al.getWidth()))

                    if ((am.getY() >= al.getY() && am.getY() <= al.getY()+al.getHeight()) ||

                        (am.getY()+am.getHeight() >= al.getY() && am.getY()+am.getHeight() <= al.getY()+al.getHeight()))

                        {

                           aliens.remove(a);

                           shots.remove(s);

                           break;

  

                        }
               
         }
      }
      
	}
   
   public boolean reachBottom()
   {
      return (aliens.get(aliens.size()-1).getY() >= 560);
   }
   
   public List<Alien> getList()
   {
      return aliens;
   }

	public String toString()
	{
		return "" + aliens;
	}
}