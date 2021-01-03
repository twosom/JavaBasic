package templateexam;

public class CarMain 
{
	public static void main(String [] args)
	{
		Car aiCar = new AICar();
		Car manCar = new ManualCar();
		
		System.out.println("===자율 주행하는 자동차===");
		aiCar.run();
		
		System.out.println("===사람이 운전하는 자동차===");
		manCar.run();
		
	}
}
