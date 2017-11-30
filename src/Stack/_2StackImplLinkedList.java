package Stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class _2StackImplLinkedList {

    private LinkedList<Employee> stack;

    public _2StackImplLinkedList(){
        stack = new LinkedList<>();
    }

    public void push(Employee employee) {
        stack.push(employee);
    }
    public Employee pop() {
        return stack.pop();
    }
    public Employee peek() {
        return stack.peek();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public void printStack() {
        ListIterator<Employee> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {

        _2StackImplLinkedList stackImplLinkedList = new _2StackImplLinkedList();
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee joneDoe = new Employee("Jone","Doe",456);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        stackImplLinkedList.push(janeJones);
        stackImplLinkedList.push(joneDoe);
        stackImplLinkedList.push(marySmith);
        stackImplLinkedList.push(mikeWilson);
        stackImplLinkedList.push(billEnd);

        stackImplLinkedList.printStack();

    }

}
