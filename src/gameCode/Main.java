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
		
		System.out.println("Enter board(Use 1 for alive cell and 0 for dead cell): ");
		int temp=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				temp=k.nextInt();
				if(temp==1)
					board[i][j]=true;
				else if(temp==0)
					board[i][j]=false;
			}
		}
		k.close();
	}

}
