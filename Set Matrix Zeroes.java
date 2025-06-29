//Code
public void SetZeroes(int[][]matrix) {
int rows = matrix.length;
int cols = matrix[0].length;
boolean firstRow = false, firstCol = false;

//Step 1:> Check first row and column
  
for(int j = 0; j < cols; j++) {
  if(matrix[0][j] == 0) firstRow = true;
}
  for(int i = 0; i < rows; i++) {
    if(matrix[i][0] == 0) firstCol = true;
  }

//Step-2:> Use Matrix to Mark
  for(int i = 1; i < rows; i++) {
    for(int j = 1; j < cols; j++) {
      if(matrix[i][j] == 0){
        matrix[i][0] = 0;
        matrix[0][j] = 0;
      }
    }
  }

  //Step-3:> Set Cells to 0 using Marker
  for(int i = 1; i< rows; i++) {
    for(int j = 1 ; j< cols; j++) {
      if(matrix[i][0] == 0 ||matrix[0][j] == 0) {
        matrix[i][j] = 0;
      }
    }
  }

  //Step-4:> Handle first row and first Column
  if(firstRow) {
    for(int j = 0; j< cols; j++) matrix[0][j] = 0;
  }
  if(firstCol) {
    for(int i = 0; i < row; i++) matrix[i][0] = 0;
  }
}

