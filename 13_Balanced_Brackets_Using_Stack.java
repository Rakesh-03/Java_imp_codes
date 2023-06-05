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

    public static String isBalanced(String s)
    {
        String yes = "YES";
        String no = "NO";
       if(s.length() %2 !=0 || s.length() == 0)
       {
          return no;
       }
        
       Deque<Character> stack = new ArrayDeque<Character>();
        
        for(int i = 0 ; i < s.length();i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c=='{' || c=='[')
            {
                stack.push(c);
            }
        
            if(stack.isEmpty())
            {
                return no;
            }
            char find;

            switch(c)
            {
                case ')':
               find = stack.pop();
                if(find != '(')
                {
                    return no;
                }
                break;
            case '}':
               find = stack.pop();
                if(find != '{')
                {
                    return no;
                   
                }
                break;
            case ']':
               find = stack.pop();
                if(find != '[')
                {
                    return no;
                }
                break;
            }
      }
    return yes;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
