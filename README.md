## Data Structure Algorithms  
The Fact is, there aren't just two sides to any issue,
there's almost always a range of responses, and **"it depends"** is 
almost always the right answer in any big question. ~Linus Torvalds  

#### [Array](https://github.com/ShacoYang/DataStructureAlgorithm/blob/master/src/Array/Array.java)
* Contiguous block in memory
    * Start address of array = 12, element size = 4 bytes (int)
    Address of array[0] = 12  
    Address of array[0] = 12 + 1 * 4 = 16   
    Address of array[0] = 12 + 2 * 4 = 20   
    Address of array[0] = 12 + 3 * 4 = 24
* Every element occupies same amount of space in memory
* if knew index of an element, O(1) retrieve

| Operation                          | Time Complexity |
| :--------------------------------- | :---------------|
| Retrieve with Index                | O(1)            |
| Retrieve withOUT Index             | O(n)            |
| Add an element to full array       | O(n)            |
| Add an element to the end          | O(1)            |
| Insert or update at specific index | O(1)            |
| Delete by setting it to null       | O(1)            |
| Delete by shifting elements        | O(n)            |  

#### Sort
* Stable: 
* Unstable:
##### [Bubble Sort](https://github.com/ShacoYang/DataStructureAlgorithm/blob/master/src/Sort/_1BubbleSort.java)
* In-place algorithm
* O(n^2)
* stable
##### [Selection Sort]
* In-place
* O(n^2)
* stable
* Doesn't require as much swapping as bubble sort
##### [Insertion Sort]
* In-place
* O(n^2)
* stable
##### [Shell Sort]
* starts out using a larger gap value
* reduce the amount of shifting required
* last gap value is always 1
* In-place
* Worst: O(n^2) but it can perform much better than that
* Doesn't require as much shifting as insertion sort, so it usually performs better
* Unstable
##### [Recursion]
##### [Merge Sort]
* Divide and conquer algorithm
* Recursive algorithm
* Splitting and Merging
* O(n Logn)
* Stable
##### [Quick Sort]
* Pivot (first element)
* in-place
* right to left, looking for the first element < than pivot
* right -> left, left -> right
##### [Counting Sort]
* Assumptions about the data (discrete and within a specific range)
* Doesn't use comparisons
* Counts the # of occurrences of each value
* **Only works with Non-negative discrete values(NOT Floats, Strings)**
* NOT in-place
* if we want stable, needs to do extra steps
##### [Stable Counting Sort]

##### Radix Sort
* Data must have **Same radix and width** (integers or strings)
* Radix --> number of unique digits or values
* Width --> number of digits or letters (1234 4width, hello 5width)
* Sort based on each individual digit or letter position
* Start at the rightmost position
* Must use stable sort algorithm at each stage  
4725 4586 1330 8792 1594 5729  
First: based on the 1's position from right  
1330 8792 1594 4725 4595 5729
Second: based on the 10's position - **Must be a stable sort**  
4725 5729 1330 4586 8792 1594  (4725 5729)  
Third: 100's position
1330 4586 1594 4725 5729 8792  

#### List
##### ADT (more about behavior what operation you can do)
* Doesn't dictate how the data is organized
* Dictates the operations you can perform
* Concrete data structure is usually a concrete class
* Abstract data type is usually an interface
##### ArrayList (Backed by Array)
* Resizable array impl of the List interface
* Capacity and Size (don't pass a capacity init default is 10)
* Inserting(Not end) Deletions removals access an item(no index) in the list **Not so good**  
.forEach()
.get()
.isEmpty()
.set()
.size()
.add()
.toArray()
.contains()
.indexOf()
.remove()
##### Vector
* Thread safe (synchronized) arrayList
##### LinkedList
###### Single Linked List
* Node, Next
* A singly linkedlist is best used when insert and remove items from the front
* No need to resize
###### Doubly Linked list
* Each field has two reference next and previous
* head and tail
###### JDK Linked List 
* Doubly-linked list impl of the **List** and **Deque** interface
* Not Synchronized
#### Stack
* ADT
* LIFO --> means no random access
* push() pop() peek() 
* Ideal backing data structure: linked list
#### Queue
* ADT
* FIFO
* add() remove() peek()
```java
//length = 2 add() add() remove() add() --> no need to resize
public void add(Employee employee) {
        //resize or not
        if (queue.length == back) {  
        }
    }
```
```java
//circularQueue
  System.arraycopy(queue, front, newQueue, 0, queue.length - front);
  System.arraycopy(queue, 0, newQueue, queue.length - front, back);
```
#### HashTable
* ADT
* Provide access to data using key
* Consists of Key/Value pairs 
* Optimized for retrieval(knows key)
* Associative array is one type of hash table
 #####Hasing
 * Maps keys of any data type to an integer
 * Hash function maps keys to int
 * In Java, hash function is Object.hashCode()
 * Collision occurs when > 1 value has the same hashed value 
* **Handle Collision** (Load Factor)
    * Open Addressing (another empty array)
    * Linear probing (hashed value + 1 and check the resulting index)
    * Chaining (store Linked list)
* **Remove() null problem**
    * one a remove rehash all of the items that are already in the hash table
        * Performance Hit (have to iterate over all of the remaining elements and rehash them)
        * **hit when remove()**
    * add field to (Employee weather has been deleted or not)
        * Polluted hash table (a mix of live and deleted values)
        * Even though deleting items the load factor isn't going to change
        * **hit when add()**