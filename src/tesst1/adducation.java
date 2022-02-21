package tesst1;
import java.util.*;


public class adducation {
	public static void main(String[] args)
	{
		final int size =10;
		int x=0, y=0;
		
		char[][] board = new char[size][size];
		
		for(int i=0; i<size ; i++)
			for(int j=0; j<size; j++)
				board[i][j]= ' ';
		
		byte[][] shipboard = {
		//1 2  3  4  5  6  7  8  9
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{1, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{1, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{1, 1, 0, 0, 0, 0, 0, 0, 0},
		{0, 0, 0, 0, 0, 0, 0, 0, 0},
		{1, 1, 0, 0, 0, 0, 0, 0, 0},
		{1, 1, 0, 0, 0, 0, 0, 0, 0},
		};
		
		for(int i=1; i<size; i++)
		{
			board[0][i] = board[i][0] = (char)(i+'0');
		}
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.printf("좌표를 입력하세요. (종료는 00)>");
			String input = scanner.nextLine();
			
			if(input.length() == 2)
			{
				x= input.charAt(0) - '0';
				y=input.charAt(1) - '0';
				
				if(x==0 && y==0)
					break;
			}
			
			if(input.length()!=2 || x<=0 || x>=size || y<=0 || y>=size)
			{
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
				continue;
			}
			
			board[x][y]= shipboard[x-1][y-1] == 1 ? 'O' : 'X';
			
			for(int i=0; i<size; i++)
			{
				System.out.println(board[i]);
			}
			System.out.println();
			}
	}

}
