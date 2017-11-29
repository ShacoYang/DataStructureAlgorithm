package List;

import java.util.Iterator;
import java.util.LinkedList;

public class _5JDKLinkedList {
    public static void main(String[] args) {
        _1Employee janeJones = new _1Employee("Jane", "Jones",1232);
        _1Employee johnDoe = new _1Employee("John", "Doe",4567);
        _1Employee marySmith = new _1Employee("mary", "Smith",22);

        LinkedList<_1Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);

        /*
        for (_1Employee employee: list) {
            System.out.println(employee);
        }
         */
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
}
