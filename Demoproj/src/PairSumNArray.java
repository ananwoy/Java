//java program t define a method to display the sum of pair of elements is n
public class PairSumNArray {
	static void displayPair(int ar[],int sum)
	{
	for (int i = 0; i < ar.length; i++) {
		for (int j = i+1; j < ar.length; j++) {
			if(ar[i]+ar[j]==sum)
			{
				System.out.println("array pair : "+ar[i]+" "+ar[j]);
			}
		}		
	}	
	}
	public static void main(String[] args) {
		int ar[]= {8,9,1,5,2,6,10,3,4};
		displayPair(ar, 10);
		}	
	
}
