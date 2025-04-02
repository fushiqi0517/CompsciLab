import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
      ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
      ammo.add(al);
	}

	public void drawEmAll( Graphics window )
	{
      for (Ammo a : ammo) 
      {
            a.draw(window);
      }
	}

	public void moveEmAll()
	{
      for (Ammo a : ammo) 
      {
            a.move("");
      }
	}

	public void cleanEmUp()
	{
      //for every ammo in the list
      //if the ammo is out of bounds
      //remove it
      for (int i = ammo.size()-1; i>= 0;i--)
      {
         if(ammo.get(i).getY() < -ammo.get(i).getHeight())
         {
            ammo.remove(i);
         }
      }
	}

	public List<Ammo> getList()
	{
		return ammo;
   }

	public String toString()
	{
		return "" + ammo;
	}
}