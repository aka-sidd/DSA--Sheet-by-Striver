# 🔁 Set Matrix Zeroes

### 🚨 Problem Statement:
Given an m x n integer matrix, if an element is 0, set its *entire row and column to 0*.

You must do it *in-place*(Optimal Solution :- O(1) Space)
---
  ##Idea:-> Use the First row and first Column of the idea-Matrix as a marker.

 *** Step by Step Logic 🧠:-> 
1:) Mark if first row and first Column needs to be zeroed later:-
  boolean firstRow = false;
  boolean firstCol = false;

2:) Traverse Full matrix
  where matrix[i][j] == 0, mark
  matrix[i][0] = 0 -> mark the row
  matrix[0][j] = 0 -> mark the column

3:) Traverse Again(Excluding first row/col)

  if(matrix[i][0] == 0 || matrix[0][j] == 0
     -> set matrix[i][j] = 0 ***

### 📥 Input:
- A 2D array matrix[][] of size m x n.

### 📤 Output:
- Modify the same matrix such that if any cell is 0, its entire row and column becomes 0.

---
  
### 🧠 Constraints:
- 1 <= matrix.length, matrix[0].length <= 200
- -2^31 <= matrix[i][j] <= 2^31 - 1

---

### ✅ Sample Input:
```java
int[][] matrix = {
    {1, 1, 1},
    {1, 0, 1},
    {1, 1, 1}
}
### Sample Output
  
 {1, 0, 1},
 {0, 0, 0},
{1, 0, 1}

##Time Complexity: O(m*n)
##Space Complexity: O(1)

## 🔗 Here is the link to the original problem on LeetCode:
LeetCode – Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes/)
