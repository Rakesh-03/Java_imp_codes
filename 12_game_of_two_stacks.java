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

import java.util.List;

class Result 
{
    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) 
    {
        int n = a.size();
        int m = b.size();

        int i = 0; 
        int j = 0; 
        int count = 0; 

        int sum = 0; 

        
        while (i < n && sum + a.get(i) <= maxSum)
        {
            sum += a.get(i);
            i++;
            count++;
        }

        int maxCount = count;

        
        while (j < m && i >= 0) 
        {
            sum += b.get(j);
            j++;
            count++;

            while (sum > maxSum && i > 0) {
                i--;
                sum -= a.get(i);
                count--;
            }

          
            if (sum <= maxSum && count > maxCount) 
            {
                maxCount = count;
            }
        }

        return maxCount;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);

        int g = scanner.nextInt();

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int maxSum = scanner.nextInt();

            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(scanner.nextInt());
            }

            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                b.add(scanner.nextInt());
            }

            int result = Result.twoStacks(maxSum, a, b);
            writer.println(result);
        }

        writer.flush();
        writer.close();
        scanner.close();
    }
}