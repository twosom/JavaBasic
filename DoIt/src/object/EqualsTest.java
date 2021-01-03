package object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	
	//hashCode 값으로 학번을 반환하도록 메서드 재정의
	@Override
	public int hashCode() {
		return studentId;
	}





	@Override
	public boolean equals(Object obj) 
	{
		if(obj instanceof Student) 
		{
			Student std = (Student)obj;
			if(this.studentId == std.studentId && this.studentName == std.studentName) 
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		return false;
	}




	@Override
	public String toString() {
		return studentId + ", " + studentName;
	}
	
}

public class EqualsTest {
	public static void main(String [] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;	//ref copy
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) {		//기호로 비교
			System.out.println("studentLee 와 studentLee2의 주소는 같습니다.");
			
		}
		else {
			System.out.println("studentLee 와 studentLee2의 주소는 다릅니다.");
		}
		
		
		if(studentLee.equals(studentLee2)) {	//equals 메소드로 비교
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		}
		
		////////
		
		
		if(studentLee == studentSang) {		//기호로 비교
			System.out.println("studentLee 와 studentSang의 주소는 같습니다.");
			
		}
		else {
			System.out.println("studentLee 와 studentSang의 주소는 다릅니다.");
		}
		
		
		if(studentLee.equals(studentSang)) {	//equals 메소드로 비교
			System.out.println("studentLee와 studnetSang는 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentSang는 동일하지 않습니다.");
		}
		
		
		
		System.out.println("studentLee의 hashCode : " + studentLee.hashCode());
		System.out.println("studentSang의 hashCode : " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));
	}

}
