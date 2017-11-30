package Stack;

import java.util.EmptyStackException;

public class _1StackImplArray {
    private Employee[] stack;
    private int top;

    public _1StackImplArray(int capacity){
        stack = new Employee[capacity];
    }
    public void push(Employee employee) {
        if (top == stack.length) {
            //stack full needs resize
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray,0,stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Employee employee = stack[--top];
        //set the postion to null because we have popped employee
        //stack[top] = null;
        return employee;

    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top -1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }


    public static void main(String[] args) {
        _1StackImplArray stackImplArray = new _1StackImplArray(10);
        stackImplArray.push(new Employee("Jane","Jones",123));
        stackImplArray.push(new Employee("Jone","Doe",456));
        stackImplArray.push(new Employee("Mary","Smith",22));
        stackImplArray.push(new Employee("Mike","Wilson",3245));
        stackImplArray.push(new Employee("Bill", "End", 78));

        stackImplArray.printStack();
        stackImplArray.pop();
//        stackImplArray.push(new Employee("aaa","test",898));
//        System.out.println(stackImplArray.size());
//        System.out.println(stackImplArray.peek());
        stackImplArray.printStack();

    }

}
