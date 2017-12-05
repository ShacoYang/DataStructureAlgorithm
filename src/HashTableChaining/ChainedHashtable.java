package HashTableChaining;

import HashTable.Employee;
import HashTable.StoredEmployee;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashtable;

    public ChainedHashtable() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredEmployee>();
        }

    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        while (iterator.hasNext()) {
            employee = iterator.next();
            if (employee.key.equals(key)) {
                return employee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee employee = null;
        //optimise
        int index = -1;
        while (iterator.hasNext()) {
            employee = iterator.next();
            index++;
            if (employee.key.equals(key)){
                break; // 1 null 2 found
            }
        }
        if (employee == null) {
            return null;
        }else {
            //hashtable[hashedKey].remove(employee); //another iterator --> optimise (remove specific index)
            hashtable[hashedKey].remove(index);
            return employee.employee;
        }

    }
    private int hashKey(String key) {
       // return key.length() % hashtable.length;
        //could calling hashcode method in the String class
        return Math.abs(key.hashCode() % hashtable.length);
    }
    public void printHashTable(){
        for (int i = 0; i < hashtable.length; i++) {
            //empty linkedlist
            if (hashtable[i].isEmpty()){
                System.out.println("Position" + i + ": empty");
            }else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("Null");
            }

        }
    }
}
