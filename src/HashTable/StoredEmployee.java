package HashTable;

//get() method in simpleHashtable
//No idea what keys the employees were added with
//so store the key and value

public class StoredEmployee {
    //raw key
    public String key;
    public Employee employee;

    public StoredEmployee(String key, Employee employee) {
        this.key = key;
        this.employee = employee;
    }
}
