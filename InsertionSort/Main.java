import java.util.Arrays;
class Main {

  public static void main(String[] args) {
    int a[] = {77, 33, 44, 11, 88};
    int n = a.length;
    int temp;

    for(int i=1; i<n;i++)
    {
      int index = i;
      for(int j=i-1; j>=0;j--)
      {
        if(a[index]<a[j])
        {
            temp = a[index];
            a[index] = a[j];
            a[j] = temp;
            index = j;
        }
      }
    }
    System.out.println("\nInsertion Sort Output: ");
    System.out.println(Arrays.toString(a));
  }
}


