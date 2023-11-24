package org.example.task1;


import static org.example.task1.LinkedListReversal.printList;
import static org.example.task1.LinkedListReversal.reverseInGroups;

/*
 * Task-1: Reverse a Linked List in Groups of K
 * */
public class Task1Answer {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        System.out.println("Original List:");

        printList(head);

        int k = 3;
        head = reverseInGroups(head, k);
        System.out.println("Reversed List in Groups of " + k + ":");
        printList(head);
    }
}
