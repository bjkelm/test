package tesst1;

class data {int x; }

public class classs {
	public static void main(String[] args)
	{
		int [] arr = new int[] {3,2,1,5,4,6};
		printfArr(arr);
		sortArr(arr);
		printfArr(arr);
		System.out.println("sum" + sumArr(arr));
	}
	

	static int sumArr(int [] arr) {
		int sum=0;
		
		for(int tmp : arr)
			sum+=tmp;
		return sum;
	}
	
	static void printfArr(int[] arr)
	{
		for(int i : arr)
			System.out.print(i);
		
	}
	
	static void sortArr(int[] arr){
		for(int i=0; i<arr.length-1;i++)
			for(int j=0; j<arr.length-1-i; j++)
				if(arr[j]> arr[j+1])
				{
					int tmp= arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
	}
}