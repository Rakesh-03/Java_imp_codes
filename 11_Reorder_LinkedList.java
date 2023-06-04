import java.io.*;
import java.util.*;

public class LinkedList 
{
    public Node head;
    public class Node
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
    
    public void add(int value)
    {
        Node node = new Node(value);
        if(head ==null)
        {
           head = node;
        }
        else
        {
          Node curr = head;
            while(curr.next !=null)
            {
                curr = curr.next;
            }
            curr.next = node;
        }
    }
    
    public void print()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }
    
    public void reorder(Node head)
    {
         if (head == null || head.next == null) 
         {
            return;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) 
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next = null;

        Node prev = null;
        Node curr = secondHalf;
        Node next;
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        secondHalf = prev;
         
        Node merged = new Node(0);
        Node current = merged;
        Node firstHalf = head;
        
        while (firstHalf != null || secondHalf != null) 
        {
            if (firstHalf != null)
            {
                current.next = firstHalf;
                firstHalf = firstHalf.next;
                current = current.next;
            }
            if (secondHalf != null) 
            {
                current.next = secondHalf;
                secondHalf = secondHalf.next;
                current = current.next;
            }
        }
    }

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = sc.nextInt();
        
        while(n!=-1)
        {
            l1.add(n);
            n=sc.nextInt();
        }
        
        l1.reorder(l1.head);
        l1.print();
    }
}