package object;

public class StringEquals {
	public static void main(String [] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);
		//String 클래스의 equals()메서드는 같은 문자열의 경우 true,
		//그렇지 않은 경우 false를 반환하도록 재정의 되어있음
		System.out.println(str1.equals(str2));
		
		@SuppressWarnings("deprecation")
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
	}

}
