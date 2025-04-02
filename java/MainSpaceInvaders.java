// Java GUI Game Assignment  SpaceInvadersClassic 2023 Version
// finish all segments of code marked by  // FINISH ME
// There may be some that are not marked with FINISH ME
// so read the comments carefully!

// ********************************
// THIS IS A TEST GRADE
// ********************************

// Some general info:
// 1) You have the following classes: Ship, Alien, ShipBullet, AlienBullet, Explosion 
//    which all extend MovableObject which implements MovableInterface
// 2) The class MovableObject is now abstract, so you cannot new it!
//    You will need to new Ship, Alien, ShipBullet, AlienBullet, Explosion
// 3) The class MovableObject has many variables to control things like movement
//    You will need to familiarize yourself with these variables and the 
//    getter and setter methods


// WHAT SHOULD I DO FIRST??????
// 1) Get comfortable with these classes and methods.
// 2) Compile your interface, MovableObject, Ship, Alien, and other classes
// 3) Finish all of the FINISH ME comments in this class, but leave out
//        for now the methods that are blank which will say
//        DO THIS METHOD CALL LATER or DO THIS LATER
//        Comment out the code for the methods.
// 4) Compile this class, and once your syntax errors are corrected you
//        should be able to run your program and have basic functionality
// 5) Start completing some of the unfinished methods and put in calls to
//        these methods.  However, DO ONE AT A TIME.  Compile and Run.




// to do for extra credit:
// see the syllabus below.

/*
Aliens Cloaking  +1


Energy Bar  +1
The Ship losses if it runs out of energy.
It losses energy with bullets that go off the screen.
It gains energy when a bullet hits an Alien bullet.
It gains energy when a bullet hits an Alien.


Explosions widen gradually +1


Bullets go around bullets +1


Alien bullets in attack mode after a while (shooting towards the ship) +1
*/

/*
Required
========
+10 - Ship Bullets destroy Alien Bullets with an explosion.

+10 - Ship Bullets destroy Aliens with an explosion.

+10 - Alien Bullets destroy Ship Bullets with an explosion.

+10 - Alien Bullets destroy the ship with an explosion.

+10 - The ship wins if it destroys all of the aliens,
      else the aliens win.

+5  - Score, Wins, and Losses are shown and updated.

+5  - An Alien wins if they hit the ship.

+5  - An Alien wins if an AlienBullet hits the ship.

+5  - Barricades can only take 3 hits per game.
They should not be shown or stop Alien Bullets
after 3 hits.

+10 - The program compiles and runs.

+10 - The graphical objects all show.

+10 - Everything functions as it should.

*/



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;

// (formerly SpaceInvadersClassic)
public class Main extends JFrame implements WindowListener 
{
  // put these constants in an interface
  public static final int alienShiftXValue = 10;
  public static final int alienShiftYValue = 5;
  public static final float alienShiftTimeStart = 600.0f;

  private static final int maxAliensHorizontal = 40;
  private static final int maxAliensVertical   = 40;

  private int totalChancesToCreateAnAlienBullet = 650;

  private int winningScore = 50;  // you need a score of 50 to win at level 1

  private int gameOverMessageXValue = 20;
  private int gameOverMessageYValue = 60;


  // screen variables (these can change)

  private int screenWidth  = 500;
  private int indentWidth  = 20;
  private int screenHeight = 600;

  private int startMouseDragX = -1;
  private int startMouseDragY = -1;

  private boolean gameOver = true;
  private boolean gamePaused = false;
  private boolean createAllObjects = true;


  // for buffering
  private BufferedImage back;

  // keys for movement of the ship and firing
  private boolean[] keys;  

  // ***** declaration of JFrame variables *****

  // define a mainPanel for components
  JPanel mainPanel;

  // define JPanels for a BorderLayout
  JPanel     northPanel;   // this is the message panel
  SouthPanel southPanel;   // put your buttons on this panel
  JPanel     westPanel;    // this panel will be empty for now
  boolean    showWestPanel = false;
  JPanel     eastPanel;    // this panel will be empty for now
  boolean    showEastPanel = false;

  DrawPanel  centerPanel;  // this will be the panel with all the drawing of MovableObjects

  // title in northPanel
  JLabel northText;

  // Buttons
  JButton runButton;
  JButton pauseButton;
  JButton stopButton;
  JButton exitButton;


  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *** declare your arrays and beginning MovableObjects ********************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************

  MovableObject ship;  // this will be controlled by the user (moves left and right)

  int shipDistanceFromBottomOfScreen = 100;

  private Image shipImage;  // we need one image to load

  private Image alienImage;  // we need one image to load and all aliens can use this 1 image

  private Image shipBulletImage;  // we need one image to load and all ship bullets can use this 1 image

  private Image alienBulletImage;  // we need one image to load and all alien bullets can use this 1 image

  private Image explosionImage;  // we need one image to load and all explosions can use this 1 image



  // we need to use a 2 dimensional array

  MovableObject [][] aliens;

  private int numAliensHorizontal = 15;
  private int numAliensVertical = 6;

  // An ArrayList of alien bullets
  private ArrayList<MovableObject> alienBullets;

  // An ArrayList of ship bullets
  private ArrayList<MovableObject> shipBullets;

  // An ArrayList of explosions
  private ArrayList<MovableObject> explosions;

  // wins, losses, and score  
  int score;
  int wins = 0;
  int losses = 0;
  // PUT YOUR NAME ON THIS
  String showMessage = "Welcome to Space Invaders the Classic Version by Aliana Marakovic";

  // thread for the runButton
  Thread runThread = null;
  int threadDelay = 20;  // the paintComponent method will be called every 25 milliseconds



  // 
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *** alien methods *******************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************

  // turn off all aliens
  public void turnOffAliens()
  {
    // FINISH ME
    // use nested loops to loop through all of the aliens
    // USE maxAliensVertical for the r (row)
    // USE maxAliensHorizontal for the c (col)
    for (int r = 0; r<maxAliensVertical; r++  )
    {
      for (int c = 0; c<maxAliensHorizontal; c++ )
      {
        // Hide this alien (call a method and pass it true)
        aliens[r][c].setHidden(true);
      }
    }
  }


  // turn on the aliens that will show on the screen
  public void turnOnVisibleAliens()
  {
    // FINISH ME
    // use nested loops to loop through all of the aliens shown on the screen
    // USE numAliensVertical for the r (row)
    // USE numAliensHorizontal for the c (col)
    // and set the Y value of all aliens on each row to the same y value
    // and set the hidden property to false

    for (int r = 0; r<numAliensVertical; r++ )
    {
      for (int c = 0; c<numAliensHorizontal; c++ )
      {
        aliens[r][c].setY(aliens[r][0].getY());
        // change the hidden flag to false for this alien
        aliens[r][c].setHidden(false);
      }
    }   
  }


  // make sure all possible aliens are set in case the screen is enlarged 
  public void turnOnAliensShift()
  {
    // FINISH ME
    // use nested loops to loop through all of the aliens
    // USE maxAliensVertical for the r (row)
    // USE maxAliensHorizontal for the c (col)

    for (int r=0; r<maxAliensVertical; r++)
    {
      for (int c=0; c<maxAliensHorizontal; c++)
      {
        aliens[r][c].setShiftTimeStart(alienShiftTimeStart);
        aliens[r][c].setShiftXValue(alienShiftXValue);  // shift left or right in pixels
        aliens[r][c].setShiftYValue(alienShiftYValue);  // shift down in pixels
        aliens[r][c].setShiftTimeInterval(threadDelay); // every 20 ms subtract from shift time
        aliens[r][c].setShiftTime(alienShiftTimeStart); // amount of time left before the shift
      }
    }   

  }

  public void resetAllAliens()
  {
    // FINISH ME
    // use nested loops to loop through all of the aliens
    // USE maxAliensVertical for the r (row)
    // USE maxAliensHorizontal for the c (col)
    // we will only show some of them (what fits on the screen)
    // we will never get rid of them, but rather flip the hidden flag
    int x = 20;
    int y = 10;
    for (int r=0; r<maxAliensVertical; r++)
    {
      x = 20;
      for (int c=0; c<maxAliensHorizontal; c++)
      {
        aliens[r][c].setX(x);
        // set the x value to x (call this alien's setX() method)
        aliens[r][c].setY(y);
        // set the y value to x (call this alien's setY() method)

        x = x + 55;                 
      }
      y = y + 55;
    }   
  }


  public void resetAllAliensXValue()
  {
    // USE maxAliensVertical for the r (row)
    // USE maxAliensHorizontal for the c (col)
    // we will only show some of them (what fits on the screen)
    // we will never get rid of them, but rather flip the hidden flag
    int x = 20;
    for (int r=0; r<maxAliensVertical; r++)
    {
      x = 20;
      for (int c=0; c<maxAliensHorizontal; c++)
      {
        aliens[r][c].setX(x);
        // set this aliens x value

        x = x + 55;                 
      }
    }   
  }

  public void resetAllAliensYValue()
  {
    // USE maxAliensVertical for the r (row)
    // USE maxAliensHorizontal for the c (col)
    // we will only show some of them (what fits on the screen)
    // we will never get rid of them, but rather flip the hidden flag
    float y = aliens[0][0].getY();

    for (int r=0; r<maxAliensVertical; r++)
    {
      for (int c=0; c<maxAliensHorizontal; c++)
      {
        aliens[r][c].setY(y);
        // set this aliens y value              
      }
      y = y + 55;       
    }   
  }

  public void resetAllAliensXYValue()
  {
    // USE maxAliensVertical for the r (row)
    // USE maxAliensHorizontal for the c (col)
    // we will only show some of them (what fits on the screen)
    // we will never get rid of them, but rather flip the hidden flag
    int x = 20;
    float y = aliens[0][0].getY();
    for (int r=0;r<maxAliensVertical; r++)
    {
      x = 20;
      for (int c=0; c<maxAliensHorizontal; c++)
      {
        // set both the x and y value of this alien
        // ???????
        aliens[r][c].setXY(x,y); 

        x = x + 55;                 
      }
      y = y + 55;   
    }   
  }


  public void createAllAliens()
  {

    // create all of the aliens
    // create the 2D array to hold all the possible aliens
    // actually we have pointers to MovableObject objects that are set to null
    aliens = new Alien[maxAliensVertical][maxAliensHorizontal];

    // USE maxAliensVertical for the r (row)
    // USE maxAliensHorizontal for the c (col)
    // we will only show some of them (what fits on the screen)
    // we will never get rid of them, but rather flip the hidden flag
    int x = 20;
    int y = 10;
    for (int r=0; r<maxAliensVertical; r++)
    {
      x = 20;
      for (int c=0; c<maxAliensHorizontal; c++)
      {
        // FINISH ME
        // Create an Alien object
        // CHANGE Bug.gif to alien.png
        aliens[r][c] = new Alien(centerPanel, "alien.png", alienImage, x,y , 50,50);
        x = x + 55;                 
      }
      y = y + 55;
    }   
  }


  // this finds the number of aliens that are still left on
  //    the screen.
  // if this returns 0, then the aliens are all gone and
  //    we are a winner
  // So, this method will be called to determine that we are
  //    a winner
  public int numAliensLeft()
  {
    int count = 0;
    // FINISH ME
    // use nested loops to loop through all of the aliens shown on the screen
    // USE numAliensVertical for the r (row)
    // USE numAliensHorizontal for the c (col)
    for (int r = 0; r< numAliensVertical; r++ )
    {
      for (int c = 0; c<numAliensHorizontal; c++ )
      {
        if (!aliens[r][c].isHidden())
        {
          count++;
          // FINISH ME
          // Add one to your count
          // ?????????
        }
      }
    }
    return count; 
  }


  public void resetAllAliensWithScreenResize()
  {

      numAliensHorizontal = (screenWidth-(2*indentWidth))/55;
      numAliensVertical = (screenHeight - (int)(screenHeight*3.0/5))/55;


      if (numAliensHorizontal > maxAliensHorizontal)
        numAliensHorizontal = maxAliensHorizontal;

      if (numAliensVertical > maxAliensVertical)
        numAliensVertical = maxAliensVertical;


      turnOffAliens();
      turnOnVisibleAliens();

      resetAllAliensXValue();
      resetAllAliensYValue();

      turnOnAliensShift();

  }


  private Image loadImage(String filename)
  {
    Image tempImage = null;

    if (filename != null && !filename.equals(""))
    {
      try
      {
        tempImage = Toolkit.getDefaultToolkit().getImage(filename);
        System.out.println("toolkit ok");
      }
      catch (Exception e)
      {
        System.out.println("error getImage with toolkit unable to load " + filename);
      }
    }

    return tempImage;
  }





  // 
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *** create your arrays and beginning MovableObjects (new) ***************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************


  public void initMovableObjects()
  {

    numAliensHorizontal = (screenWidth-(2*indentWidth))/55;
    numAliensVertical = (screenHeight - (int)(screenHeight*3.0/5))/55;

    if (numAliensHorizontal > maxAliensHorizontal)
      numAliensHorizontal = maxAliensHorizontal;

    if (numAliensVertical > maxAliensVertical)
      numAliensVertical = maxAliensVertical;


    if (createAllObjects)
    {
      System.out.println("CREATING all objects");
      createAllObjects = false;

      // FINISH ME
      // FIND SUITABLE PICTURES FOR YOUR ship, aliens, bullets, and explosions 
      // your image files can be of type  gif, jpg, or png  
      // replace Actor.gif and Bug.gif with your image


      // get an image for the ship
      // call the loadImage method to get the image loaded.
      // Use a given image or make your own.
      shipImage = loadImage("ship.png");

      // get an image for the ship bullet
      shipBulletImage = loadImage("bullet.png");

      // get an image for the alien
      alienImage = loadImage("alien.png");

      // get an image for the alien bullet
      alienBulletImage = loadImage("bullet.png");

      // get an image for the explosion
      explosionImage = loadImage("explosion.png");

      // FINISH ME
      // create the ship
      ship = new Ship(centerPanel, "Actor.gif", shipImage, screenWidth/2-25,screenHeight-150, 50,50);     



      createAllAliens();
      turnOnAliensShift();


      // FINISH ME
      // you will need to create all of your ArrayList objects
      // THEY NEED TO BE OF TYPE MovableObject

      // An ArrayList of alien bullets  <MovableObject>
      alienBullets = new ArrayList<MovableObject>();


      // An ArrayList of ship bullets  <MovableObject>
      shipBullets  = new ArrayList<MovableObject>();


      // An ArrayList of explosions  <MovableObject>
      explosions = new ArrayList<MovableObject>(); 


    }
    else
    {
      resetAllAliens();
      alienBullets.clear();
      shipBullets.clear();
      explosions.clear();
      ship.setHidden(false);  
    }

    score = 0;


    ship.setXY(screenWidth/2-25,screenHeight-shipDistanceFromBottomOfScreen);

    turnOffAliens();
    turnOnVisibleAliens();

  }



  // ***** public void initialize *****  
  public void initialize( )
  {
    back = null;
    gameOver = true;

    keys = new boolean[5];

    // create the buttons
    runButton  = new JButton("Run");
    pauseButton = new JButton("Pause");
    stopButton  = new JButton("Stop");
    exitButton  = new JButton("Exit");

    // create a mainPanel for components
    mainPanel = new JPanel();

    // ***** create JPanels for a BorderLayout *****
    northPanel   = new JPanel();
    southPanel   = new SouthPanel();
    southPanel.setListeners(); // this will add listeners for the JButton objects


    if (showWestPanel)
    {
      westPanel    = new JPanel();
    }
    if (showEastPanel)
    {
      eastPanel    = new JPanel();
    }

    centerPanel  = new DrawPanel();

    mainPanel.setLayout(new BorderLayout());
    southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

    setCenterPanelColor(Color.black);
    northPanel.setBackground(new Color(115,205,255));
    southPanel.setBackground(new Color(115,205,255));
    if (showWestPanel)
    {
      westPanel.setBackground(new Color(115,205,255));
    }
    if (showEastPanel)
    {
      eastPanel.setBackground(new Color(115,205,255));
    }


    // add buttons to southPanel
    southPanel.add(runButton);
    southPanel.add(pauseButton);
    southPanel.add(stopButton);
    southPanel.add(exitButton);


    northText = new JLabel("Space Invaders Written by Aliana Marakovic");
    northPanel.add(northText);

    // ***** add the panels to the mainPanel 5 areas *****
    mainPanel.add(northPanel,BorderLayout.NORTH);
    mainPanel.add(southPanel,BorderLayout.SOUTH);
    if (showEastPanel)
    {
        mainPanel.add(eastPanel,BorderLayout.EAST);
    }
    if (showWestPanel)
    {
        mainPanel.add(westPanel,BorderLayout.WEST);
    }
    mainPanel.add(centerPanel,BorderLayout.CENTER);

    southPanel.setFocusable(true);
    southPanel.requestFocus();

    initMovableObjects();

    centerPanel.repaint();

    // make the mainPanel be the main content area and show it
    setContentPane(mainPanel);

    setVisible(true);  // always show the screen last


    // focus the southPanel so that we can receive key strokes
    southPanel.setFocusable(true);
    southPanel.requestFocus();
  }   // end of public void initialize

  // ***** default constructor *****
  public Main( )
  {
    setSize(screenWidth,screenHeight);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    setTitle("Space Invaders Classic Written by Aliana Marakovic");
    addWindowListener(this);

    // initialize variables
    initialize( );
  }

  public void setMessage(String message)
  {
    northText.setText(message);
  }

  public String getMessage()
  {
    return northText.getText();
  }

  public void setThreadDelay(int threadDelay)
  {
    this.threadDelay = threadDelay;
  }

  public void setNorthPanelColor(Color color)
  {
    northPanel.setBackground(color);
  }

  public void setSouthPanelColor(Color color)
  {
    southPanel.setBackground(color);
  }

  public void setCenterPanelColor(Color color)
  {
    centerPanel.setBackground(color);
  }

  public void setWestPanelColor(Color color)
  {
    if (showWestPanel)
    {
      westPanel.setBackground(color);
    }
  }

  public void setEastPanelColor(Color color)
  {
    if (showEastPanel)
    {
      eastPanel.setBackground(color);
    }
  }


//Window event methods
 public void windowClosing(WindowEvent e){
     System.out.println("The frame is closing.....");
   }

   public void windowClosed(WindowEvent e){
     System.out.println("The frame has been closed!");
   }

   public void windowActivated(WindowEvent e){
     System.out.println("The frame has been activated");        
   }

   public void windowDeactivated(WindowEvent e){
     System.out.println("The frame has been deactivated");        
   }

   public void windowDeiconified(WindowEvent e){
     System.out.println("The frame has been restored from a minimized state");
   }

   public void windowIconified(WindowEvent e){
     System.out.println("The frame has been minimized");
   }

   public void windowOpened(WindowEvent e){
     System.out.println("The frame is now visible");
   }

  // ***** main method *****
  public static void main(String[] arguments)
  {
    Main game = new Main( );
    game.centerPanel.repaint();
  }


class SouthPanel extends JPanel implements KeyListener,ActionListener, Runnable
{
  // start of actionPerformed (ActionListener interface)
  // handle button clicks here
  public SouthPanel()
  {
    // allow buttons to listen for clicks
    super();
  }

  public void setListeners()
  {
    runButton.addActionListener(this);
    pauseButton.addActionListener(this);
    stopButton.addActionListener(this);
    exitButton.addActionListener(this);
    addKeyListener(this);
  }

  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource(); // points to the object that got clicked
    String command = e.getActionCommand();

    if (source==exitButton)
    {
      gameOver = true;
      if (runThread!=null)
      {
        runThread.stop();
        runThread = null;
      }
      System.exit(0);
    }
    else if (source==runButton)
    {    
      if (!gameOver)  
        if (runThread != null)
          if (runThread.isAlive())
            return;  // if the game is active, ignore the click

      if (runThread==null)
      {
        runThread = new Thread(this); // the game is inactive, so let's play
      }

      // init the screen

      initialize( );

      showMessage = "";
      centerPanel.setShowGameStartScreen(false);

      // start the game
      if (!runThread.isAlive())
        runThread.start();
        gameOver = false;
          gamePaused = false;
    }
    else if (source==stopButton)  // they want to stop the game
    {
      gameOver = true;
      gamePaused = false;
      if (runThread!=null)
      {
        runThread.stop();
        runThread = null;
      }
      // init the screen

      initialize( );

      showMessage = "";
      centerPanel.setShowGameStartScreen(true);
      centerPanel.repaint();
    }
    else if (source==pauseButton)  // they want to pause the game
    {
      System.out.println("paused button pressed command ="+command);
      showMessage = "";
      if (gamePaused)
      {
        pauseButton.setText("Pause");
        gamePaused = false;       
        showMessage = "";
        centerPanel.setShowGameStartScreen(false);

        centerPanel.repaint();
        // focus the southPanel so that we can receive key strokes
        southPanel.setFocusable(true);
        southPanel.requestFocus();
      }
      else
      {
        pauseButton.setText("Resume");
        gamePaused = true;
        showMessage = "";
        centerPanel.setShowGameStartScreen(true);
        centerPanel.repaint();
        // focus the southPanel so that we can receive key strokes
        southPanel.setFocusable(true);
        southPanel.requestFocus();
      }

    } // end of else if

  }  // end of actionPerformed


  // thread to delay for the runButton
  // do it all here so we have control of the buttons
  public void run()
  {
    try
    {
      while(true)
      {          
         // this will redraw everything on the centerPanel
         centerPanel.repaint();

         setFocusable(true);
         requestFocus();


         Thread.currentThread().sleep(threadDelay);

      }
    } catch(Exception e)
      {
      }
  }

  // start of keyTyped (KeyListener interface)
  public void keyTyped(KeyEvent e)
  {
  }  // end of keyTyped(KeyEvent e)

  // start of keyPressed (KeyListener interface)
  public void keyPressed(KeyEvent e)
  {
    keys[2] = false;
    keys[3] = false;
    keys[4] = false;

    int key = e.getKeyCode();
    String keyString = e.getKeyText(key);
    keyString = keyString.toUpperCase();

    // System.out.println("Key is pressed inside southPanel="+keyString);

    if (gameOver)
      return;
    if (gamePaused)
      return;


    if (keyString.equals("UP"))
    {
       keys[0]=true;
    }
    else if (keyString.equals("DOWN"))
    {
       keys[1]=true;
    }
    else if (keyString.equals("LEFT"))
    {
      keys[2]=true;
    }
    else if (keyString.equals("RIGHT"))
    {
      keys[3]=true;
    }
    else if (keyString.equals("SPACE"))
    {
        // System.out.println("Key is pressed inside southPanel="+keyString);

      keys[4]=true;
    }

  }  // end of keyPressed(KeyEvent e)

  // start of keyReleased (KeyListener interface)
  public void keyReleased(KeyEvent e)
  {
    int key = e.getKeyCode();
    String keyString = e.getKeyText(key);
    keyString = keyString.toUpperCase();

    if (keyString.equals("UP"))
    {
      keys[0]=false;
    }
    else if (keyString.equals("DOWN"))
    {
      keys[1]=false;
    }
    else if (keyString.equals("LEFT"))
    {
      keys[2]=false;
    }
    else if (keyString.equals("RIGHT"))
    {
      keys[3]=false;
    }
    else if (keyString.equals("SPACE"))
    {
      keys[4]=false;
    }
  }  // end of keyReleased(KeyEvent e)



} // end of centerPanel class



// *************************************************************************************
// *************************************************************************************
// *************************************************************************************
// *************************************************************************************
// this is the panel for the game  (this is an inner class)
// *************************************************************************************
// *************************************************************************************
// *************************************************************************************
class DrawPanel extends JPanel implements  MouseListener, MouseMotionListener
{
  String testXY="X= Y=";
  boolean dragging = false;
  boolean showGameStartScreen = true;

  public DrawPanel()
  {
    super();
    addMouseListener(this);
    addMouseMotionListener(this);
  }

  public void update(Graphics window)
  {
   paintComponent(window);
  }



  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *** Methods to CREATE OBJECTS and random firing *************************************
  // *************************************************************************************
  // *** You will need to call these methods from the main event loop ********************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************


  public void createAShipBullet()
  {

    // FINISH ME
    // create a ShipBullet
    MovableObject bullet = new MovableObject(centerPanel, "bullet.png", shipBulletImage, Math.round(ship.getX()+ship.getWidth()/2 - 25), Math.round(ship.getY() - 20), 50,30);

    // FINISH ME
    // add the bullet to the shipBullets ArrayList
  shipBullets.add(bullet);

  }


  public void createAnAlienBullet(MovableObject alien)
  {

      // FINISH ME
      // create an alien bullet below the given alien and center it
      // set its speedY to be greater than the alien's speedY
      // NOTE: an alien should only be allowed to fire a bullet if there is
      //       NO alien in front of it (or it would shoot one of its own)



      MovableObject bullet = new MovableObject(centerPanel, "bullet.png", alienBulletImage, Math.round(alien.getX()+alien.getWidth()/2 - 25), Math.round(alien.getY() - 50), 50,30);
    bullet.setSpeedY(3);


      // FINISH ME
      // set its speedY to be greater than the speed of the alien     
      // ?????????



      // FINISH ME
      // add the bullet to the alienBullets ArrayList
      alienBullets.add(bullet);

  }


  public void createRandomAlienBullets()
  {

      // FINISH ME
      // create randomly alien bullets below the alien and center it
      // we will not create a bullet if there is another alien in front of it
      for (int r=0; r < numAliensVertical; r++)
      {
        for (int c=0; c < numAliensHorizontal; c++)
        {
            MovableObject alien = aliens[r][c];


            // FINISH ME
            // create a random value between 0 and totalChancesToCreateAnAlienBullet-1 inclusive
            int chanceValue = (int)((Math.random()) * totalChancesToCreateAnAlienBullet);  // creates a random number between 0 and ?? inclusive

            if (chanceValue == 2)  // if the number happens to be the lucky number 2
            {

              boolean canFire = false;

              if (r==numAliensVertical-1) // its on the bottom row
              {
                canFire = true;
              }
              else if (aliens[r+1][c].isHidden()) // nothing in front
              {
                canFire = true;
              }

              if (!alien.isHidden() && canFire)
              { 
                createAnAlienBullet(alien);
                // FINISH ME
                // call the method createAnAlienBullet and pass it the alien        

              }
            }
        }
      }

  }


  public void createAnExplosion(MovableObject object)
  {

      // FINISH ME
      // create an explosion on the given object using the object's x,y,width, and height values

      MovableObject explosion = new Explosion(centerPanel, "explosion.png", explosionImage, object.getXRounded(), object.getYRounded(), object.getWidth(),object.getHeight());
    explosion.setTime(1500);
    explosions.add(explosion);
    System.out.println("created explosion");


      // FINISH ME
      // set the time for the explosion to be on the screen


      // FINISH ME
      // add the explosion to the explosions ArrayList


  }



  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *** Methods to check for a COLLISION of your objects on the screen ******************
  // *************************************************************************************
  // *** You will need to call these methods from the main event loop ********************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************


  public boolean isCollisionBetweenShipAndAliens(Graphics gMemory)
  {
     if (ship!=null)
    for (int r=0; r < numAliensVertical; r++)
      {
        for(int c = 0; c < numAliensHorizontal; c++)
          {
          MovableObject alien = aliens[r][c];
           if (!alien.isHidden() && alien.intersects(ship)) {
            createAnExplosion(ship);
            alien.setHidden(true); 
            ship.setHidden(true);


            //set the time?
            return true; 
          }
            score -=10;


          }
          }

    // FINISH ME
    // DO THIS METHOD LATER
    // check for a collision between your ship and the aliens.  You will need one loop.
    // if so, hide the alien (leave the ship alone or hide it)
    // replace with an explosion (call createAnExplosion) (and set the explosions time)
    return false;
  }   


  public  boolean isCollisionBetweenShipBulletsAndAliens(Graphics gMemory)
 {
    // FINISH ME
    // DO THIS METHOD LATER
    // check for a collision between your ship bullets and the aliens  you will need two loops
    // if so, remove the bullet from its ArrayList and hide the alien (don't remove it)
    // replace with an explosion  (call createAnExplosion) (and set the explosions's time)
    for (int i=0; i<shipBullets.size(); i++) {
      MovableObject shipBullet = shipBullets.get(i);
      boolean finished = false; 
      for (int r=0; !finished && r < maxAliensVertical; r++) {
        for (int c=0; !finished && c < maxAliensHorizontal; c++) {
          if (!aliens[r][c].isHidden() && shipBullet.intersects(aliens[r][c])) {
            createAnExplosion(aliens[r][c]);
            shipBullets.remove(i);
            i--;
            aliens[r][c].setHidden(true);
            score += 1;
            finished = true;
            return true;
          }
        }
      }
    }

    return false;
  }   


  public  boolean isCollisionBetweenShipBulletsAndAlienBullets(Graphics gMemory)
  {
    // FINISH ME
    // DO THIS METHOD LATER
    // check for a collision between your ship bullets and the alien bullets  you will need two loops
    // if so, remove both bullets from their respective ArrayList
    // replace with an explosion  (call createAnExplosion) (and set the explosions's time)
    for (int i=0; i<shipBullets.size(); i++)
    {
      MovableObject shipBullet = shipBullets.get(i); 
      for (int j=0; j<alienBullets.size(); j++)
      {
        if (shipBullet.intersects(alienBullets.get(j)))
        {
            createAnExplosion(alienBullets.get(j));
          shipBullets.remove(i);
          alienBullets.remove(j);
          j--;
          i--; 
          return true;              
        }
      }
    }

    return false;
  }   

  public  boolean isCollisionBetweenShipAndAlienBullets(Graphics gMemory)
  {
    boolean isIt = false;
    // FINISH ME
    // DO THIS METHOD LATER
    // check for a collision between your ship and the alien bullets  you will need two loops
    // if so, remove bullets from the alienBullets ArrayList (leave the ship alone or hide it)
    // replace with an explosion  (call createAnExplosion) (and set the explosions's time)
     for (int i=0; i<alienBullets.size(); i++)
    {
      MovableObject alienBullet = alienBullets.get(i);
      if (alienBullet.intersects(ship))
      {
        createAnExplosion(ship); 
        ship.setHidden(true);
        alienBullets.remove(i);
        isIt = true;
        i--; 

      } 
    }
    return isIt;
  }   






  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *** Methods to draw all of your objects on the screen *******************************
  // *************************************************************************************
  // *** You will need to call these methods *********************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************


  public void drawAliens(Graphics gMemory)
  {
    // FINISH ME
    // draw your aliens  you will need two loops
    // Use numAliensVertical and numAliensHorizontal
    for (int r=0; r<numAliensVertical; r++)
      {
        for (int c=0; c<numAliensHorizontal; c++)
        {
            MovableObject alien = aliens[r][c];
            if (alien != null)
            {
              alien.draw(gMemory);

              // draw the alien (call a method)

            }
        }
      }

  }   

  public void drawAlienBullets(Graphics gMemory)
  {
     for (int i=0; i < alienBullets.size(); i++)
     {
          MovableObject bullets =    alienBullets.get(i);
          bullets.draw(gMemory);
      }
    // FINISH ME
    // DO THIS METHOD LATER
    // draw your alien bullets  you will need one loop



  }   

  public void drawShip(Graphics gMemory)
  {
    // FINISH ME
    // draw your ship
    if (ship != null)
    {
       ship.draw(gMemory);
    }

  }


  public void drawShipBullets(Graphics gMemory)
  {
    // FINISH ME
    // draw your ship bullets  you will need one loop
    for (MovableObject bullet : shipBullets)
    {
      bullet.draw(gMemory);
    }


  }   


  public void drawExplosions(Graphics gMemory)
  {
    for (int i=0; i < explosions.size(); i++)
     {
          MovableObject explosion = explosions.get(i);
          explosion.draw(gMemory);
     }
    // FINISH ME
    // DO THIS METHOD LATER
    // draw your explosions  you will need one loop



  }   


  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *** Methods to MOVE all of your objects on the screen *******************************
  // *************************************************************************************
  // *** You will need to call these methods from the main event loop ********************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************


  public void moveAliens()
  {
    // Use numAliensVertical and numAliensHorizontal
    for (int r=0; r<numAliensVertical; r++)
      {
        for (int c=0; c<numAliensHorizontal; c++)
        {
            MovableObject alien = aliens[r][c];
            if (alien != null)
            {
              alien.shift();
               // Call the shift() method
               // ?????.??????                          
            }
        }
      }

  }   

  public void moveAlienBullets()
    {
  for (int i=0; i < alienBullets.size(); i++)
     {
          MovableObject notbullet = alienBullets.get(i);
          if (ship != null)
          {
          notbullet.moveDown();
          }
          if (notbullet.getY() > getHeight()+notbullet.getHeight())
          {
           alienBullets.remove(i);
           i--;
          }
     }

    // FINISH ME
    // DO THIS METHOD LATER
    // move your alien bullets  you will need one loop
    // if they go off the screen, remove them from the ArrayList



  }   


  public void moveShipBullets()
  {
    // FINISH ME
    // move your ship bullets  you will need one loop
    // they should move upwards towards the aliens
    // if they go off the screen, remove them from the ArrayList
    //for (int i=0; i<shipBullets.size(); i++)
    for(int i = 0; i < shipBullets.size(); i++)
  {
    MovableObject bullets = shipBullets.get(i);
    if(ship != null)
    {
      bullets.moveUp();

    }
    if(bullets.getY() > getHeight() + bullets.getHeight())
    {
      shipBullets.remove(i);
      i--;

    }
  }



      // if they go off the screen, remove them from the ArrayList



  }   


  public void moveExplosions()
  {
    for (int i=0; i<explosions.size(); i++)   
    {
      MovableObject explosion = explosions.get(i);

      explosion.setTime(explosion.getTime()-threadDelay);

      if (explosion.getTime() <= 0)
      {
        explosions.remove(i);
        i--;
      }
    }
    // FINISH ME (Optional)
    // DO THIS METHOD LATER
    // move your explosions  you will need one loop
    // (You need to expand the image in all 4 directions by 1)



  }   


  public void updateTimeForExplosions()
  {
     for(int i = 0; i < explosions.size(); i++)
     {
       MovableObject explosion = explosions.get(i);
       float f = explosion.getTime() - 25;
       if(f <= 0)
       {
         explosions.remove(i);
         i--;
       }
       else
       {
         explosion.setTime(f);

       }
     }
    // FINISH ME
    // DO THIS METHOD LATER
    // update the time for each explosion (one loop)
    // if the time is up, remove them from your list
    // threadDelay is set to 20 ms, the amount of time that passes
    //    between each call to paintComponent
    // you will need an indexed for loop since you cannot remove objects
    //     when using a for each loop





  }   


  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *** this Method shows the screen when the game is not active ************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************

  public void showScreen(Graphics2D g2, boolean resetAllObjectsToStart)
  {
      // System.out.println("inside showScreen");

      back = (BufferedImage)(createImage(getWidth(),getHeight()));

      //create a graphics reference to the back ground image
      //we will draw all changes on the background image
      Graphics gMemory = back.createGraphics();

      // clear the screen
      gMemory.setColor(Color.BLACK);
      gMemory.fillRect(0,0,getWidth(),getHeight());


      // reset the number of aliens on the screen
      // if the screen size has changed

      if (screenWidth != getWidth() || screenHeight != getHeight())
      {           
        screenWidth = getWidth();
        screenHeight = getHeight();
      }


      if (resetAllObjectsToStart)
      {

        resetAllAliensWithScreenResize(); 


        // reposition your ship
        if (ship != null)
        {
          ship.setXY(screenWidth/2-25,screenHeight-shipDistanceFromBottomOfScreen);
        }

      }



      // FINISH ME
      // DO THESE METHOD CALLS LATER
      // draw all of the objects
      // CALL a METHOD, do not write the method code here

      drawShip(gMemory);
      drawAlienBullets(gMemory);
      drawAliens(gMemory);
      drawShipBullets(gMemory);
      drawExplosions(gMemory);


      // ???????


      Font font;

      // draw the score, level, etc.
      gMemory.setColor(Color.RED);
      font = new Font("Courier New",Font.BOLD,16); 

      // FINISH ME
      // draw your score, wins, and losses
      gMemory.drawString("Score: " + score + "  Wins: " + wins + "  Losses: " + losses,10,10);


      gMemory.setColor(Color.RED);
      font = new Font("Courier New",Font.BOLD,32);

      gMemory.drawString(showMessage,gameOverMessageXValue,gameOverMessageYValue);


      // *** show the screen by copying the image to the graphics display ********
      g2.drawImage(back, null, 0, 0); 

  }


  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // *************************************************************************************
  // ***  this is the main event loop for the game ***************************************
  // *************************************************************************************
  // ***  check for collisions, move all objects, and draw all screen objects ************
  // *************************************************************************************
  // ***  add to your score, checks for a win and check for a loss ***********************
  // *************************************************************************************
  // *************************************************************************************



  public void paintComponent(Graphics g)
  {
    super.paintComponent((Graphics2D)g);
    Graphics2D g2 = (Graphics2D) g;

    if (showGameStartScreen)
    {
      showScreen(g2,true);
      return;
    }

    if (gameOver)
    {
      return;
    }

    if (gamePaused)
    {
      showScreen(g2,false);
      return;
    }

    //take a snap shop of the current screen and save it as an image
    //that is the exact same width and height as the current screen
    back = (BufferedImage)(createImage(getWidth(),getHeight()));

    //create a graphics reference to the back ground image
    //we will draw all changes on the background image
    Graphics gMemory = back.createGraphics();

    // clear the screen
    gMemory.setColor(Color.BLACK);
    gMemory.fillRect(0,0,getWidth(),getHeight());

    // System.out.println("game is playing");

    // DO NOT USE THESE 3 commands here unless you want to display 
    //   the coordinates of the mouse pointer
    //gMemory.setColor(Color.RED);
    //gMemory.drawString(testXY,10,50);
    //gMemory.setColor(Color.BLACK);

    if (screenWidth != getWidth() || screenHeight != getHeight())
    {           
      screenWidth = getWidth();
      screenHeight = getHeight();               

      resetAllAliensWithScreenResize();

      // reset the position of the ship
      ship.setY(screenHeight-shipDistanceFromBottomOfScreen);

    }


    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *** Move your ship ******************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************

    // move the ship
    if (keys[0] && ship != null) // UP
    {
      // ship.setDirection(0);
      // ship.moveUp(); 
    }
    else if (keys[1] && ship != null) // DOWN
    {
      // ship.setDirection(180);
      // ship.moveDown();     
    }
    else if (keys[2] && ship != null) // LEFT
    {
      ship.setDirection(270);
      ship.moveLeft();    
    }
    else if (keys[3] && ship != null) // RIGHT
    {
      ship.setDirection(90);
      ship.moveRight();
    }
    else if (keys[4] && ship != null) // SPACE
    {
      createAShipBullet();
      // FINISH ME
      // fire a bullet
      // CALL A method to do this

      keys[4] = false; // this stops it from creating several bullets in the time frame



    }


    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // ***  check for collisions here  *****************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************

    // FINISH ME
    // DO THIS METHOD CALL LATER
    // call the method to check for a collision between the ship and aliens
    // CALL a METHOD, do not write the method code here


    // FINISH ME
    // DO THIS METHOD CALL LATER
    // call the method to check for a collision between the ship and alien bullets
    // CALL a METHOD, do not write the method code here

    // FINISH ME
    // DO THIS METHOD CALL LATER
    // call the method to check for a collision between the ship bullets and aliens
    // CALL a METHOD, do not write the method code here
    isCollisionBetweenShipBulletsAndAlienBullets(gMemory);
isCollisionBetweenShipBulletsAndAliens(gMemory);


    // FINISH ME
    // DO THIS METHOD CALL LATER
    // call the method to check for a collision between the ship bullets and alien bullets
    // CALL a METHOD, do not write the method code here



    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // ***  move all of your objects here, but not the ship ********************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************

    // FINISH ME
    // call the method to move your aliens
    moveAliens();
    moveShipBullets();

    // FINISH ME
    // DO THIS METHOD CALL LATER
    // call the method to move your alien bullets
    // CALL a METHOD, do not write the method code here



    moveAlienBullets();


    // FINISH ME (OPTIONAL)
    // DO THIS METHOD CALL LATER
    // call your method to move your explosions (optional to make them get bigger)
    // CALL a METHOD, do not write the method code here




    createRandomAlienBullets();
    moveAlienBullets();

    updateTimeForExplosions();



    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************
    // *** DRAW all your objects here using gMemory ****************************
    // *** or use any graphic commands to draw lines, ovals, rects, etc. *******
    // *************************************************************************
    // *************************************************************************
    // *************************************************************************


    drawAliens(gMemory);

    drawShip(gMemory);

    drawShipBullets(gMemory);

    drawAlienBullets(gMemory);

    drawExplosions(gMemory);


    // FINISH ME
    // DO THIS METHOD CALL LATER
    // call methods to draw your alien bullets, ship bullets, and explosions
    // CALL METHODS, do not write the method code here




    Font font;


    // check to see if you win and if so, show a message and set gameOver=true;
    if (numAliensLeft()==0 || score >= winningScore)
    {
      gMemory.setColor(Color.RED);
      font = new Font("Courier New",Font.BOLD,32); 
      gMemory.drawString("Y O U   W I N ! !",10,450);
      gameOver = true;
      showGameStartScreen = true;
      showMessage = "Y O U   W I N ! !";
      wins++;
    }
    else if (aliens[numAliensVertical-1][0].getY()+aliens[numAliensVertical-1][0].getHeight() >= ship.getY() ||     isCollisionBetweenShipAndAlienBullets(gMemory))
    {
      gMemory.setColor(Color.RED);
      font = new Font("Courier New",Font.BOLD,32); 
      gMemory.drawString("Y O U   L O S E ! !",10,450);
      System.out.println("YOU LOSE 2");
      gameOver = true;
      showGameStartScreen = true;
      showMessage = "Y O U   L O S E ! !";
      losses++;         
    }



      // draw the score, level, etc.
    gMemory.setColor(Color.RED);
    font = new Font("Courier New",Font.BOLD,16); 

    // FINISH ME
    // draw your score, wins, and losses
    String scoreAsStr = ""+score;
    if (scoreAsStr.length()< 2)
      scoreAsStr = " " + scoreAsStr;

    gMemory.drawString("Score: " +score + "  Wins: " + wins + "  Losses: "+losses,10,10);



    // *** show the screen by copying the image to the graphics display ********
      g2.drawImage(back, null, 0, 0); 
  }  // end of public void paintComponent(Graphics g)



  public void setShowGameStartScreen(boolean value)
  {
    showGameStartScreen = value;
  }




  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *** if a key is pressed *************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  public void keyPressed(String keyString)
  {
    // nothing to do, as we will handle it else where
    // System.out.println("Key is pressed inside centerPanel="+keyString);
  } // end of method public void keyPressed(String keyString)


  // ***** MouseListener interface methods *****


  // start of mouseClicked(MouseEvent e) (MouseListener interface)
  public void mouseClicked(MouseEvent e) 
  {
    //int xPos = e.getX();
    //int yPos = e.getY();
  }  // end of public void mouseClicked(MouseEvent e) 


  // start of mousePressed(MouseEvent e) (MouseListener interface)
  public void mousePressed(MouseEvent e) 
  {
     // nothing to do
  }  // end of public void mousePressed(MouseEvent e)



  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *** if the mouse is released, fire a bullet  ****************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  // *************************************************************************
  public void mouseReleased(MouseEvent e) 
  {
    dragging = false;
    startMouseDragX = -1;
    startMouseDragY = -1;
    // nothing to do
  }  // end of public void mouseReleased(MouseEvent e)


  public void mouseEntered(MouseEvent e) 
  {
   // nothing to do
  }  // end of public void mouseEntered(MouseEvent e)


  public void mouseExited(MouseEvent e) 
  {

  }  // end of public void mouseExited(MouseEvent e)


  // ***** MouseMotionListener interface methods *****


  public void mouseMoved(MouseEvent e) 
  {
    int xPos = e.getX();
    int yPos = e.getY();
    testXY = "X=" + xPos + "  Y=" + yPos;
  }  // end of public void mouseMoved(MouseEvent e) 


  public void mouseDragged(MouseEvent e) 
  {
     // nothing to do
  }  // end of public void mouseDragged(MouseEvent e)

} // end of class DrawPanel


// *************************************************************************************
// *************************************************************************************
// *************************************************************************************
// *************************************************************************************
// this is the END of class DrawPanel for the game
// *************************************************************************************
// *************************************************************************************
// *************************************************************************************




} // end of class Main (formerly SpaceInvadersClassic)