package gameCode;

public class GameOfLife {
	private int countNeighbours(boolean[][] currentBoard,int row,int col) {
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
	
	private boolean[][] nextGeneration(boolean[][] currentBoard) {
		int rows=currentBoard.length,cols=currentBoard[0].length;
		int aliveNeighbours=0;
		boolean[][] newGeneration=new boolean[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				aliveNeighbours=countNeighbours(currentBoard,i,j);
				if(currentBoard[i][j]) {
					if(aliveNeighbours<2||aliveNeighbours>3)
						newGeneration[i][j]=false;
					else
						newGeneration[i][j]=true;
				}
				else {
					if(aliveNeighbours==3)
						newGeneration[i][j]=true;
					else
						newGeneration[i][j]=false;
				}
			}
		}
		return newGeneration;
	}
	
	public boolean[][] generate(boolean[][] board,int n){
		int rows=board.length,cols=board[0].length;
		boolean[][] nextGenerationBoard=new boolean[rows][cols];
		nextGenerationBoard=board;
		for(int i=0;i<n;i++) {
			nextGenerationBoard=nextGeneration(nextGenerationBoard);
		}
		return nextGenerationBoard;
	}
}
