import java.util.Arrays;
class Main {

  public static void merge(int[] a, int low, int mid, int high){
    int m = mid - low + 1;
    int n = high - mid;

    int leftArr[] = new int[m];
    int RightArr[] = new int[n];

    for(int i=0;i<m;i++)
      leftArr[i] = a[i+low];
    
    for(int i=0;i<n;i++)
      RightArr[i] = a[i+mid+1];

    int i=0;
    int j =0;
    int k = low;

    while(i<m && j<n){
      if(leftArr[i] <= RightArr[j])
      {
        a[k++] = leftArr[i];
        i++;
      }
      else
      {
        a[k++] = RightArr[j];
        j++;
      }

    }

    for(;i<m;i++)
        a[k++] = leftArr[i];
      
      for(;j<n;j++)
        a[k++] = RightArr[j];
    
    
  }

  public static void mergeSort(int[] a, int low, int high)
  {
    if(low < high)
    {
      int mid = (high+low)/2;
      mergeSort(a, low, mid);
      mergeSort(a, mid+1, high);
      merge(a, low, mid, high);
    }
  }

  public static void main(String[] args) 
  {
    int a[] = {77, 33, 44, 11, 88};
    
    int n = a.length;
    
    mergeSort(a, 0, n-1);
    System.out.println("\nMerge Sort Output: ");
    System.out.println(Arrays.toString(a));

  }
}