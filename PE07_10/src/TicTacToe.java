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
		for(int j =0; j<COLUMNS;j++) {
			r=r+board[i][j];
			r=r+"|\n";
		}
		
				
	}
	return r;
}
private String[][] board;
private static final int ROWS=3;
private static final int COLUMNS=3;

}        
