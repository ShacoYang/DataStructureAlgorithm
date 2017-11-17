## Data Structure Algorithms  
The Fact is, there aren't just two sides to any issue,
there's almost always a range of responses, and **"it depends"** is 
almost always the right answer in any big question. ~Linus Torvalds  

#### Array
* Contiguous block in memory
    * Start address of array = 12, element size = 4 bytes (int)
    Address of array[0] = 12  
    Address of array[0] = 12 + 1 * 4 = 16   
    Address of array[0] = 12 + 2 * 4 = 20   
    Address of array[0] = 12 + 3 * 4 = 24
* Every element occupies same amount of space in memory
* if knew index of an element, O(1) retrieve  
 Left-aligned | Center-aligned |  
| :---         |     :---:      |  
| Retrieve with Index   | O(1)     |  
| Retrieve withOUT Index     | O(n)      |  
| Add an element to full array   | O(n)     |  
| Add an element to the end     | O(1)      |  
| Insert or update at spefic index   | O(1)     |  
| Delete by setting it to null    | O(1)      |  
| Delete by shifting elements    | O(n)      |  

