package interfaceex;

public interface Calc 
{
	double Pi = 3.14;
	int ERROR = 999999999;	
	//인터페이스에서 선언한 변수는 모두 컴파일 과정에서
	//값이 변하지 않는 상수로 자동 변환됨.
	//public static final 예약어를 쓰지 않아도 무조건 상수로 인식.
	
	
	//public abstract를 쓰지 않아도 컴파일 과정에서 자동으로 
	//추상 메서드로 변환된다.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	int square(int num);
	
	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
		myMethod();
		
	}
	
	static int total(int[] arr) {
		int total= 0;
		
		for(int i : arr) {
			total += i;
		}
		
		
		myStaticMethod();
		return total;
	}

	private void myMethod() {
		System.out.println("private 메서드입니다.");
		
	}
	private static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
		
	}
	
	
	
	
	
	
	void showInfo();

}
