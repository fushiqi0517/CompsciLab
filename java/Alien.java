import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.image.BufferedImage;


public class Alien extends MovableObject {

  // We can override any method that we want to change or
  // we can write completely new methods


  // We don't inherit constructors, so we have to write our own
  // We can call super to call our super class constructor    
    public Alien(JPanel mainPanel, String filename, Image image, float x, float y, int width, int height)
    {
      super(mainPanel, filename, image, x, y, width, height);
  }


  // FINISH ME
  // write the move() method
  // since it was abstract in the MovableObject class
  public void move()
  {
     // Look in your super class for a method to call.
     super.moveDown();
  }




}