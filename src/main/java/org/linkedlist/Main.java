package org.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        LinkedList myLinkedList = new LinkedList(1);

        //printList
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("----------");

        //Append
        myLinkedList.append(6);
        myLinkedList.printList();

        System.out.println("----------");

        //RemoveLast
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());

        System.out.println("----------");

        //Prepend
        myLinkedList.prepend(310);
        myLinkedList.prepend(9);
        myLinkedList.prepend(45);
        myLinkedList.printList();

        System.out.println("----------");

        //RemoveFirst
        myLinkedList.removeFirst();
        myLinkedList.removeFirst();
        myLinkedList.printList();

        //Get
        System.out.println(myLinkedList.get(2).value);

        System.out.println("----------");

        //Set
        myLinkedList.set(2,6);
        myLinkedList.printList();

        System.out.println("----------");

        //Insert
        myLinkedList.insert(3,0);
        myLinkedList.printList();

        System.out.println("----------");

        //Remove
        myLinkedList.remove(2);
        myLinkedList.printList();

        System.out.println("----------");

        //Reverse
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}