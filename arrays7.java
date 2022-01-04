import java.util.*;
public class arrays7{
   public static void main(String[]args){
   Random obj =new Random();
     int arr[][]=new int[100][30];
     System.out.println("Values before adding 1");
     for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
          arr[i][j]= obj.nextInt(30);
          if(arr[i][j]%2==0){
          System.out.print(arr[i][j]+" ");
            }
           }
          }
          System.out.println();
          System.out.println("Incremented values");
          for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
          arr[i][j]= obj.nextInt(30);
          if(arr[i][j]%11==0){
          System.out.print(arr[i][j]+" ");
          }
          }
       }
     

  }
}

