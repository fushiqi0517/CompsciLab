import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
   private int x, y, w, h;
   
	public MovingThing()
	{
		this(10,10,10,10);
	}

	public MovingThing(int x, int y)
	{
      this(x, y, 10, 10);
	}

	public MovingThing(int x, int y, int w, int h)
	{
		this.x=x;
      this.y=y;
      this.w=w;
      this.h=h;
	}
   
    public void setPos(int x, int y)
    {
      this.x = x;
      this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return w;
    }

    public void setWidth(int w) {
        this.w = w;
    }

    public int getHeight() {
        return h;
    }

    public void setHeight(int h) {
        this.h = h;
    }
   
   
   //do not change code below this line
	public abstract void move(String direction);
	public abstract void draw(Graphics window);

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}