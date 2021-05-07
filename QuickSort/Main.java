class Main {

  public static int partition(int[] a, int low, int high)
  {

    int i = low;
    int j = high;
    int pivot = a[low];
    while(i<j)
    {
      //find the element which is greater than pivot
      while(a[i] < pivot && i<high){
          i++;
      }

      //find the element which is less than pivot
      while(a[j] > pivot){
        j--;
      }

      if(i<=j)
      {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; 
      }

    }
    
    if(i>j)
    {
      a[low] = a[j];
      a[j] = pivot;
    }
    
    return j;
  }

  void quickSort(int[] a, int low, int high)
  {
      
      int j = partition(a, low, high);

      if (low<j){
        quickSort(a, low, j-1);
      }

      if (high>j){
        quickSort(a, j+1, high);
      }

  }
  public static void main(String[] args) {
    int a[] = {7, 5, 3, 10, 1, 2, 9};
    int high = a.length;
    int low = 0;

    Main obj = new Main();
    obj.quickSort(a, low, high-1);
    
    System.out.println("Quick Sort Output: ");
    for(int k=0; k<a.length; k++)
    {
        System.out.print(a[k]+"\t");
    }
    System.out.println();
  }
}