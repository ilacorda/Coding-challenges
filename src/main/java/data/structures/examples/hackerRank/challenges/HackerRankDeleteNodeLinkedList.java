package data.structures.examples.hackerRank.challenges;

/**
 * @author ilariacorda on 09/07/2017.
 * @project Java-Code-Experiments
 * Solution to deleting a LinkedList Node as per the challenge from HackerRank
 */
public class HackerRankDeleteNodeLinkedList {

    Node Delete(Node head, int position) {
        if (position == 0) {
            return head.next;
        }

        Node currentNode = head;
        Node previousNode = head;
        for (int i = 0; i < position; i++) {
            previousNode = currentNode;
            if (currentNode.next == null) {
                return head;
            }
            currentNode = currentNode.next;
        }

        previousNode.next = currentNode.next;
        return head;
    }

    class Node {
        int data;
        Node next;
    }
}
