package com.java8.features.test;

import java.util.LinkedList;

public class GFG {

    // Main driver method
    public static void main(String args[]) {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);

        LinkedList<String> l1 = new LinkedList<>();

        l1.add("Geeks");
        l1.add("Geeks");
        l1.add(1, "Geeks");

        System.out.println("Initial LinkedList " + l1);

        l1.set(1, "For");

        System.out.println("Updated LinkedList " + l1);


        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "For");

        System.out.println("Initial LinkedList " + ll);

        ll.remove(1);

        System.out.println("After the Index Removal " + ll);

        ll.remove("Geeks");

        System.out.println("After the Object Removal " + ll);

        LinkedList list = new LinkedList();

        // adding  elements
        list.add("Geeks");
        list.add(4);
        list.add("Geeks");
        list.add("8");

        // printing the list
        System.out.println("The initial list is :" + list);

        // peek at the head of the list
        // Prints 1st element, "Geeks"
        System.out.println("Head of the list : " + list.peek());

        LinkedList peeklist = new LinkedList();

        // adding  elements in deck
        peeklist.add(5);
        peeklist.add(4);
        peeklist.add("Jack");
        peeklist.add(8);
        peeklist.add("King");

        // printing the list
        System.out.println("The initial deck is :" + peeklist);

        String d = "upper";

        System.out.println("The element chosen to peek is : " + d);

        if (d == "upper")
            System.out.println("The Upper element is : " + peeklist.peekFirst());
        else
            System.out.println("The Lower element is : " + peeklist.peekLast());
    }
}
