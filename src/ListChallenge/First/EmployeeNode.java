package ListChallenge.First;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode privous;

    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public void setPrivous(EmployeeNode privous) {
        this.privous = privous;
    }

    public Employee getEmployee() {
        return employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public EmployeeNode getPrivous() {
        return privous;
    }
}
