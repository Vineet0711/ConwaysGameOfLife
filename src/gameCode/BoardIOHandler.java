package gameCode;

import java.util.Scanner;

public class BoardIOHandler {
	public boolean takeBoardInput(boolean[][] board) {
		int temp=0;
		int rows=board.length;
		if(rows<1)
			return false;
		int cols=board.length;
		if(cols<1)
			return false;
		System.out.println("Enter board(Use 1 for alive cell and 0 for dead cell): ");
		boolean inputType=true;
		Scanner k=new Scanner(System.in);
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				temp=k.nextInt();
				if(temp==1)
					board[i][j]=true;
				else if(temp==0)
					board[i][j]=false;
				else
					inputType=false;
			}
		}
		k.close();
		return inputType;
	}
	public void printBoard(boolean [][] board) {
		int rows=board.length,cols=board[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(board[i][j])
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
	}
}
