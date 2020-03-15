class Main {
  public static void main(String[] args) {

    int[] array = {2, 10, 11, 5, 8, 200, -1};

  // PRINT OUT UNSORTED ARRAY
  System.out.println("This is the array before sorting.");
 
  int i = 0;
  while (i < array.length) {
    System.out.println(array[i] + " ");
    i++;
  }

  // CALL FUNCTION TO SORT THE ARRAY 
  selectionSort(array);
  

  // PRINT OUT THE ARRAY AGAIN HERE TO SHOW THAT IT CHANGED
  System.out.println("This is the array after selection sort.");
  
  i = 0;
  while (i < array.length) {
    System.out.println(array[i] + " ");
    i++;
  }
  
}

// SORT ARRAY FROM HIGHEST VALUE TO LOWEST
static void selectionSort(int[] array)  {
  int highestValue = Integer.MIN_VALUE;
  int highestValueIndex = 0;
  if ((array != null) && (array.length > 0)) {
    for (int valuesSorted = 0; valuesSorted < array.length; ++valuesSorted) {
      for (int i = valuesSorted; i < array.length; ++i) {
        if (highestValue < array[i]) {
          highestValue = array[i];
          highestValueIndex = i;
        }
      }
      //now highestValue contains current highest value from array[] and highestValueIndex where it is at

      array[highestValueIndex] = array[valuesSorted];
      array[valuesSorted] = highestValue;
      highestValue = Integer.MIN_VALUE;
      highestValueIndex = 0;
    }
  }
  else {
    System.out.println("Please pass an array that is not empty.");
  }
}

}; // end class Main 
