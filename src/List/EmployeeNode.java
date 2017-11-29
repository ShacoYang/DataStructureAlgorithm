package List;

public class EmployeeNode {

    private _1Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public EmployeeNode(_1Employee employee) {
        this.employee = employee;
    }

    public _1Employee getEmployee() {
        return employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public EmployeeNode getPrevious() {
        return previous;
    }
    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public void setEmployee(_1Employee employee) {
        this.employee = employee;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
    public String toString() {
        return employee.toString();
    }
}
