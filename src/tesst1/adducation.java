package tesst1;
import java.util.*;


public class adducation {
	public static void main(String[] args)
	{
		String word[][]= {
			{"chair", "의자"},
			{"tiger", "호랑이"},
			{"bear", "곰"},
		};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<word.length; i++)
		{
			System.out.printf("Q%d. %s의 뜻은?", i, word[i][0]);
			
			String tmp= scan.nextLine();
			if(tmp.equals(word[i][1]))
			{
				System.out.printf("정답입니다 \n");
			}
			else
			{
				System.out.printf("오답입니다.\n");
			}
		}
	}
}
