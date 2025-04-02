import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	


   private AlienHorde horde;
	private Bullets shots;
   private Ship ship;
	private boolean[] keys;
	private BufferedImage back;
   private boolean gameOver;
   //private Effects powers;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate what you need as you need it (from global objects above)
      
      ship = new Ship(310, 450, 5);
      horde = new AlienHorde(20);
      shots = new Bullets();
      gameOver = false;
      //powers = new Effects();
      
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }
    
  //the top part of the paint method is done for you
	public void paint( Graphics window )
	{
      if (gameOver) 
      {
            // Display end game screen
            window.setColor(Color.WHITE);
            window.fillRect(getWidth()/2-20, getHeight()/2-30, getWidth()/8, getHeight()/8);
            window.setColor(Color.RED);
            window.setFont(new Font("Arial", Font.BOLD, 14));
            window.drawString("Game Over", getWidth() / 2 - 10, getHeight() / 2);
      }
      else
      {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shot of the current screen and save it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
      //this sets the background for the graphics window
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,getWidth(),getHeight());
      
		
		//add code to move Ship, Alien, etc.-- Part 1
        if(keys[0] == true)
   	  {
   		   ship.move("LEFT");
   	  }
         
        if(keys[1]) 
        { 
            ship.move("RIGHT");
        }
        if(keys[2]) 
        { 
            ship.move("UP");
        }
        if(keys[3]) 
        { 
            ship.move("DOWN");
        }
      
      //add code to fire a bullet - Part 3
      if(keys[4]) 
      { 
         shots.add(new Ammo(ship.getX() + ship.getWidth()/2-2,ship.getY(),5));
         keys[4] = false;
      }
      
      // Check collision between ship and aliens
        for (Alien alien : horde.getList()) 
        {
            alien.checkCollision(ship);
        }

      // Update ship flicker and cooldown states
        ship.updateFlicker();
        ship.updateCooldown();
      
      shots.drawEmAll(graphToBack);
      shots.moveEmAll();

      
      
      
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship -- Part 3
      shots.cleanEmUp();
      horde.removeDeadOnes(shots.getList());
      
      //make sure you've drawn all your stuff
      ship.draw(graphToBack);
      horde.drawEmAll(graphToBack);
      //powers.drawEmAll(graphToBack);
      

		twoDGraph.drawImage(back, null, 0, 0);
      back = null;
      
      window.setColor(Color.WHITE);
      window.drawString("Lives: " + ship.getLives(), 10, 20);
      }
	}

   public void checkGameOver() 
   {
        if (horde.reachBottom() ||ship.getLives() <= 0) 
        {
            gameOver = true;
        }
   }
   
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
      //method needs to be implemented 
      //because class implements KeyListner
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            checkGameOver();//
            repaint();
         }
      }catch(Exception e)
      {
         //feel free to add something here, or not
      }
  	}
}