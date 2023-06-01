import java.util.*;

public class cyclic_sort 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers for cyclic sort: ");
		for(int i = 0 ; i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int arr[])
	{
		int i =0;
		while(i<arr.length)  
		{
			int correct= arr[i]-1;
			if(arr[i] != arr[correct])
			{
				int temp = arr[i];
				arr[i] = arr[correct];
				arr[correct] = temp;
			}
			else
			{
				i++;
			}
		}
	}

}
