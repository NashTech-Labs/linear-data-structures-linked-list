package com.knoldus.linkedList.example.singly;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;

public class DeleteInLinkedListTest {
    /**
     * Method under test: {@link DeleteInLinkedList#deleteNode(Node)}
     */
    @Test
    public void testDeleteNode() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        assertNull(deleteInLinkedList.deleteNode(new Node(1)));
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNode(Node)}
     */
    @Test
    public void testDeleteNode2() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        Node node = new Node(1);
        deleteInLinkedList.head = node;
        assertSame(node, deleteInLinkedList.deleteNode(new Node(1)));
        assertNull(deleteInLinkedList.head);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNode(Node)}
     */
    @Test
    public void testDeleteNode3() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = new Node(0);
        assertNull(deleteInLinkedList.deleteNode(new Node(1)));
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNode(Node)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDeleteNode4() {
        // TODO: Complete this test.
        //   java.lang.NullPointerException
        //       at com.knoldus.linkedList.example.singly.DeleteInLinkedList.deleteNode(DeleteInLinkedList.java:12)
        //   In order to prevent deleteNode(Node)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   deleteNode(Node).

        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = new Node(1);
        deleteInLinkedList.deleteNode(null);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNode(Node)}
     */
    @Test
    public void testDeleteNode5() {
        Node node = new Node(-1);
        node.next = new Node(1);
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = node;
        assertNull(deleteInLinkedList.deleteNode(new Node(1)));
        assertNull(deleteInLinkedList.head.next);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNodeOnPosition(int)}
     */
    @Test
    public void testDeleteNodeOnPosition() {
        assertNull((new DeleteInLinkedList()).deleteNodeOnPosition(1));
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNodeOnPosition(int)}
     */
    @Test
    public void testDeleteNodeOnPosition2() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = new Node(1);
        assertNull(deleteInLinkedList.deleteNodeOnPosition(1));
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNodeOnPosition(int)}
     */
    @Test
    public void testDeleteNodeOnPosition3() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = new Node(1);
        assertNull(deleteInLinkedList.deleteNodeOnPosition(0));
        assertNull(deleteInLinkedList.head);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNodeOnPosition(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testDeleteNodeOnPosition4() {
        // TODO: Complete this test.
        //   java.lang.NullPointerException
        //       at com.knoldus.linkedList.example.singly.DeleteInLinkedList.deleteNodeOnPosition(DeleteInLinkedList.java:47)
        //   In order to prevent deleteNodeOnPosition(int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   deleteNodeOnPosition(int).

        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = new Node(1);
        deleteInLinkedList.deleteNodeOnPosition(Integer.MIN_VALUE);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNodeOnPosition(int)}
     */
    @Test
    public void testDeleteNodeOnPosition5() {
        Node node = new Node(1);
        node.next = new Node(1);
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = node;
        Node actualDeleteNodeOnPositionResult = deleteInLinkedList.deleteNodeOnPosition(1);
        assertSame(node, actualDeleteNodeOnPositionResult);
        assertNull(actualDeleteNodeOnPositionResult.next);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNodeOnPositionWhileLoop(int)}
     */
    @Test
    public void testDeleteNodeOnPositionWhileLoop() {
        assertNull((new DeleteInLinkedList()).deleteNodeOnPositionWhileLoop(1));
    }

    /**
     * Method under test: {@link DeleteInLinkedList#deleteNodeOnPositionWhileLoop(int)}
     */
    @Test
    public void testDeleteNodeOnPositionWhileLoop2() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = new Node(1);
        assertNull(deleteInLinkedList.deleteNodeOnPositionWhileLoop(0));
        assertNull(deleteInLinkedList.head);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#printList()}
     */
    @Test
    public void testPrintList() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.printList();
        assertNull(deleteInLinkedList.head);
    }

    /**
     * Method under test: {@link DeleteInLinkedList#printList()}
     */
    @Test
    public void testPrintList2() {
        DeleteInLinkedList deleteInLinkedList = new DeleteInLinkedList();
        deleteInLinkedList.head = new Node(1);
        deleteInLinkedList.printList();
        assertEquals(1, deleteInLinkedList.head.data);
    }
}

