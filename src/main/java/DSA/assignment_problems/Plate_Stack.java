package DSA.assignment_problems;
import java.util.*;

class Node {
    String data;
    Node next;

    Node(String data) {
        this.data = data;
        next = null;
    }
}

public class Main {

    static Node head = null;
    static int size = 0;

    static void push(String plate) {
        Node newNode = new Node(plate);
        newNode.next = head;
        head = newNode;
        size++;

        System.out.println("push " + plate + " -> top " + plate + ", size " + size);
    }

    static void pop() {
        if (isEmpty()) {
            System.out.println("pop -> stack is empty");
        } else {
            System.out.println("pop -> " + head.data + ", size " + (size - 1));
            head = head.next;
            size--;
        }
    }

    static void peek() {
        if (isEmpty())
            System.out.println("peek -> stack is empty");
        else
            System.out.println("peek -> " + head.data);
    }

    static boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String operation = sc.next();

            if (operation.equals("push")) {
                String plate = sc.next();
                push(plate);
            } else if (operation.equals("pop")) {
                pop();
            } else if (operation.equals("peek")) {
                peek();
            } else if (operation.equals("isEmpty")) {
                System.out.println("isEmpty -> " + isEmpty());
            }
        }
    }
}
