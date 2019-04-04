import java.util.Random;
public class Robot{
	public Robot(Object obj){
		givenMaze=(Maze) obj;
	}
	public int getColum(){
		return givenMaze.getPostionColum();
	}
	public int getRow(){
		return givenMaze.GetPostionRow();
	}
public int MovmentDierection()
{
	return rand.nextInt(4);
}
public boolean RoMoveleft(){
	return givenMaze.moveLeft();
}
public boolean RoMoveRight(){
	return givenMaze.moveRight();
}
public boolean RoMoveUp(){
	return givenMaze.moveUp();
}
public boolean RoMoveDown(){
	return givenMaze.moveDown();
}
	Random rand = new Random();
	
	Maze givenMaze;
}