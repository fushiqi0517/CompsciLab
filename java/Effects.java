import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Effects
{
   private List<PowerUp> effect;

   public Effects()
   {
      effect = new ArrayList<PowerUp>();
   }

   public void addNewPower(int x, int y, int type )
   {
      PowerUp a = new PowerUp(x,y,20,20,type);
      add(a);
   }

   public void add(PowerUp po)
   {
      effect.add(po);
   }

   public void drawEmAll(Graphics window)
   {
      //for every ammo in the list
      //if the ammo is out of bounds
      //remove it
      for (int i = 0; i < effect.size(); i++)
      {
         if(effect.get(i).getType() == 0)
         {
            effect.get(i).draw(window);
         }
         else if(effect.get(i).getType() == 1)
            effect.get(i).draw(window);
      }
   }
   
   public void moveEmAll(String direction)
   {
      for (int i = 0; i < effect.size();i++)
         effect.get(i).move(direction);
   }

   public void cleanEmUp()
   {
      for (int i = 0; i < effect.size(); i++)
      {
         effect.get(i).incCnt();
         if(effect.get(i).getCnt() > 1000)
         {
            effect.remove(i);
            break;
         }
      }
   }

   public List<PowerUp> getList()
   {
      return effect;
   }

   public String toString()
   {
      return "" + effect;
   }
}