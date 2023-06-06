import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int c = lengthOfLongestSubstring(s);
		System.out.println("The Length of ongest sub string in "+ s + " is " + c);
	}
	
    public static int lengthOfLongestSubstring(String s) 
    {
        char c[] = s.toCharArray();   
        HashSet<Character> set = new HashSet();
        int count = 0;
        int l =0;

        for(int i = 0 ; i < s.length();i++)
        {
            if(!set.contains(c[i]))
            {
                set.add(c[i]);
                count = Math.max(count,i-l+1);
            }
            else
            {
                while(c[i] != c[l])
                {
                    set.remove(c[l]);
                    l++;
                }
                set.remove(c[l]);
                l++;
                set.add(c[i]);
            }
        }
        return count;
    }
}