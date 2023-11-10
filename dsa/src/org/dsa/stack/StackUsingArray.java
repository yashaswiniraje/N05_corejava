package org.dsa.stack;
import java.util.*;

class Stack {
    Scanner sc = new Scanner(System.in);
    int top = -1;
    int n = 10;
    int arr[] = new int[n];

    void push() {
        if (top == n - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data");
            int i = sc.nextInt();
            top = top + 1;
            arr[top] = i;
            System.out.println("Inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("Item deleted");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Items are:");
            for (int item = top; item >= 0; item--) {
                System.out.println(arr[item]);
            }
        }
    }
}

public class StackUsingArray {

    public static void main(String[] args) {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to display");
            System.out.println("Press 0 to exit");
            System.out.println("Enter option:");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 0);
    }
}
