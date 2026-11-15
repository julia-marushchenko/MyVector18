/**
 *  Java program to create, update, read, and delete Vector.
 */

package com.mycollections;

import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Vector<Integer> myVector = new Vector<>();

        // Add.
        myVector.add(2);
        myVector.add(1);
        myVector.add(3);
        myVector.add(4);
        myVector.add(5);
        myVector.add(7);
        myVector.add(6);

        // Print.
        System.out.println("Vector: " + myVector); // Output: Vector: [2, 1, 3, 4, 5, 7, 6]

        // Update element with index 1 with shifting.
        myVector.add(1, 4);

        // Print.
        System.out.println("Vector: " + myVector); // Output: Vector: [2, 4, 1, 3, 4, 5, 7, 6]

        // Update element with index 1 shifting the right part.
        myVector.insertElementAt(8, 1);

        // Print.
        System.out.println("Vector: " + myVector); // Output: Vector: [2, 8, 4, 1, 3, 4, 5, 7, 6]

    }
}
