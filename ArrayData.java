import java.util.Scanner;
public class ArrayData {
	
	private Double[] array ;
	
	public ArrayData(Double[] A)
	{
		array = A;
	}
//��A�}�C�s�i�harray�}�C
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
	//�D�X�}�C�̤j��
	public double avg()
	{
		double avgAns, avgTemp = 0.0;
		for(int i =0 ; i <array.length ;i++)
		{
			avgTemp += array[i]; 
		}
		avgAns = avgTemp/array.length;
		return avgAns;
	}//�D�X�}�C������
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
	}//��}�C�A��
	public void shuffle()
	{
		double temp, temp1, temp2;
		for(int i=0;i<(int)(Math.random()*array.length);i++)
		{
			int one = (int)(Math.random()*array.length);
			int two = (int)(Math.random()*array.length);
			//���N����ӼƦr
			temp1 = array[one];
			temp2 = array[two];
			temp = temp1;
			temp1 = temp2;
			temp2 = temp;
			//��one��two�洫
			array[one] = temp1;
			array[two] = temp2;
			//��洫�᪺�s�^�h�}�C
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
		
	}//toString��C�L�X�}�C�ˤl
	public double inner_product(Double[] B)
	{
		double [] innerProduct = new double[array.length];
		double innerProductAns = 0.0;
		for(int i =0; i<array.length;i++)
		{
			innerProduct[i] = array[i] * B[i];
		}//��}�CB�ۭ�
		for(int i =0; i<array.length;i++)
		{
			innerProductAns += innerProduct[i];
		}
		return innerProductAns;
	}
}
