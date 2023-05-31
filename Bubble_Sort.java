import java.util.*;
public class bubble_sort 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the numbers for Bubble sort: ");
		for(int i = 0 ; i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] sort(int arr[])
	{
		for(int i = 0 ; i<arr.length;i++)
		{
			for(int j = 1 ; j < arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
}
