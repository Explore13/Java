package DSA.LinkedList;

// Node structure
class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }

    Node(int data) {
        this.data = data;
        next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}


public class SinglyLinkedList {

    /*
     create LL
     Memory : O(N)
    */
    private static Node covertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    /*
      traverse LL
      Memory : O(N)
     */
    private static void traverse(Node head) {
        Node mover = head;
        while (mover != null) {
            System.out.print(mover.data + " -> ");
            mover = mover.next;
        }
        System.out.println("null");
    }

    /*
      Length of LL
      Memory : O(N)
     */
    private static int lengthOfLL(Node head) {
        Node mover = head;
        int len = 0;
        while (mover != null) {
            len++;
            mover = mover.next;
        }
        return len;
    }

    /*
     Check if present in LL
     Memory : O(N) (worst case),
     O(1) for best case if the date is in head node
    */
    private static boolean checkIfPresent(Node head, int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data)
                return true;
            temp = temp.next;
        }
        return false;
    }

    /*
    Delete the head node
    O(1)
    */
    private static Node deleteHeadNode(Node head) {
        if (head == null) return head;
        head = head.next;
        return head;
    }

    /*
    Delete the tail node
    O(1) for best case if only one or two nodes are present
    O(N) for worst case
    */
    private static Node deleteTailNode(Node head) {
        if (head == null || head.next == null) return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    /*
   delete kth node
   */

    private static Node deleteKthNode(Node head, int k)
    {
        if(head == null) return null;
        int length = lengthOfLL(head);
        if(k > length || k <= 0) System.out.println("Enter valid position");
        else if(k == 1) return deleteHeadNode(head);
        else if(k == length) return deleteTailNode(head);
        else {
            int i = 1;
            Node prev = null, temp = head;
            while(i < k)
            {
                i++;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
            return head;
        }
        return head;
    }

    /*
    InsertAtHead
    O(1)
    */
    private static Node insertAtHead(Node head, int x)
    {

        /*
        No need to make the code complex by putting unnecessary checking
        if(head == null) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        return head;
        */
        return new Node(x,head);
    }

    /*
    InsertAtLast
    O(N) ---> Worst Case
    O(1) ---> Best Case
    */
    private static Node insertAtLast(Node head, int x)
    {
        Node temp = new Node(x);
        if(head == null) return temp;
        Node moving = head;
        while(moving.next!=null)
        {
            moving = moving.next;
        }
        moving.next = temp;
        return head;
    }

    /*
    Inserting at Kth Position
    O(N) ---> Worst Case
    O(1) ---> Best Case
    */
    private static Node insertingAtPosition(Node head, int x, int k)
    {
        if(head == null)
        {
            if(k ==1) return new Node(x);
            else return null;
        }
        if(k ==1) return new Node(x, head);
        int cnt = 0;
        Node moving = head;
        while(moving!=null)
        {
            cnt++;
            if(cnt == k-1)
            {
                Node temp = new Node(x, moving.next);
                moving.next = temp;
                break;
            }
            moving = moving.next;
        }
        return head;
    }
    /*
    Inserting before the element
    O(N) ---> Worst Case
    O(1) ---> Best Case
    */
    private static Node insertBeforeElement(Node head, int x, int el)
    {
        if(head == null) return null;
        if(head.data == el) return new Node(x, head);
        Node moving = head, prev = null;
        boolean found = false;
        while(moving!=null)
        {
            if(moving.data == el)
            {
                Node temp = new Node(x,moving);
                prev.next = temp;
                found = true;
                break;
            }
            prev = moving;
            moving = moving.next;
        }
        if(found == false) System.out.println(el+" not found");
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};

        // create LL
        Node head = covertArr2LL(arr);
        System.out.println("Head : " + head.data);

        // traverse
        traverse(head);

        // length
        int lengthLL = lengthOfLL(head);
        System.out.println("Length of the LL : " + lengthLL);

        // Search element
        int find = 20;
        if (checkIfPresent(head, find)) {
            System.out.println(find + " is present in the LL");
        } else {
            System.out.println(find + " is not present in the LL");
        }

        // delete head node
        head = deleteHeadNode(head);
        traverse(head);

        // delete tail node
        head = deleteTailNode(head);
        traverse(head);

        // delete specific node
        int k = 2;
        head = deleteKthNode(head,k);
        traverse(head);

        // insert at head
        int x = 100;
        head = insertAtHead(head,x);
        traverse(head);

        // insert at last
        x = 200;
        head = insertAtLast(head,x);
        traverse(head);

        // insert at kth position
        x = 20;
        k = 4;
        head = insertingAtPosition(head,x,k);
        traverse(head);

        // insert before the value
        x = 500;
        int el = 20;
        head = insertBeforeElement(head, x, el);
        traverse(head);
    }
}
