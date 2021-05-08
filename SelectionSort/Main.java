import java.util.Arrays;
class Main {

  public static void swap(int[] a, int i, int j)
  {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
  }
  public static void main(String[] args) 
  {
    int a[] = {77, 33, 44, 11, 88};
    int n = a.length;
    
    for(int i=0; i<n-1;i++)
    {
      int min = i;
      for(int j=i+1;j<n;j++)
      {
        if(a[j]<a[min])
          min = j;
      }

      swap(a, i, min);
    }
    System.out.println("\nSelection Sort Output: ");
    System.out.println(Arrays.toString(a));

  }
}