package tesst1;


public class classs {
	public static void main(String[] args)
	{
		time cur = new time();
}

class time
{
	public int hour;
	private int minute;
	private float second;

	public int gethour() {return hour;}
	public int getmin() {return minute;}
	public float getsec() {return second;}
	
	public void sethour(int h)
	{
		if (h<0 || h>23 ) return;
		hour = h;
	}
	
	public void setminute(int m)
	{
		if(m<0 || m>60) return;
		minute = m;
	}
	
	public void setsecond(float s)
	{
		if( s< 0.0f || s>59.99f) return;
		second = s;
	}
}
