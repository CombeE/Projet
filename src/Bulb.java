
public class Bulb
{

	private static final int DEFAULT_POWER=100;
	private boolean isLit;
	private final int power;
	
	public Bulb()
	{
		this.power=DEFAULT_POWER;
		this.isLit=false;
	}
	
	public Bulb(int power)
	{
		this.power=power;
		this.isLit=true;
	}
	
	public void switchOn()
	{
		this.isLit=true;
	}
	
	public void switchOff()
	{
		this.isLit=false;
	}
	
	public void getPower()
	{
		System.out.println(this.DEFAULT_POWER);
	}
	
	public void isLit()
	{
		System.out.println(this.isLit);
	}
	

}

