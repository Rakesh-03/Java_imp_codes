import java.util.*;
class Main
 {
    public static int minAddToMakeValid(String s) 
    {
       Stack<Character> stack = new Stack<>();

       for(int i = 0 ; i < s.length();i++)
       {
           char c = s.charAt(i);

           if(c == '(')
           {
               stack.push(c);
           }
           else
           {
               if(!stack.isEmpty() && stack.peek() == '(')
               {
                  stack.pop();
               }
               else
               {
                   stack.push(c);
               }
           }
       }

       return stack.size();
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        
        int c = minAddToMakeValid(s);
        
        System.out.println(c);
    }
}
