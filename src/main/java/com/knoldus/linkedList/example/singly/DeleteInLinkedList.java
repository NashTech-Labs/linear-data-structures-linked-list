package com.knoldus.linkedList.example.singly;

public class DeleteInLinkedList {
    public Node head;


    public Node deleteNode(Node node) {
        if (head == null) {
            return null;
        }
        Node tmp = null;
        if (head.data == node.data) {
            tmp = head;
            head = null;
            return tmp;
        }
        while (head.next != null) {
            if (head.next.data == node.data) {
                // tmp = head.next;
                head.next = head.next.next;
                break;
            }
            tmp = head.next;
        }
        return tmp;
    }

    /**
     * Reference :
     * <a href="http://geeksquiz.com/delete-a-linked-list-node-at-a-given-position/">...</a>
     *
     * @param position
     * @return
     */
    public Node deleteNodeOnPosition(int position) {
        if (head == null) {
            return null;
        }
        Node tmp = head;
        if (position == 0) {
            tmp = head.next;
            head = tmp;
            return tmp;
        }

        for (int i = 0; i < position - 1; i++) {
            tmp = tmp.next;
        }

        // If position is more than number of nodes
        if (tmp == null || tmp.next == null)
            return null;

        Node next = tmp.next.next;
        tmp.next = next;
        return tmp;
    }

    public Node deleteNodeOnPositionWhileLoop(int position) {
        if (head == null) {
            return null;
        }
        Node tmp = head;
        if (position == 0) {
            tmp = head.next;
            head = tmp;
            return tmp;
        }
        int count = 0;
        Node previous = null;
        while (tmp != null && count != position) {
            previous = tmp;
            tmp = tmp.next;
            count++;
        }
        assert tmp != null;
        previous.next = tmp.next;
        return tmp;
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
