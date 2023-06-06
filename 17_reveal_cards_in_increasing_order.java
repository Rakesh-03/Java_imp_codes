import java.io.*;
import java.util.*;

public class Solution 
{
    public static int[] reorder(int[] arr)
    {
        Arrays.sort(arr);
        Deque<Integer> result = new LinkedList<>();

        for (int i = arr.length - 1; i >= 0; i--) 
        {
            if (!result.isEmpty()) 
            {
                result.addFirst(result.removeLast());
            }
            result.addFirst(arr[i]);
        }
        
        for (int i =0 ; i < arr.length ;i++)
        {
            arr[i] = result.pop();
        }

       return arr;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i <n;i++)
        {
            arr[i] = sc.nextInt();
        }
        reorder(arr);
        for(int i =0 ; i < n;i++)
        System.out.print(arr[i] + " ");
    }
}