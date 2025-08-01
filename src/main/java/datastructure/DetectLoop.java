package datastructure;

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class DetectLoopDemo {
    Node head;

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void detectLoop()
    {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
    }

    public static void main(String args[])
    {
        DetectLoopDemo linklist = new DetectLoopDemo();

        linklist.push(1);
        linklist.push(4);
        linklist.push(5);
        linklist.push(9);

        // Introducing Loop
        linklist.head.next.next = linklist.head;
        linklist.detectLoop();
    }
}
