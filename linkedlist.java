class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    static Node head = null;

    public static void insBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void insEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void insPos(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0 || head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            for (int i = 0; temp != null && i < pos - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Position out of bounds");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public static void delBeg() {
        if (head == null) return;
        head = head.next;
    }

    public static void delEnd() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insBeg(5);
        printLL();
        insBeg(15);
        printLL();
        insEnd(20);
        insEnd(30);
        printLL();
        insPos(25, 3);
        printLL();
        delBeg();
        printLL();
        delEnd();
        printLL();
    }
}
