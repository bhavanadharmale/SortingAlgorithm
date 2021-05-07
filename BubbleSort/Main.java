class Main {

  public static void main(String[] args) {
    int a[] = {30, 20, 40, 10};
    int n = a.length;
    int temp;

    
      for(int j=0;j<n-1;j++){
        int elem = a[j];
        for(int k=j+1; k<n;k++){
          if(elem > a[k]){
            temp = a[j];
            a[j] = a[k];
            a[k] = temp;
          }
          else{
            elem = a[k]; 
          } 
        }
      
    }

    for(int i=0;i<n;i++){
      System.out.println(a[i]);
    }
  }
}



