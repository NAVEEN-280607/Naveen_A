class ListNode
{
    int val;
    ListNode next;
    ListNode()
    ListNode(int val)
    {
        this.val = val;
    }
    ListNode(intval,ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}
class solution
{
    public ListNode middNode(ListNode head)
    {
        ListNode slow = head,fast = head;
        while(fast ! = null && fast.next ! = null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
public class main
{
    public static ListNode createLinkedList(int[] arr)
    {
        if ( arr == null || arr,length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i=1;i<arr.length;i++)
        {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
}
public static void printLinkedList(ListNode head)
{
    ListNode current = head;
    while(current ! = null)
    {
        System.print.format("%d ->",current.val);
        current = current.next;
    }
    System.out.println("null");
}
public static void main(String[] args)
{
    Solution Solution = new Solution();
    System.out.println("---Test case 1(odd length)---");
    int[] values1 = {1,2,3,4,5};
    ListNode head1 = createLinkedList(values1);
    System.out.print("original List:");
    printLinkedList(head1);
    ListNode middle1 = Solution.middleNode(head1);
    System.out.print("List from middle Node:");
    print LinkedList(middle1);
    System.out.println("\n---Test case(EvenLength)---");
    int[] value2 = {1,2,3,4,5.6};
    ListNode head2 = createLinkedList(values2);
    System.out.print("original list:");
    printLinkedList(head2);
    ListNode middle2 = Solution.middlNode(head2);
    System.out.print("List from Middle NOde:");
    printLinkedList(middle2); 
}