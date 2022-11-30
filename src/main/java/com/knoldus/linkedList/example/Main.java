package com.knoldus.linkedList.example;

import com.knoldus.linkedList.example.singly.DeleteInLinkedList;
import com.knoldus.linkedList.example.singly.Node;

public class Main {
    public static void main(String[] args) {
        DeleteInLinkedList list = new DeleteInLinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        list.head = node1;
        node1.next = node2;
        node2.next = node5;
        node5.next = node6;
        node6.next = node7;

        list.printList();

        list.deleteNode(node2);
        System.out.println("\nDeleting Node..");
        list.printList();
        System.out.println("\nDeleting Node for position..");
        list.deleteNodeOnPosition(0);
        list.printList();
        System.out.println("\nDeleting Node for position using while loop..");
        list.deleteNodeOnPositionWhileLoop(2);
        list.printList();

    }

}