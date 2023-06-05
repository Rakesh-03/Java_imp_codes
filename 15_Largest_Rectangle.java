import java.io.*;
import java.math.*;
import java.util.*;

public class Solution
{
    public static int largestRectangle(int[] h) 
    {
        Stack<Integer> stack = new Stack<>();
        
        int max = 0;
        stack.push(0);
        for(int i = 1 ; i < h.length ;i++)
        {
          while(!stack.isEmpty() && h[i] < h[stack.peek()])
          {
                max = getmax(h,stack,max,i);
          }
            stack.push(i);
        }
        
        int i = h.length;
        while(!stack.isEmpty())
        {
            max = getmax(h,stack,max,i);
        }
       return max;
    }
    
    public static int getmax(int h[],Stack<Integer> stack,int max,int i)
    {
        int area;
         int popped = stack.pop();
        
        if(stack.isEmpty())
        {
           area = h[popped] * i;
        }
        else
        {
            area = h[popped] * (i - 1 - stack.peek());
        }
        
       return Math.max(max,area); 
    }
    
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       
        int[] h = new int[n];
        for(int i =0 ; i < n;i++)
        {
            h[i] =sc.nextInt();
        }
        
        int result  = largestRectangle(h);
        System.out.println(String.valueOf(result));
        
    }
}
