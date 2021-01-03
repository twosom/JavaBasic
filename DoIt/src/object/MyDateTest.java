package object;

class MyDate
{
	int day;
	int month;
	int year;
	
	
	public MyDate(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year= year;
	}
	
	
	@Override
	public int hashCode() {
		String code = this.day + "" + this.month + "" + this.year;
		return Integer.parseInt(code);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) 
		{
			MyDate md = (MyDate)obj;
			if(this.day == md.day && this.month == md.month && this.year == md.year) {
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}

public class MyDateTest 
{
	public static void main(String[] args) 
	{
		MyDate date1 = new MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));
		
		
		System.out.println("date1의 hashCode : " + date1.hashCode());
		System.out.println("date2의 hashCode : " + date2.hashCode());
		
	}
}

