package ListChallenge.First;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null){
            tail = node;
        }else {
            head.setPrivous(node);
            node.setNext(head);
        }
    }
}
