package tesst1;
import java.util.*;


public class adducation {
	public static void main(String[] args)
	{
		String name[] = {"Luka", "Lee"};
		
		for(int i=0; i <name.length;i++)
		{
			System.out.println(i + "번째는" + name[i] );
		}
		String tmp = name[1];
		System.out.println(tmp);
		name[0] = "Daniel";
		
		for(String str : name) {
			System.out.println(str);
		}
	}

}
