public class MagicSquares{
	private int arrayLength;
	private int [][] box;
	private int row=0;
	private int colum=0;
	public MagicSquares(int squareSize) {
		box=new int [squareSize][squareSize];
		arrayLength=squareSize;
	}
	public void addValue(int number) {
		if(colum==(arrayLength)) {
			row++;
			colum=0;
		}
		box[row][colum]=number;
		colum++;
	}
	public boolean isMagic() {
		int sum=0; 
		int tempSum=0;
	
	for(int i=0; i<arrayLength;i++)  
	sum+=box[0][i];
	System.out.println(sum);
	
	for (int j=1;j<arrayLength;j++) {
		tempSum=0;
		for(int l=0; l<arrayLength;l++) {
			tempSum+=box[j][l];
		}
		if(sum!=tempSum) {
			System.out.println(tempSum);
			return false;}
			
	}

		
		for (int j=0;j<arrayLength;j++) {
			tempSum=0;

			for(int l=0; l<arrayLength;l++) {
				tempSum+=box[l][j];
			}
			if(sum!=tempSum) {
				System.out.println("break1");

				return false;
			}
		}
		tempSum=0;

		for(int i=0; i<arrayLength;i++) {

			int j=0;
			tempSum+=box[i][j];
			j++;
		}
		if(sum!=tempSum) {
			System.out.println("break2");

			return false;

		}
		tempSum=0;

		for(int i=0; i<arrayLength;i++) {
			int j=arrayLength-1;
			tempSum+=box[i][j];
			j--;
		}
		if(sum!=tempSum) {
			System.out.println("break3");

			return false;
}	
		return true;
	}
}
	