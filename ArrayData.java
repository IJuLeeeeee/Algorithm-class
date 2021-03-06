import java.util.Scanner;
public class ArrayData {
	
	private Double[] array ;
	
	public ArrayData(Double[] A)
	{
		array = A;
	}
//把A陣列存進去array陣列
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
	//求出陣列最大值
	public double avg()
	{
		double avgAns, avgTemp = 0.0;
		for(int i =0 ; i <array.length ;i++)
		{
			avgTemp += array[i]; 
		}
		avgAns = avgTemp/array.length;
		return avgAns;
	}//求出陣列平均值
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
	}//把陣列顛倒
	public void shuffle()
	{
		double temp, temp1, temp2;
		for(int i=0;i<(int)(Math.random()*array.length);i++)
		{
			int one = (int)(Math.random()*array.length);
			int two = (int)(Math.random()*array.length);
			//任意取兩個數字
			temp1 = array[one];
			temp2 = array[two];
			temp = temp1;
			temp1 = temp2;
			temp2 = temp;
			//把one跟two交換
			array[one] = temp1;
			array[two] = temp2;
			//把交換後的存回去陣列
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
		
	}//toString後列印出陣列樣子
	public double inner_product(Double[] B)
	{
		double [] innerProduct = new double[array.length];
		double innerProductAns = 0.0;
		for(int i =0; i<array.length;i++)
		{
			innerProduct[i] = array[i] * B[i];
		}//跟陣列B相乘
		for(int i =0; i<array.length;i++)
		{
			innerProductAns += innerProduct[i];
		}
		return innerProductAns;
	}
}
