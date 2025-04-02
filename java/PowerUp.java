import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class PowerUp extends MovingThing
{
   private Image imagepwrup1;
   private Image imagepwrup2;
   private int type;
   private int presenceCnt;
   
   public PowerUp()
   {
   this (0,0,20,20,0);
   try
		{
			URL url = getClass().getResource("powerup.jpg");
			imagepwrup1 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}
    try
		{
			URL url = getClass().getResource("powerup2.jpg");
			imagepwrup2 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}

   }
   
   public PowerUp(int x, int y)
   {
   super (x,y,20,20);
   try
		{
			URL url = getClass().getResource("powerup.jpg");
			imagepwrup1 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}
    try
		{
			URL url = getClass().getResource("powerup2.jpg");
			imagepwrup2 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}

   }
   
   public PowerUp(int x, int y, int s)
   {
   super (x,y,20,20);
   type = s;
   try
		{
			URL url = getClass().getResource("powerup.jpg");
			imagepwrup1 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}
    try
		{
			URL url = getClass().getResource("powerup2.jpg");
			imagepwrup2 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}

   }
   
   public PowerUp(int x, int y, int w, int h, int s)
   {
   super (x,y,w,h);
   type = s;
   try
		{
			URL url = getClass().getResource("powerup.jpg");
			imagepwrup1 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}
    try
		{
			URL url = getClass().getResource("powerup2.jpg");
			imagepwrup2 = ImageIO.read(url);
		}
		catch(Exception e)
		{
			
		}

   }
   
   public int getCnt()
   {
      return presenceCnt;
   }
   
   public void incCnt()
   {
      presenceCnt++;
   }
   
   public void setType(int s)
   {
      type = s;
   }
   
   public int getType()
   {
      return type;
   }
   
   public void move(String direction)
   {
      
   }

   public void draw(Graphics window) 
   {
      window.drawImage(imagepwrup1, getX(), getY(), getWidth(), getHeight(), null);
      
   }

   public void draw2(Graphics window) 
   {
      window.drawImage(imagepwrup2, getX(), getY(), getWidth(), getHeight(), null);
      
   }
   
   public String toString()
   {
      return super.toString() + getType();
   }

}