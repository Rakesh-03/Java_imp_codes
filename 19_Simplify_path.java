import java.io.*;
import java.util.*;

public class Solution 
{
    public static String path(String path)
    {
        String[] names = path.split("/");
        Deque<String> stack = new LinkedList<>();
        
        for (String name : names) {
            if (name.equals(".") || name.isEmpty()) 
            {
                continue;
            } 
            else if(name.equals(".."))
            {
                if (!stack.isEmpty()) 
                {
                    stack.pop();
                }
            } 
            else 
            {
                stack.push(name);
            }
        }
        
        StringBuilder canonicalPath = new StringBuilder();
        
        while (!stack.isEmpty()) 
        {
            canonicalPath.append("/").append(stack.removeLast());
        }
        
        return canonicalPath.length() > 0 ? canonicalPath.toString() : "/";
    }

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        String a = path(s);
        
        System.out.println(a);
    }
}