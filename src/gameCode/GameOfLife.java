package gameCode;

public class GameOfLife {
	public int countNeighbours(boolean[][] currentBoard,int row,int col) {
		int rows=currentBoard.length,cols=currentBoard[0].length;
		int aliveNeighbours=0;
		for(int i=row-1;i<=row+1;i++) {
			for(int j=col-1;j<=col+1;j++) {
				if((i==row&&j==col)||i<0||j<0||i>=rows||j>=cols)
					continue;
				if(currentBoard[i][j]==true)
					aliveNeighbours++;
			}
		}
		return aliveNeighbours;
	}
}
