import java.util.Scanner;
public class ArrayData {
	
	private Double[] array ;
	
	public ArrayData(Double[] A)
	{
		array = A;
	}
//рA皚秈array皚
	public double max()
	{
		double maxAns, maxTemp = 0.0;
		maxTemp = array[0];
		for(int i =0 ; i<array.length ;i++)
		{
			
			if(array[i] > maxTemp)
			{
				maxTemp = array[i];
			}
		}
		maxAns = maxTemp;
		return maxAns;
	}
	//―皚程
	public double avg()
	{
		double avgAns, avgTemp = 0.0;
		for(int i =0 ; i <array.length ;i++)
		{
			avgTemp += array[i]; 
		}
		avgAns = avgTemp/array.length;
		return avgAns;
	}//―皚キА
	public void reverse()
	{
		double [] reverseArray = new double[array.length];
		for(int i=0; i<array.length;i++)
		{
			reverseArray[i] = array[(array.length-1)-i];
		}
		for(int i=0; i<array.length;i++)
		{
			array[i] = reverseArray[i];
		}
	}//р皚腁
	public void shuffle()
	{
		double temp, temp1, temp2;
		for(int i=0;i<(int)(Math.random()*array.length);i++)
		{
			int one = (int)(Math.random()*array.length);
			int two = (int)(Math.random()*array.length);
			//ヴ種ㄢ计
			temp1 = array[one];
			temp2 = array[two];
			temp = temp1;
			temp1 = temp2;
			temp2 = temp;
			//рone蛤twoユ传
			array[one] = temp1;
			array[two] = temp2;
			//рユ传皚
		}
	}
	public String toString()
	{	
		String temp = new String();
		for(int i = 0; i<array.length;i++)
		{
			temp +=  String.valueOf(array[i]) + " " ;
		}
		return ("[ " + temp + "]");	
		
	}//toString皚妓
	public double inner_product(Double[] B)
	{
		double [] innerProduct = new double[array.length];
		double innerProductAns = 0.0;
		for(int i =0; i<array.length;i++)
		{
			innerProduct[i] = array[i] * B[i];
		}//蛤皚B
		for(int i =0; i<array.length;i++)
		{
			innerProductAns += innerProduct[i];
		}
		return innerProductAns;
	}
}
