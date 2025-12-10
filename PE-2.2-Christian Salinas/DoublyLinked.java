public class DoublyLinked {

    private DDL_Node head;
    private DDL_Node tail;

    // Inicializar mi lista doble
    public DoublyLinked() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtEnd(int data) {
        DDL_Node newNode = new DDL_Node(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }

        DDL_Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public void reverse() {

        if (isEmpty() || head == tail) {
            return;
        }

        DDL_Node current = head;
        DDL_Node temp = null;

        while (current != null) {
            // intercambiar punteros
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // moverse hacia el "anterior" que ahora es el siguiente
            current = current.prev;
        }

        // intercambiar head y tail
        temp = head;
        head = tail;
        tail = temp;
    }

    public boolean deleteByValue(int data){
    
        if (isEmpty()) {
            return false;
        }
        DDL_Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) {
            return false;
        //valor a eliminar es el head
        if (current == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        } else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        return true;
            

        
}
