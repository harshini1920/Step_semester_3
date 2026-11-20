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

    static Node build(String[] ids) {
        Node head = null, tail = null;

        for (String id : ids) {
            Node newNode = new Node(id);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    static String find(Node head, String id) {
        Node temp = head;
        int position = 1;
        int first = -1;
        int count = 0;

        while (temp != null) {
            if (temp.data.equals(id)) {
                if (first == -1)
                    first = position;

                count++;
            }

            temp = temp.next;
            position++;
        }

        if (count == 0)
            return id + " not found";

        return id + " first at position " + first + ", copies: " + count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] ids = new String[n];

        for (int i = 0; i < n; i++) {
            ids[i] = sc.next();
        }

        String id = sc.next();

        Node head = build(ids);

        System.out.println(find(head, id));
    }
}
