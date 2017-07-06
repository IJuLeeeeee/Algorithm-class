
import loader.TrashCanAb;
public class MyTrashCan extends TrashCanAb
{
	public static void main(String[] args)	
	{
	}
	private String trashCan ="[";
	public void Insert(int garbage) 
	{
		if(trashCan != "[")
		{
			trashCan += ("," + garbage);
		}
		else
		{
			trashCan += garbage;
		}
	}
	public void Empty() 
	{
		trashCan = "[";
		System.gc();
	}
	public String ToString() 
	{
		
		return trashCan + "]";
	}
}