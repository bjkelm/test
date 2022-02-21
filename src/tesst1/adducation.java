package tesst1;
import java.util.*;


public class adducation {
	public static void main(String[] args)
	{
		final int size =5;
		int x=0, y=0, num=0;
		
		int[][] bingo= new int[size][size];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++)
				bingo[i][j] = i* size +1 +j;
			
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++)
			{
				x= (int)(Math.random()* size);
				y= (int)(Math.random()* size);
				
				int tmp = bingo[i][j];
				bingo[i][j]= bingo[x][y];
				bingo[x][y]= tmp;
			}
		do {
			for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++)
					System.out.printf("%02d ", bingo[i][j]);
				System.out.println();
			}
			
			System.out.printf("1~%d까지의 숫자를 입력하세요", size *size );
			String tmp = scan.nextLine();
			num = Integer.parseInt(tmp);
			
			outer: for(int i=0; i<size; i++) {
				for(int j=0; j<size; j++)
				{
					if(bingo[i][j] == num)
					{
						bingo[i][j]= 0;
						break outer;
					}
				}	
			}
		}while (num!=0);
	}
}
