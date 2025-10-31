package gameCode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int rows=0,cols=0,n=0;
		
		Scanner k=new Scanner(System.in);
		System.out.println("Enter number of rows you  want in board: ");
		rows=k.nextInt();
		System.out.println("Enter number of columns you want in board: ");
		cols=k.nextInt();
		boolean[][] board=new boolean[rows][cols];
		boolean[][] result=new boolean[rows][cols];
		System.out.println("Enter generation number that you want to see: ");
		n=k.nextInt();
		
		BoardIOHandler io=new BoardIOHandler();
		boolean inputType=io.takeBoardInput(board);
		
		if(!inputType) {
			System.out.println("You have entered Wrong input, Board can only contain 0 and 1. ");
		}else {
			GameOfLife game=new GameOfLife();
			result=game.generate(board, n);
			io.printBoard(result);
		
		}
		k.close();
	}

}
