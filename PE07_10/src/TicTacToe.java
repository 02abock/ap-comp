public class TicTacToe{
	public TicTacToe(){
		board = new String[ROWS][COLUMNS];
		for(int i =0; i<ROWS;i++) {
			for(int j=0; j<COLUMNS; j++)
			{
				board[i][j]=" ";
			}
		}
	}
public void set(int i, int j, String player) {
	if(board[i][j].equals(" ")) {
		board[i][j]=player;
	}
	
}
public String toString() {
	String r ="";
	for (int i =0; i< ROWS; i++) {
		r=r+"|";
		for(int j =0; j<COLUMNS;j++) 
			r=r+board[i][j];
		r=r+"|\n";
		
		
				
	}
	return r;
}

public String getWinner() {
	
	for (int i =0; i< ROWS; i++) {
		if(board[i][0]=="x"&&board[i][1]=="x"&&board[i][2]=="x")
			return "x";
		if(board[i][0]=="o"&&board[i][1]=="o"&&board[i][2]=="o")
			return "o";
	}
	for (int j =0; j< COLUMNS; j++) {
		if(board[0][j]=="x"&&board[1][j]=="x"&&board[2][j]=="x")
			return "x";
		if(board[0][j]=="o"&&board[1][j]=="o"&&board[2][j]=="o")
			return "o";
	}
	
		if(board[0][0]=="x"&&board[1][1]=="x"&&board[2][2]=="x")
			return "x";
		if(board[0][2]=="x"&&board[1][1]=="x"&&board[2][0]=="x")
			return "x";
		if(board[0][0]=="o"&&board[1][1]=="o"&&board[2][2]=="o")
			return "o";
		if(board[0][2]=="o"&&board[1][1]=="o"&&board[2][0]=="o")
			return "o";
		
	return " ";
}
private String[][] board;
private static final int ROWS=3;
private static final int COLUMNS=3;

}        
