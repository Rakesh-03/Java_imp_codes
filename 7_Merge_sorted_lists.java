import java.util.Scanner;

public class LinkedList 
{
    Node head;

    public class Node
    {
        int value;
        Node next;

        public Node(int value) 
        {
            this.value = value;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    public void add(int num)
    {
        Node node = new Node(num);
        if (head == null)
        {
            head = node;
            return;
        } 
 
        Node temp = head;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void print()
    {
        Node temp = head;
        while (temp != null) 
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public static Node merge(Node a, Node b) 
    {
        if (a == null) 
        {
            return b;
        }
        if (b == null)
        {
            return a;
        }

        Node result;
        if (a.value <= b.value)
        {
            result = a;
            result.next = merge(a.next, b);
        } 
        else
        {
            result = b;
            result.next = merge(a, b.next);
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) 
        {
            LinkedList l1 = new LinkedList();
            LinkedList l2 = new LinkedList();

            int n = sc.nextInt();
            for (int j = 0; j < n; j++)
            {
                l1.add(sc.nextInt());
            }

            int m = sc.nextInt();
            for (int j = 0; j < m; j++) 
            {
                l2.add(sc.nextInt());
            }

            Node mergedHead = merge(l1.head, l2.head);
            LinkedList mergedList = new LinkedList();
            mergedList.head = mergedHead;

            mergedList.print();
            System.out.println();
        }
    }
}
