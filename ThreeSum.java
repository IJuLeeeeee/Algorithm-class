import java.util.Arrays;
import java.util.ArrayList;
//一陣列找3數字和為0
public class ThreeSum extends ThreeSum{
	public ThreeSum(){
		
	}
	public int count(int[] a){
		Arrays.sort(a);
		int x,y,z,start,end,result=0;
		for(int i=0;i<a.length;i++){
			x=a[i];
			start=i+1;
			end=a.length-1;
			while(start<end){
				y=a[start];
				z=a[end];
				if(x+y+z==0){
					result++;
					end=end-1;
				}
				else if(x+y+z>0)	end=end-1;
				else	start=start+1;
			}
		}
		return result;	
	}
}
	



