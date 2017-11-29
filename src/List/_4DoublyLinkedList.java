package List;

public class _4DoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(_1Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        }else {
            head.setPrevious(node);
        }

        head = node;
        size++;
    }
    public void addToTail(_1Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        if (tail == null) {
            head = node;
        }else {
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;

    }

    public int getSize() {
        return size;
    }
    public boolean isEmpty() {
        return head == null;

    }

    public EmployeeNode removeFromFront() {
        if (isEmpty()){
            return null;
        }
        EmployeeNode removeNode = head;
        //could be only node in the list
        if (head.getNext() == null) {
            tail = null;
        }else {
            head.getNext().setPrevious(null); //head.getNext().setPrevious(head.getPrevious)
        }
        head = head.getNext();
        size--;
        //optional
        //removeNode.setNext(null);
        return removeNode;
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()){
            return null;
        }
        EmployeeNode removeNode = tail;
        if (tail.getPrevious() == null) {
            head = null;
        }else {
            tail.getPrevious().setNext(tail.getNext());// tail.getNext() == null
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }


    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD ->");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        _1Employee janeJones = new _1Employee("Jane", "Jones",1232);
        _1Employee johnDoe = new _1Employee("John", "Doe",4567);
        _1Employee marySmith = new _1Employee("mary", "Smith",22);

        _4DoublyLinkedList list = new _4DoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);

        list.printList();
        System.out.println(list.getSize());


        _1Employee billEnd = new _1Employee("bill","End", 895);
        list.addToTail(billEnd);

        list.printList();
        System.out.println(list.getSize());


        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
    }
}
