package Day16;

/*
 * Question 83 - Remove Duplicates from Sorted List
 * 
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. 
 * Return the linked list sorted as well.
 */

public class Q1 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        ListNode node = head;
        if(head == null){
            return head;
        }
        
        while(current.next != null){
            current = current.next;
            if(node.val != current.val){
                node.next = current;
                node = node.next;
            }
        }
        node.next = null;
        return head;
    }
}
