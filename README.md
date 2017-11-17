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
#### [Selection Sort]
* In-place
* O(n^2)
* stable
* Doesn't require as much swapping as bubble sort
#### [Insertion Sort]
* In-place
* O(n^2)
* stable


