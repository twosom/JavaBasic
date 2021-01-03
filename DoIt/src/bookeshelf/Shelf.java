package bookeshelf;

import java.util.ArrayList;

public class Shelf
{
	
	//자료를 순서대로 저장할 ArrayList 선언
	protected ArrayList<String> shelf;
	
	
	//Default Constructor로 Shelf 클래스를 생성하면
	//ArrayList도 생성된다.
	public Shelf()
	{
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount()
	{
		return shelf.size();
	}
}
