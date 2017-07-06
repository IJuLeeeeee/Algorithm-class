//算陣列中的孤島 12 23  4  =>2座孤島 (123   4 )
public class IslandCount extends IslandCount{
	private static int A[];
	private static int temp = 1000;
	private static int island=1;
	private static int islandCount = 0;
	private static int temppp = 0;
	private static int B[];
	public IslandCount()
	{
		int A[] = new int[temp+1];
		this.A = A;
	}

	@Override
	public void connect(int a, int b) {
		
		if(a>=b && a>temp-1){
			int A[] = new int[temp+1];
			A = this.A;
			temppp = temp;
			temp = a;
			this.B = new int[temp+1000];
			this.A = this.B;
			for(int i = 0 ;i<temppp+1;i++){
				this.A[i] = A[i];
			}
			
		}
		else if (b>=a && b>temp-1){
			int A[] = new int[temp+1];
			A = this.A;
			temppp = temp;
			temp = b;
			this.B = new int[temp+1000];
			this.A = this.B;
			for(int i = 0 ;i<temppp+1;i++){
				this.A[i] = A[i];
			}
			
		}	

		
		if(A[a] == 0 && A[b]== 0){
			A[a] = island;
			A[b] = island;
			island++;
			islandCount++;
		}
		else if(A[a] == 0 && A[b]!= 0){
			A[a] = A[b];
			
		}
		else if(A[a] != 0 && A[b] == 0){
			A[b] = A[a];
		}
		else if(A[a] != 0 && A[b]!= 0 && A[a]!=A[b]){

			int valueA;
			int valueB;
			valueA = A[a];
			valueB = A[b];
			if(A[a]>A[b]){
				for(int i = 0;i < A.length;i++){
					if(A[i] == valueA){
						A[i] = valueB;
					}
				}
			}
			else if(A[a] < A[b]){
				for(int i = 0;i < A.length;i++){
					if(A[i] == valueB){
						A[i] = valueA;
					}
				}
			}
			islandCount--;
		}
	}

	@Override
	public int count() {
		
		return islandCount;
	}
	

	
}
