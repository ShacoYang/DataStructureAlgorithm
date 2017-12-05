package HashTable;

public class SimpleHashtable {
    private StoredEmployee[] hashtable;

    public SimpleHashtable() {
        hashtable = new StoredEmployee[10];
    }
    private int hashKey(String key) {
        //jones   5 % 10
        return key.length() % hashtable.length;
    }
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        //check if occupied LINEAR PROBING
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            //if this is the last position hashedkey --> end all occupied
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            }else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("array's full " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    // add find key (raw key) improve get()
    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null &&hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        // linear way
        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        //if drop off the loop because hashtable[hashedKey] == null -> else --> get return -> null pointer exception
//        if (stopIndex == hashedKey) {
//            return -1;
//        } else {
//            return hashedKey;
//        }
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].employee.equals(key)){
            return hashedKey;
        }else {
            return -1;
        }

    }
    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }
    // remove
    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        //1. save current hashtable
        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for (int i = 0; i < oldHashtable.length; i++) {
            if (oldHashtable[i] != null) {
                put(oldHashtable[i].key, oldHashtable[i].employee);
            }
        }


        return employee;
    }


    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            }else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }

        }
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee joneDoe = new Employee("Jone","Doe",456);
        Employee marySmith = new Employee("Mary","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put("Jones", janeJones);
        hashtable.put("Doe", joneDoe);
        hashtable.put("Smith", marySmith);
        hashtable.put("Wilson", mikeWilson);

        hashtable.printHashtable();

        System.out.println("get wilson " + hashtable.get("Wilson"));
        System.out.println("get smith " + hashtable.get("smith"));
    }
}
