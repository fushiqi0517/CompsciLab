import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.*;



// The Maze
public class TheMaze extends JFrame implements  ActionListener, KeyListener, Runnable
{ 

  int maxRows = 6;
  int maxCols = 8;


  // ***** declaration of JFrame variables *****
  Color highlightColor = Color.RED;
  Color drawColor = Color.BLACK;
  Color backgroundColor = Color.LIGHT_GRAY;  

  Color mazeColor     = Color.LIGHT_GRAY;
  Color visitedColor  = Color.CYAN;
  Color finishedColor = Color.RED;

  int   wallValue      = 0;
  int   pathValue      = 1;
  int   revisitedValue = 2;


  // define a mainPanel for components
  JPanel mainPanel;  
  // define JPanels for a BorderLayout
  JPanel     northPanel;
  JPanel     southPanel;
  JPanel     westPanel;
  JPanel     eastPanel;
  JPanel     centerPanel;



  JButton executeButton;
  JButton startRowColButton;

  Color startRowColButtonColor;
  Color exitRowColButtonColor;

  boolean doSetStartRowCol;
  boolean doSetExitRowCol;

  JButton exitRowColButton;




  JButton resetButton;

  // ***** public void initialize *****

  // FINISH ME
  // Create a JButton 2D array with maxRows and maxCols
  JButton [][] buttons = new JButton [maxRows][maxCols];

  // 0=wall, 1=path, 2=we have already been here
  // use wallValue, pathValue, and 
  // FINISH ME
  // Create an int 2D array with maxRows and maxCols
  int [][] maze = new int [maxRows][maxCols];

  int startRow = 0;
  int startCol = 0;

  int exitRow = -1; 
  int exitCol = 4;

  int lastVisitedRow = -1;
  int lastVisitedCol = -1;

  // Create an ArrayList of Point objects
  ArrayList <Point> path = new ArrayList <Point> ();

  // FINISH ME
  // PUT your name on the JLabel
  JLabel northMessage = new JLabel("The Maze written by Aliana Marakovic");


  Thread myThread = null;



  public void myDelay()
  {
    try
    {
      Thread.sleep(1000);
    }
    catch (Exception e1)
    {

    }

  }


    // is there a path from r,c to a destination?
    public boolean isPath(int r, int c)
    {           
      // ****** check all stopping conditions (the base cases)

      // FINISH ME
      // see if we are off the board (call !isValid(r,c))
    if (!isValid(r,c))
        return false;


      // we are here, so show a different color and delay
      buttons[r][c].setBackground(visitedColor);
      centerPanel.repaint();
      myDelay();


      // FINISH ME      
      // see if we have a wall
      if (maze[r][c] == wallValue)
      {
        // set the color back to the original color and delay
        buttons[r][c].setBackground(mazeColor);
        centerPanel.repaint();
        myDelay();

        // FINISH ME
        // return what?
        return false;
      }

      // FINISH ME
      // see if we have already been here
      if (maze[r][c] == revisitedValue)
      {
        buttons[r][c].setBackground(Color.GREEN);
        centerPanel.repaint();
        myDelay();

        buttons[r][c].setBackground(visitedColor);
        centerPanel.repaint();
        myDelay();

        // FINISH ME
        // return what?
        return false;
      }


      // FINISH ME      
      // see if we have found a way out of the maze
      // The variables exitRow and exitCol should be checked
      // and it must be a path.
      if ( r == exitRow && c == exitCol)
        {
          // FINISH ME
          // add the Point to the path
          // create a Point object that contains this row and col position
          path.add(new Point(r,c));
          buttons[r][c].setBackground(finishedColor);

          // FINISH ME      
          // Since we have reached our destination, we 
          // should return ????
          return true;
      }


      // FINISH ME
      // mark this spot as being visited
      //    so that we don't recurse from here again
    maze[r][c] = revisitedValue;


      // now try to go North, East, South, and West

      // FINISH ME
      // can we go North?
      // call isPath(?, ?)
      if (isPath(r-1,c))
      {
        // FINISH ME
        // add this Point to the path (r,c)
        path.add(new Point(r,c));

        // FINISH ME
        // return ????
        return true;
      }
      if (isPath(r,c+1))
       {
         // FINISH ME
         // add this Point to the path (r,c)
         path.add(new Point(r,c));

         // FINISH ME
         // return ????
         return true;
       }
      if (isPath(r+1,c))
      {
        // FINISH ME
        // add this Point to the path (r,c)
        path.add(new Point(r,c));

        // FINISH ME
        // return ????
        return true;
      }


      // FINISH ME
      // can we go West?
      if (isPath(r,c-1))
      {
        // FINISH ME
        // add this Point to the path (r,c)
        path.add(new Point(r,c));

        // FINISH ME
        // return ????
        return true;
      }
       
      // FINISH ME
      // if we get here, we did not find our destination
      // so we should remove this Point from our path
      path.remove(new Point(r,c));
      buttons[r][c].setBackground(mazeColor);


      // FINISH ME
      // Since we did not find our destination
      // we should also return ?????
      return false;
    }


  public boolean isValid(int r, int c)
  {
    // FINISH ME
    // see if this point is on the grid
    if( r < 0 ||  r >= maxRows ||  c < 0 ||  c >= maxCols)
    return false;
    return true;
  }


  // the thread method
  // this will run when we start the thread
  public void run()
  {
    path.clear();
    Point startPoint = new Point(startRow,startCol);
    Point exitPoint = new Point(exitRow,exitCol);

    System.out.println("Path from " + startPoint.toString() + " to " + exitPoint.toString() + "? "+isPath(startRow,startCol));
    Collections.reverse(path);

    System.out.println("Path = "+path.toString());
    northMessage.setText("The Maze Path = "+path.toString());

    myThread = null;
  }


  public void setMaze()
  {
    // FINISH ME
    // Loop through all the rows and cols
    // use maxRows and maxCols
    // use row major order (row by row)
    for (int r = 0; r < maxRows; r++)
    {
      for(int c = 0; c < maxCols; c++)
      {
        if (buttons[r][c].getText().equals(""+wallValue))
          maze[r][c] = wallValue;
        else
          maze[r][c] = pathValue;     
      }
    }



  }


  public void resetButtonValues()
  {
    // FINISH ME
    // Loop through all the rows and cols
    // use maxRows and maxCols
    // use row major order (row by row)
    for (int r = 0; r < maxRows; r++)
      {
        for (int c = 0; c<maxCols; c++)
        {
          buttons[r][c].setText(""+wallValue);
        }
      }

  }


  public void resetButtonColors()
  {
    for (int r=0; r<maxRows; r++)
    {
      for (int c=0; c<maxCols; c++)
      {
        buttons[r][c].setBackground(mazeColor);
      }
    }

    northMessage.setText("The Maze");
  }


  public void initialize( )
  {   
    // FINISH ME
    // create a JButton that says "Execute"
    executeButton = new JButton("Execute");
      executeButton.addActionListener(this);

      // FINISH ME
      // create a JButton that says "Reset"
      resetButton = new JButton("Reset");
      resetButton.addActionListener(this);


    // FINISH ME
    // create a JButton that says "Set Start Row,Col"
    startRowColButton = new JButton("Set Start Row,Col");
    startRowColButton.addActionListener(this);
    startRowColButtonColor = startRowColButton.getBackground();

    // FINISH ME
    // create a JButton that says "Set Exit Row,Col"
    exitRowColButton = new JButton("Set Exit Row,Col");
      exitRowColButton.addActionListener(this);
      exitRowColButtonColor = exitRowColButton.getBackground();


    // create a mainPanel for components
    // create a JPanel object
    // call the default constructor
    mainPanel = new JPanel();  

    // ***** assignments for menu variables *****

    // ***** create JPanels for a BorderLayout *****
    northPanel   = new JPanel();
    southPanel   = new JPanel();
    westPanel    = new JPanel();
    eastPanel    = new JPanel();
    centerPanel  = new JPanel();
    centerPanel.addKeyListener(this);


    northPanel.add(northMessage);

    southPanel.add(executeButton);
    southPanel.add(resetButton);
    southPanel.add(startRowColButton);
    southPanel.add(exitRowColButton);


    centerPanel.setLayout(new GridLayout(maxRows,maxCols));

    for (int r=0; r<maxRows; r++)
    {
    for (int c=0; c<maxCols; c++)
    {
      // fill according to the maze
      System.out.println("r="+r+"  c="+c);

      buttons[r][c] = new JButton(""+wallValue);

      buttons[r][c].addActionListener(this);
      buttons[r][c].setBackground(mazeColor);
      centerPanel.add(buttons[r][c]);
    }
    }

    mainPanel.setLayout(new BorderLayout());

    northPanel.setBackground(new Color(115,205,255));
    southPanel.setBackground(new Color(115,205,255));
    westPanel.setBackground(new Color(115,205,255));
    eastPanel.setBackground(new Color(115,205,255));
    // ***** You need to add buttons, etc. to the 5 panels *****


    // ***** add the panels to the mainPanel 5 areas *****
    mainPanel.add(northPanel,BorderLayout.NORTH);
    mainPanel.add(southPanel,BorderLayout.SOUTH);
    mainPanel.add(eastPanel,BorderLayout.EAST);
    mainPanel.add(westPanel,BorderLayout.WEST);
    mainPanel.add(centerPanel,BorderLayout.CENTER);




    // make the mainPanel be the main content area and show it
    setContentPane(mainPanel);
    setVisible(true);  // always show the screen last
  }   // end of public void initialize 


  // ***** default constructor *****

  public TheMaize( )
  { 
    // initialize variables

    setSize(800,600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // FINISH ME
    // Put your name on this!!!
    setTitle("The Maze written by Aliana Marakovic");


    initialize( );

  }

  // ***** ActionListener interface methods *****

  // start of actionPerformed (ActionListener interface)
  public void actionPerformed(ActionEvent e)
  {
    Object source = e.getSource();

    if (source == executeButton && myThread == null)
    {
      System.out.println("execute button pressed");

      // exitRow = -1; 
      // exitCol = 4;
      doSetStartRowCol=false;
      doSetExitRowCol=false;
      startRowColButton.setBackground(startRowColButtonColor);
      exitRowColButton.setBackground(exitRowColButtonColor);

      lastVisitedRow = -1;
      lastVisitedCol = -1;

    setMaze();
    resetButtonColors();

    // set a thread to get through the maze
    myThread = new Thread(this);
    myThread.start();     

      centerPanel.repaint();

    }
    else if (source == resetButton && myThread == null)
    {
      resetButtonValues();
      resetButtonColors();
      setMaze();
      startRowColButton.setBackground(startRowColButtonColor);
      exitRowColButton.setBackground(exitRowColButtonColor);

      centerPanel.repaint();
    }
  else if (source == startRowColButton && myThread == null)
  {
    startRowColButtonColor = startRowColButton.getBackground();
    startRowColButton.setBackground(Color.GREEN);
    doSetStartRowCol = true;
  }
  else if (source == exitRowColButton && myThread == null)
  {
    exitRowColButtonColor = exitRowColButton.getBackground();
    exitRowColButton.setBackground(Color.GREEN);
    doSetExitRowCol = true;
  }
  else if (myThread == null)
  {
      for (int r=0; r<maxRows; r++)
      {
        for (int c=0; c<maxCols; c++)
        {
          if (source == buttons[r][c])
          {
            if (doSetStartRowCol)
            {
              startRow = r;
              startCol = c;
              doSetStartRowCol=false;
              startRowColButton.setBackground(startRowColButtonColor);
              exitRowColButton.setBackground(exitRowColButtonColor);
              buttons[r][c].setBackground(Color.GREEN);
              buttons[r][c].setText(""+pathValue);
            }
            else if (doSetExitRowCol)
            {
              exitRow = r;
              exitCol = c;
              doSetExitRowCol=false;
              startRowColButton.setBackground(startRowColButtonColor);
              exitRowColButton.setBackground(exitRowColButtonColor);
              buttons[r][c].setBackground(Color.RED);
              buttons[r][c].setText(""+pathValue);  
            }
            else if (buttons[r][c].getText().equals(""+wallValue))
              buttons[r][c].setText(""+pathValue);
            else
              buttons[r][c].setText(""+wallValue);
          }
        }
      }

  }


  }  // end of actionPerformed


  // ***** KeyListener interface methods *****

  // start of keyTyped (KeyListener interface)
  public void keyTyped(KeyEvent e)
  {
    int key = e.getKeyCode();
    if (key == KeyEvent.VK_SPACE)
    {
      // do something;
    }  // end of if
  }  // end of keyTyped(KeyEvent e)

  // start of keyPressed (KeyListener interface)
  public void keyPressed(KeyEvent e)
  {
    // this is an empty method
    // System.out.println("keypressed");
    // centerPanel.repaint();

  }  // end of keyPressed(KeyEvent e)

  // start of keyReleased (KeyListener interface)
  public void keyReleased(KeyEvent e)
  {
    // this is an empty method
  }  // end of keyReleased(KeyEvent e)


  // ***** main method *****
  public static void main(String[] arguments)
  {
    Main mainMaze = new Main( );
  }


    // class that represents a point (r,c)
    class Point
    {
      // instance variables (fields, attributes, properties, ...)
      private int r,c;

      // init constructor
      public Point(int r, int c)
      {
        // FINISH ME
        this.r = r;
        this.c = c;
      }

      public String toString()
      {
        return "(" + r + "," + c + ")";
      }
    }



} // end of class Main // theMaze

