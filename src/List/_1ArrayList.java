package List;

import java.util.ArrayList;
import java.util.List;

public class _1ArrayList {
    public static void main(String[] args) {
        List<_1Employee> employeeList = new ArrayList<>();
        employeeList.add(new _1Employee("John","Doe",4567));
        employeeList.add(new _1Employee("Jane", "Jones", 123));
        employeeList.add(new _1Employee("Mary", "Smith", 22));
        employeeList.add(new _1Employee("Mike", "Wilson", 3245));

        employeeList.forEach(( _1Employee employee) -> System.out.println(employee));
        //employeeList.forEach( employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));
        System.out.println(employeeList.isEmpty());

        employeeList.set(0, new _1Employee("John", "Adam",45678));
        System.out.println(employeeList.get(0));
        System.out.println(employeeList.size());
        employeeList.add(3, new _1Employee("ac", "bc",7896));
        //back to array Object array
        _1Employee[] employeeArray = employeeList.toArray(new _1Employee[employeeList.size()]);
        for (_1Employee employee: employeeArray){
            System.out.println(employee);
        }
        System.out.println(employeeList.contains(new _1Employee("Mary","Smith",22)));
        System.out.println(employeeList.indexOf(new _1Employee("John","Doe", 4567)));

        employeeList.remove(2);
    }
}
