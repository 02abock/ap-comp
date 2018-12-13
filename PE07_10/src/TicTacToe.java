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
	
}