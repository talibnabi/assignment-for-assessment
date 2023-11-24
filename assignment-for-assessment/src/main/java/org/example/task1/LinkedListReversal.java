package org.example.task1;

public class LinkedListReversal {
    public static ListNode reverseInGroups(ListNode head, int k) {

        /*
        If the input value "head" is null or if "k" is less than or equal to 1,
        "head" itself will be returned
        * */
        if (head == null || k <= 1) {
            return head;
        }

        /*
        The number of nodes in the linkedlist
        * */
        int numberOfNodes = 0;

        ListNode node = new ListNode(0);
        node.next = head;

        ListNode beforeNode = node;
        ListNode presentNode = head;

        /*
        The number of nodes is calculated
        * */
        while (presentNode != null) {
            presentNode = presentNode.next;
            numberOfNodes++;
        }

        presentNode = head;


        /*
        Reverse the nodes k times
        * */
        while (numberOfNodes >= k) {
            ListNode start = beforeNode.next;
            ListNode end = presentNode;

            /*
            Reverse the nodes
            * */
            for (int i = 0; i < k; i++) {
                ListNode nextNode = presentNode.next;
                presentNode.next = start;
                start = presentNode;
                presentNode = nextNode;
            }

            beforeNode.next = start;
            end.next = presentNode;

            beforeNode = end;
            numberOfNodes -= k;
        }

        /*
         The remaining numbers at the end should also be reversed
        * */
        if (numberOfNodes > 1) {
            ListNode start = beforeNode.next;
            ListNode end = presentNode;

            for (int i = 0; i < numberOfNodes; i++) {
                ListNode nextNode = presentNode.next;
                presentNode.next = start;
                start = presentNode;
                presentNode = nextNode;
            }

            beforeNode.next = start;
            end.next = presentNode;

            beforeNode = end;
        }
        return node.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}
