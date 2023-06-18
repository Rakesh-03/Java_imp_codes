import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s = sc.next();
        ArrayList<String> l = sol("",s);
        System.out.println("The possible substrings of " + s + " are : ");
        System.out.println(l);
    }
    
    public static ArrayList<String> sol(String ans,String s)
    {
        if(s.isEmpty())
        {
            ArrayList<String> l = new ArrayList<>();
            l.add(ans);
            return l;
        }
        
        char c = s.charAt(0);
        
        ArrayList<String> left_list = sol(ans,s.substring(1));
        
        ArrayList<String> right_list = sol(ans+c,s.substring(1));
        
        left_list.addAll(right_list);
        
        return left_list;
    }
}