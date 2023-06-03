import java.util.*;
public class patterns
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		pattern1(n);
		System.out.println();
		pattern2(n);
		System.out.println();
		pattern3(n);
		System.out.println();
		pattern4(n);
		System.out.println();
		pattern5(n);
		System.out.println();
		pattern6(n);
		System.out.println();
		pattern7(n);
		System.out.println();
		pattern8(n);
		System.out.println();
		pattern9(n);
		System.out.println();
		pattern10(n);
		System.out.println();
		pattern11(n);
		System.out.println();
		pattern12(n);
		
	}
	
	public static void pattern1(int n)
	{
		for(int i = 1; i <=n;i++)
		{
			for(int j = 1 ; j <= n; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n)
	{
		for(int i = 1; i <=n;i++)
		{
			for(int j = 1 ; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n)
	{
		for(int i = 5; i > 0;i--)
		{
			for(int j = i ; j > 0; j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int n)
	{
		for(int i = 1 ; i <= n ;i++)
		{
			for(int j = 1 ; j <=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void pattern5(int n)
	{
		for(int i = 0 ; i < 2*n ;i++)
		{
			int c = i > n ? 2 * n - i : i ;
			for(int j = 0 ; j < c; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern6(int n)
	{
		for(int i = 0 ; i < n ;i++)
		{
			int spaces = n-i-1;
			for(int j = 0 ; j < spaces; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 0 ; k <= i;k++)
			{
			    System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern7(int n)
	{
		for(int i = 0 ; i < n ;i++)
		{
			int spaces = n-i-1;
			for(int j = 0 ; j < spaces; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 0 ; k <= i;k++)
			{
			    System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern8(int n)
	{
		for(int i = 0 ; i < 2*n ;i++)
		{
			int col = i>n ? 2*n-i : i;
			int spaces = n-col; 
			for(int j = 0 ; j < spaces; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 0 ; k < col ;k++)
			{
			    System.out.print("* ");
			}
			System.out.println();
		}
	}
		
		public static void pattern9(int n)
		{
			for(int i = 0 ; i < 2*n ;i++)
			{
				int col = i>n ? 2*n-i : i;
				
				for(int k = 0 ; k < col ;k++)
				{
				    System.out.print("* ");
				}
				System.out.println();
			}
	    }
		
		public static void pattern10(int n)
		{
			for(int i = 1 ; i <= n ;i++)
			{
				int spaces = n-i;
				for(int k = 1 ; k <= spaces ;k++)
				{
				    System.out.print("  ");
				}
		
				for(int a = i ; a>=1 ;a--)
				{
					System.out.print(a+" ");
				}
				for(int b = 2 ; b<=i ;b++)
				{
					System.out.print(b+" ");
				}
				System.out.println();
			}
	    }
		
		public static void pattern11(int n)
		{
			for(int i = 1 ; i <= 2 * n ;i++)
			{
				int col = i>n ? 2*n-i : i;
				int spaces = n-col; 
				for(int k = 1 ; k <= spaces ;k++)
				{
				    System.out.print("  ");
				}
		
				for(int a = col ; a>=1 ;a--)
				{
					System.out.print(a+" ");
				}
				for(int b = 2 ; b<=col ;b++)
				{
					System.out.print(b+" ");
				}
				System.out.println();
			}
	    }
		
		public static void pattern12(int n)
		{
			int a = n;
			n = 2*n-1;
			for(int i = 0; i < n;i++)
			{
				for(int j = 0 ; j < n; j++)
				{
					int c = Math.min(Math.min(j,i),Math.min(n-i-1, n-j-1));
					System.out.print(a-c+" ");
				}
				System.out.println();
			}
		}
}
