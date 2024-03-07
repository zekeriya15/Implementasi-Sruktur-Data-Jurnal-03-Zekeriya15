public class SinglyLinkedList {
    Node head;
    Node tail;

    
    public SinglyLinkedList() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void tambahDepan(Buku data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void tambahBelakang(Buku data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void hapusDepan() {
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    public void hapusBelakang() {
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node itterator = head;
            while(itterator.next != tail) {
                itterator = itterator.next;
            }
            itterator = tail;
            itterator.next = null;
        }
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node itterator = head;
            while(itterator != null) {
                System.out.println(itterator.data);
                itterator = itterator.next;
            }
        }  
    }


}
