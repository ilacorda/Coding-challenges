package data.structures.examples.leetcode.challenges;

/**
 * @author ilariacorda on 14/07/2017.
 * @project Java-Code-Experiments
 * Revert a Linkedlist
 * Steps:
 */

public class SinglyLinkedListReverse {


    public static void main (String args[]){


        ListNode node = new ListNode();
        node.addNode(1);
        node.addNode(2);
        node.addNode(3);

        for (int i = 0; i < node.size(node); i++) {
            System.out.println("This prints the first element of the reverse linked list " + reverseLinkedList(node).toString());
        }


    }


    public static ListNode reverseLinkedList(ListNode head){
        //This is the previous node- the one before the current, that is the head

        ListNode node = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = node;
            node = head;
            head = next;
        }
        return node;
    }


    public static class ListNode {
        ListNode(int x) {
            val = x;
        }

        ListNode() {

        }

        public ListNode getHead() {
            return this.head;
        }

        ListNode head;
        int val;

        public ListNode getNext() {
            return this.next;
        }

        ListNode next;

        public ListNode addNode(int x) {
            this.next = new ListNode(x);
            return next;
        }


        public static int size(ListNode head){
            int count = 0;
            while (head!= null){
                count++;
                head=head.getNext();
            }
            return count;
        }

        @Override
        public String toString(){
            return "" + val;
        }
    }
  }
