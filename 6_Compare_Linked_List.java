import java.io.*;
import java.util.*;

public class LinkedList 
{
 
    Node head; 
    class Node 
    {
        int value;
        Node next;
        
        public Node(int value)
        {
            this.value = value;
        }
        public Node(int value,Node next)
        {
            this.value = value;
            this.next = next;
        }
     }
    
    void add(int num)
    {
    
        Node node = new Node(num);
        node.next = head;
        head = node;
    }

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        LinkedList l1 = new LinkedList();  
        LinkedList l2 = new LinkedList();  
        
        for(int i = 0 ; i < t;i++)
        {
            int n = sc.nextInt();
            for(int a = 0 ; a < n;a++)
            {
                l1.add(sc.nextInt());
            }
            int m = sc.nextInt();
            for(int b = 0 ; b < m;b++)
            {
                l2.add(sc.nextInt());
            }
            
            int ans = compare(l1.head,l2.head);
            System.out.println(ans);
            
             l1.head = null;
             l2.head = null;
        }
    }
    
    public static int compare(Node a,Node b)
    {
        
        while (a != null && b != null) 
        {
            if (a.value != b.value)
            {
                return 0;
            }
            a = a.next;
            b = b.next;
        }
        
        if(a == null && b == null)
        {
           return 1;
        }
        return 0;
    }
}