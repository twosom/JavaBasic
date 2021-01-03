package interfaceex;

public class CalculatorTest 
{
	public static void main(String[] args) 
	{	
		int num1= 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		calc.showInfo();
		
		Calc cal = new CompleteCalc();
		//Overriding 된 메서드가 있을 때는
		//new 연산자로 생성된 인스턴스의 메서드가 실행 됨.
		cal.showInfo();
		System.out.println(cal.square(num2));
		calc.description();
		cal.description();
		
		int [] arr = {1, 2, 3, 4, 5};
		
		//total(int [] arr)은 인터페이스에 직접 생성된
		//정적 메소드이기 대문에, 인터페이스명을 직접 쓰고 . 메소드이름으로 호출
		System.out.println(Calc.total(arr));
		

	}
}