package List;

public class _3LinkedList {

   private EmployeeNode head;
   private int size;

   public void addToFront(_1Employee employee) {
       EmployeeNode node = new EmployeeNode(employee);
       node.setNext(head);
       head = node;
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
       head = head.getNext();
       size--;
       //optional
       //removeNode.setNext(null);
       return removeNode;
   }
   public void printList() {
       EmployeeNode current = head;
       System.out.print("HEAD ->");
       while (current != null) {
           System.out.print(current);
           System.out.print(" -> ");
           current = current.getNext();
       }
       System.out.println("null");
   }

    public static void main(String[] args) {
        _1Employee janeJones = new _1Employee("Jane", "Jones",1232);
        _1Employee johnDoe = new _1Employee("John", "Doe",4567);
        _1Employee marySmith = new _1Employee("mary", "Smith",22);

        _3LinkedList linkedList = new _3LinkedList();
        linkedList.addToFront(janeJones);
        linkedList.addToFront(johnDoe);
        linkedList.addToFront(marySmith);

        linkedList.printList();
        System.out.println(linkedList.isEmpty());
    }
}
