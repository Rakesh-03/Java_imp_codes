import java.util.*;

class ListNode 
{
    int val;
    ListNode next;

    ListNode(int val)
    {
        this.val = val;
    }
}

public class LinkedListPartition 
{
    public static ListNode partition(ListNode head, int x)
    {
        ListNode beforeHead = new ListNode(0);
        ListNode before = beforeHead;
        ListNode afterHead = new ListNode(0);
        ListNode after = afterHead;

        while (head != null)
        {
            if (head.val < x)
            {
                before.next = head;
                before = before.next;
            }
            else 
            {
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }

        after.next = null;
        before.next = afterHead.next;

        return beforeHead.next;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        ListNode head = null;
        ListNode tail = null;
        for (String val : values)
        {
            int num = Integer.parseInt(val);
            if (num == -1) 
            {
                break;
            }
            ListNode newNode = new ListNode(num);
            if (head == null)
            {
                head = newNode;
                tail = newNode;
            } 
            else 
            {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int x = scanner.nextInt();
        ListNode partitionedHead = partition(head, x);

        while (partitionedHead != null) 
        {
            System.out.print(partitionedHead.val + " ");
            partitionedHead = partitionedHead.next;
        }
    }
}
