public class Main {
    public static void main(String[] args) {

        DoublyLinked list = new DoublyLinked();

        System.out.println("¿La lista está vacía? " + list.isEmpty());

        list.insertAtEnd(10);
        System.out.println("Contenido de la lista:");

        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtEnd(70);
        list.insertAtEnd(80);
        list.insertAtEnd(90);
        list.insertAtEnd(100);

        list.display();

        System.out.println("Lista original");
        list.display();

        System.out.println("Lista invertida");
        list.reverse();
        list.display();

        // Caso borde: lista con un solo elemento
        DoublyLinked singleList = new DoublyLinked();

        System.out.println("Un solo elemento (Caso Borde)");
        singleList.insertAtEnd(60);
        singleList.display();

        System.out.println("Reversa");
        singleList.reverse();
        singleList.display();

        System.out.println("Parte 3 ");
        System.out.println("parte 3.1");
        System.out.println("lista original");
        list.display();
        System.out.println("nodo eliminado");
        list.deleteByValue(40);
        list.display();
    }
}
