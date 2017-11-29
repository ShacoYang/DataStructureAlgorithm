package List;

import java.util.List;
import java.util.Vector;

public class _2Vector {

    public static void main(String[] args) {
        List<_1Employee> employeeVector = new Vector<>();
        employeeVector.add(new _1Employee("John","Doe",4567));
        employeeVector.add(new _1Employee("Jane", "Jones", 123));
        employeeVector.add(new _1Employee("Mary", "Smith", 22));
        employeeVector.add(new _1Employee("Mike", "Wilson", 3245));
    }

}
