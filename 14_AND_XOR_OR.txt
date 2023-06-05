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

class Result 
{


    public static int andXorOr(List<Integer> a) 
    {
        Stack<Integer> stack = new Stack<>();
        int maxResult = Integer.MIN_VALUE;
        
        for (int i = 0; i < a.size(); i++) {
            while (!stack.isEmpty()) {
                int currentResult = a.get(i) ^ stack.peek();
                maxResult = Math.max(maxResult, currentResult);
                
                if (a.get(i) < stack.peek()) {
                    stack.pop();
                } else {
                    break;
                }
            }
            
            stack.push(a.get(i));
        }
        
        return maxResult;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.andXorOr(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
