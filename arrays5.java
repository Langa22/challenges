public class arrays5{
   public static void main(String[]args){
     int arr[][]=new int[100][30];
     System.out.println("Even numbers");
     int i=0;
     while(i<arr.length){
         int j=0;
          while(j<arr[i].length){
          arr[i][j]=j;
          arr[i][j]++;
          switch(arr[i][j]%2){
          case 1:
          System.out.print(arr[i][j]+" ");
         }
         j++;
      }
       i++;
   }
   System.out.println();
   System.out.println("Numbers divisible by 8");
   int a=0;
    while(a<arr.length){
         int j=0;
          while(j<arr[a].length){
          arr[a][j]=j;
          arr[a][j]++;
          switch(arr[a][j]%8){
          case 0:
          System.out.print(arr[a][j]+" ");
          }
          j++;
      }
      a++;
   }
  }
}
