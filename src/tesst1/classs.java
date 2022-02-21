package tesst1;

class tv 
{
	String color;
	int channel;
	boolean power;
	
	void power() 
	{
		power = !power;
	}
	void up()
	{
		channel++;
	}
	void down()
	{
		channel--;
	}
}

public class classs {
	public static void main(String[] args)
	{
		tv t = new tv();
		
		t.power = true;
		t.channel = 8;
		t.color = "빨강";
		
		t.down();
		
		System.out.printf("현재 채널은 %s이고 전원은 %b이며 채널은  %d입니다.",t.color, t.power, t.channel);
	}

}
