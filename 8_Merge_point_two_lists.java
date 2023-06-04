import java.util.*;

class ListNode 
{
    int val;
    ListNode next;

    ListNode(int val) 
    {
        this.val = val;
        this.next = null;
    }
}

public class MergePointLinkedList
{
    public ListNode createLinkedList(int[] values) 
    {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) 
        {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    public ListNode getMergeNodeAtIndex(ListNode head, int index) 
    {
        ListNode current = head;
        for (int i = 0; i < index; i++) 
        {
            current = current.next;
        }
        return current;
    }

    public int findMergePoint(ListNode headA, ListNode headB) 
    {
        ListNode curA = headA;
        ListNode curB = headB;

        while (curA != curB) 
        {
            curA = (curA == null) ? headB : curA.next;
            curB = (curB == null) ? headA : curB.next;
        }

        return (curA != null) ? curA.val : -1;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); 

        for (int i = 0; i < t; i++) 
        {
            int mergePointIndex = scanner.nextInt();
            int lengthA = scanner.nextInt(); 
            int[] valuesA = new int[lengthA];
            for (int j = 0; j < lengthA; j++)
            {
                valuesA[j] = scanner.nextInt();
            }
            ListNode headA = new MergePointLinkedList().createLinkedList(valuesA);

            int lengthB = scanner.nextInt(); 
            int[] valuesB = new int[lengthB];
            for (int j = 0; j < lengthB; j++) 
            {
                valuesB[j] = scanner.nextInt();
            }
            ListNode headB = new MergePointLinkedList().createLinkedList(valuesB);

            
            ListNode mergeNode = new MergePointLinkedList().getMergeNodeAtIndex(headA, mergePointIndex);


            ListNode current = headB;
            while (current.next != null)
            {
                current = current.next;
            }
            current.next = mergeNode;

            
            int mergePointValue = new MergePointLinkedList().findMergePoint(headA, headB);

            System.out.println(mergePointValue);
        }

        scanner.close();
    }
}
