public class Maze{
	public Maze(){
	
		RoboMaze[0][0]="*";
		RoboMaze[1][0]="*";
		RoboMaze[2][0]="*";
		RoboMaze[3][0]="*";
		RoboMaze[4][0]="*";
		RoboMaze[5][0]="*";
		RoboMaze[6][0]="*";
		RoboMaze[7][0]="*";
		RoboMaze[8][0]="*";
		//colum 2
		RoboMaze[0][1]="*";
		RoboMaze[1][1]="0";
		RoboMaze[2][1]=" ";
		RoboMaze[3][1]=" ";
		RoboMaze[4][1]=" ";
		RoboMaze[5][1]=" ";
		RoboMaze[6][1]="*";
		RoboMaze[7][1]=" ";
		RoboMaze[8][1]="*";
		//colum 3
  	RoboMaze[0][2]="*";
		RoboMaze[1][2]=" ";
		RoboMaze[2][2]="*";
		RoboMaze[3][2]="*";
		RoboMaze[4][2]="*";
		RoboMaze[5][2]=" ";
		RoboMaze[6][2]="*";
		RoboMaze[7][2]=" ";
		RoboMaze[8][2]="*";
		//colum 4 
		RoboMaze[0][3]="*";
		RoboMaze[1][3]=" ";
		RoboMaze[2][3]="*";
		RoboMaze[3][3]=" ";
		RoboMaze[4][3]=" ";
		RoboMaze[5][3]=" ";
		RoboMaze[6][3]=" ";
		RoboMaze[7][3]=" ";
		RoboMaze[8][3]="*";
		// colum 5
		RoboMaze[0][4]="*";
		RoboMaze[1][4]=" ";
		RoboMaze[2][4]="*";
		RoboMaze[3][4]="*";
		RoboMaze[4][4]="*";
		RoboMaze[5][4]="*";
		RoboMaze[6][4]="*";
		RoboMaze[7][4]=" ";
		RoboMaze[8][4]="*";
		//colum 6 
		RoboMaze[0][5]="*";
		RoboMaze[1][5]=" ";
		RoboMaze[2][5]="*";
		RoboMaze[3][5]=" ";
		RoboMaze[4][5]="*";
		RoboMaze[5][5]=" ";
		RoboMaze[6][5]=" ";
		RoboMaze[7][5]=" ";
		RoboMaze[8][5]="*";
		//colum 7
		RoboMaze[0][6]="*";
		RoboMaze[1][6]="*";
		RoboMaze[2][6]="*";
		RoboMaze[3][6]=" ";
		RoboMaze[4][6]="*";
		RoboMaze[5][6]=" ";
		RoboMaze[6][6]="*";
		RoboMaze[7][6]="*";
		RoboMaze[8][6]="*";
		//colum 8
		RoboMaze[0][7]="*";
		RoboMaze[1][7]=" ";
		RoboMaze[2][7]=" ";
		RoboMaze[3][7]=" ";
		RoboMaze[4][7]=" ";
		RoboMaze[5][7]=" ";
		RoboMaze[6][7]=" ";
		RoboMaze[7][7]=" ";
		RoboMaze[8][7]=" ";
		//colum 9
		RoboMaze[0][8]="*";
		RoboMaze[1][8]="*";
		RoboMaze[2][8]="*";
		RoboMaze[3][8]="*";
		RoboMaze[4][8]="*";
		RoboMaze[5][8]="*";
		RoboMaze[6][8]="*";
		RoboMaze[7][8]="*";
		RoboMaze[8][8]="*"; 
		

}
	public void printMaze(){
	
		for(int i = 0; i<9; i++)
		{
   	 for(int j = 0; j<9; j++)
    {
        System.out.print(RoboMaze[i][j]);
    }
    System.out.println();
	}
	
}
	public boolean moveLeft(){


if (RoboMaze[PostionRow][PostionColum-1].equals("*")){
return false;

}
else{
	
	RoboMaze[PostionRow][PostionColum]=" ";
	RoboMaze[PostionRow][PostionColum-1]="O";
	PostionColum--;
	printMaze();
	return true;

}


	}
	public boolean moveRight(){

if (RoboMaze[PostionRow][PostionColum+1].equals("*")){
return false;
}
else{
	RoboMaze[PostionRow][PostionColum]=" ";
	RoboMaze[PostionRow][PostionColum+1]="O";
		PostionColum++;
	printMaze();

	return true;
	}
	}
public boolean moveUp(){

if (RoboMaze[PostionRow-1][PostionColum].equals("*")){
return false;
}
else{
	RoboMaze[PostionRow][PostionColum]=" ";
	RoboMaze[PostionRow-1][PostionColum]="O";
		PostionRow--;
	printMaze();

	return true;
	}
	}
public boolean moveDown(){
if (RoboMaze[PostionRow+1][PostionColum].equals("*")){
return false;
}
else{
	RoboMaze[PostionRow][PostionColum]=" ";
	RoboMaze[PostionRow+1][PostionColum]="O";
	PostionRow++;
	printMaze();

	return true;
	}
	}
public int getPostionColum(){
		return PostionColum;
	}
	public int GetPostionRow(){
		return PostionRow;
	}



 
String[][] RoboMaze = new String[9][9];

	int PostionColum=1;
	int PostionRow=1;
}
