// Class for Player
class Player
{
    // Instance variables
    private String name;
    private int pointsScored;
    
    // Constructor
    public Player(String name, int pointsScored)
    {
      this.name = name;
      this.pointsScored = pointsScored;
    }
    
    public String getName()
    {
      return name;
    }
    
    public int getPointsScored()
    {
      return pointsScored;
    }
    
    // For testing results
    public String toString()
    {
      return name + " " + pointsScored;
    }
}