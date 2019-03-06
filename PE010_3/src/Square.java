import java.awt.Rectangle;

public class Square extends  Rectangle{
	public Square(int CenterX, int CenterY,int SideLength)
    {  
		super();
		x=CenterX;
		y=CenterY;
		side=SideLength;
		setLocation((x+(side/2)),(y+(side/2)));
   }
	public double getArea() {
		return side*side;
	}
	
	int x;
	int y;
	int side;
}