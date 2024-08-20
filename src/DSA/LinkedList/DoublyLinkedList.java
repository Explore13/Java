package DSA.LinkedList;

class DoublyNode {
    public int data;
    public DoublyNode prev;
    public DoublyNode next;

    DoublyNode() {
        this.data = 0;
        this.prev = null;
        this.next = null;
    }

    DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    DoublyNode(int data, DoublyNode prev) {
        this.data = data;
        this.prev = prev;
        this.next = null;
    }

    DoublyNode(int data, DoublyNode prev, DoublyNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
//    DoublyNode(int data, Node next)
//    {
//        this.data = data;
//        this.prev = null;
//        this.next = next;
//    }      // Error
}

public class DoublyLinkedList {

    // create LL from Array
    private static DoublyNode createLL(int[] arr) {
        DoublyNode head = new DoublyNode(arr[0]);
        DoublyNode prevNode = head;
        for (int i = 1; i < arr.length; i++) {
            DoublyNode temp = new DoublyNode(arr[i], prevNode);
            prevNode.next = temp;
            prevNode = temp;
        }
        return head;
    }

    // Traverse the LinkedList
    private static void traverseLL(DoublyNode head) {
        DoublyNode temp = head;
        System.out.print("null");
        while (temp != null) {
            System.out.print(" ⇔ " + temp.data);
            temp = temp.next;
        }
        System.out.println(" ⇔ null");
    }

    // Length of LL
    private static int lengthOfLL(DoublyNode head) {
        int len = 0;
        DoublyNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        return len;
    }

    // Delete from head
    private static DoublyNode deleteHeadNode(DoublyNode head) {
        if (head == null || head.next == null) return null;
        head = head.next;
        head.prev.next = head.prev = null;
        return head;
    }

    // Delete from Last
    private static DoublyNode deleteFromLast(DoublyNode head) {
        if (head == null || head.next == null) return null;

        DoublyNode temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next.prev = null;
        temp.next = null;

        return head;
    }

    // Delete Kth element
    private static DoublyNode deleteFromPosition(DoublyNode head, int k) {
        System.out.println("\nAfter deleting the node at " + k + " position : ");
        if (head == null) return null;
//        int len = lengthOfLL(head);
//        if(k<=0 || k > len)
//        {
//            System.out.println("This node does not exist");
//            return head;
//        }
//        if(k == 1) return deleteHeadNode(head);
//        else if(k == len) return deleteFromLast(head);
//        else {
//            int i = 1;
//            DoublyNode temp = head, prevNode = null;
//            while(i < k)
//            {
//                prevNode = temp;
//                temp = temp.next;
//                i++;
//            }
//            prevNode.next = temp.next;
//            temp.next.prev = prevNode;
//            temp.prev = temp.next = null;
//        }
        int cnt = 0;
        DoublyNode temp = head;
        while (temp != null) {
            cnt++;
            if (cnt == k) break;
            temp = temp.next;
        }
        if (temp != null) {
            DoublyNode prevNode = temp.prev;
            DoublyNode nextNode = temp.next;
            if (prevNode == null && nextNode == null) return null;
            else if (prevNode == null) return deleteHeadNode(head);
            else if (nextNode == null) return deleteFromLast(head);
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            temp.next = temp.prev = null;
        }
        return head;
    }

    // Delete a node
    private static DoublyNode deleteParticularNode(DoublyNode head, int value) {
        System.out.println("\nAfter deleting Node " + value + " : ");
        if (head == null) return null;
        DoublyNode temp = head;
        while (temp != null) {
            if (temp.data == value) break;
            temp = temp.next;
        }
        if (temp != null) {
            DoublyNode prevNode = temp.prev;
            DoublyNode nextNode = temp.next;
            if (prevNode == null && nextNode == null) return null;
            else if (prevNode == null) return deleteHeadNode(head);
            else if (nextNode == null) return deleteFromLast(head);
            else {
                prevNode.next = nextNode;
                nextNode.prev = prevNode;
                temp.prev = temp.next = null;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 50, 60, 70};
        DoublyNode head = createLL(arr);
        traverseLL(head);

        // delete from head
        head = deleteHeadNode(head);
        traverseLL(head);

        // delete from last
        head = deleteFromLast(head);
        traverseLL(head);

        // delete from position
        int k = 2;
        head = deleteFromPosition(head, k);
        traverseLL(head);

        // delete  particular node
        int value = 20;
        head = deleteParticularNode(head, value);
        traverseLL(head);
    }
}
