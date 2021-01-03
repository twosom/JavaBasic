package abstractexam;

public abstract class Car 
{
	public abstract void refuel();
	public abstract void run();
	
	public void stop()
	{
		System.out.println("차가 멈춥니다,");
	}
}
