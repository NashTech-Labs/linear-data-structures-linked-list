package com.knoldus.linkedList.example.singly;

import org.junit.Ignore;
import org.junit.Test;

public class InsertInLinkedListTest {
    /**
     * Method under test: {@link InsertInLinkedList#insertFirst(int)}
     */
    @Test
    public void testInsertFirst() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Make sure that fields modified by insertFirst(int)
        //   have package-private, protected, or public getters.


        (new InsertInLinkedList()).insertFirst(1);
    }

    /**
     * Method under test: {@link InsertInLinkedList#insertLast(int)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testInsertLast() {
        // TODO: Complete this test.
        //   java.lang.NullPointerException
        //       at com.knoldus.linkedList.example.singly.InsertInLinkedList.insertLast(InsertInLinkedList.java:38)
        //   In order to prevent insertLast(int)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   insertLast(int).

        (new InsertInLinkedList()).insertLast(1);
    }

    /**
     * Method under test: {@link InsertInLinkedList#insertLast(int)}
     */
    @Test
    public void testInsertLast2() {
        // TODO: Complete this test.

        InsertInLinkedList insertInLinkedList = new InsertInLinkedList();
        insertInLinkedList.insertFirst(1);
        insertInLinkedList.insertLast(1);
    }

    /**
     * Method under test: {@link InsertInLinkedList#insertLast(int)}
     */
    @Test
    public void testInsertLast3() {
        // TODO: Complete this test.

        InsertInLinkedList insertInLinkedList = new InsertInLinkedList();
        insertInLinkedList.insertFirst(1);
        insertInLinkedList.insertFirst(1);
        insertInLinkedList.insertLast(1);
    }

    /**
     * Method under test: {@link InsertInLinkedList#printList()}
     */
    @Test
    public void testPrintList() {
        // TODO: Complete this test.
        //   Add getters for the following fields or make them package-private:
        //     InsertInLinkedList.head

        (new InsertInLinkedList()).printList();
    }

    /**
     * Method under test: {@link InsertInLinkedList#printList()}
     */
    @Test
    public void testPrintList2() {
        // TODO: Complete this test.
        //   Add getters for the following fields or make them package-private:
        //     InsertInLinkedList.head

        InsertInLinkedList insertInLinkedList = new InsertInLinkedList();
        insertInLinkedList.insertFirst(1);
        insertInLinkedList.printList();
    }
}

