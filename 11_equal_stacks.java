import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3)
    {
        int sum1 = sum(h1);
        int sum2 = sum(h2);
        int sum3 = sum(h3);

        while (!(sum1 == sum2 && sum2 == sum3)) 
        {
            if (sum1 == 0 || sum2 == 0 || sum3 == 0) 
            {
                return 0; 
            }

            if (sum1 >= sum2 && sum1 >= sum3)
            {
                sum1 -= h1.remove(0);
            } 
            else if (sum2 >= sum1 && sum2 >= sum3)
            {
                sum2 -= h2.remove(0);
            } 
            else if (sum3 >= sum1 && sum3 >= sum2)
            {
                sum3 -= h3.remove(0);
            }
        }

        return sum1;
    }
    
    private static int sum(List<Integer> stack)
    {
        int sum = 0;
        for (int height : stack) 
        {
            sum += height;
        }
        return sum;
    }


}

public class Solution 
{

 public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        ArrayList<Integer> h1 = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            h1.add(scanner.nextInt());
        }

        ArrayList<Integer> h2 = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            h2.add(scanner.nextInt());
        }

        ArrayList<Integer> h3 = new ArrayList<>();
        for (int i = 0; i < n3; i++) {
            h3.add(scanner.nextInt());
        }

        int result = Result.equalStacks(h1, h2, h3);
        System.out.println(result);

        scanner.close();
    }
}
