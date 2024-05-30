public class Main {
    public static void main(String[] args) {
        System.out.println("Printing the list elements");
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.printList();
        System.out.println("Removing the last element");
        System.out.println("remove " + myLinkedList.removeLast().value);
        myLinkedList.printList();
        System.out.println("Prepend the list element to the beginning of the list");
        myLinkedList.prepend(5);
        myLinkedList.printList();
        System.out.println("Remove first element from the list");
        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println("Get the index element from list");
        System.out.println("get element of index " + myLinkedList.get(1).value + "\n");
        myLinkedList.printList();
        System.err.println("Set the index element");
        myLinkedList.set(0, 8);
        myLinkedList.printList();
        System.out.println("Insert the index element");
        myLinkedList.insert(1, 9);
        myLinkedList.printList();
        System.out.println("Remove the index");
        myLinkedList.remove(0);
        myLinkedList.printList();
        System.out.println("Reverse the list");
        myLinkedList.reverse();
        myLinkedList.printList();

    }

}
