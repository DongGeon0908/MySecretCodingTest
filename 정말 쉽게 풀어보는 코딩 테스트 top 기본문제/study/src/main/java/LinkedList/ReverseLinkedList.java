package LinkedList;

class ListNode1{
    int val;
    ListNode1 next;
    ListNode1(int x){
        this.val = x;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode1 l1 = new ListNode1(1);
        l1.next = new ListNode1(2);
        l1.next.next = new ListNode1(3);

        printNode(l1);
        ListNode1 head = reverseList(l1);
        printNode(head);
    }
    public static ListNode1 reverseList(ListNode1 current) {
        ListNode1 prev = null;
        ListNode1 next = null;
        while(current !=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }



    public static void printNode(ListNode1 head) {
        System.out.println("printNOde: ");
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        System.out.println();
    }
}
