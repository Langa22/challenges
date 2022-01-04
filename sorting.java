import java.util.*;
public class sorting {
   public static void main(String[] args) {
       int []array1={7,3,1,23,43,21,556,76,5,45,65,43,45,665,78,98,0,98,86,
                     76,8,4,5,34,35,23,45,89,7,67,54,67,55,12,32,34,23,45,6,78,65,
                     90,8,7,65,67,87,45,46,78};
       array1[19]+=60;
       array1[20]+=61;
       for(int i=0;i<array1.length;i++){
          System.out.print(array1[i]+" ");
        }
       
       int temp=0;
        for(int i=0;i<array1.length;i++){
           for(int j=i+1;j<array1.length;j++){
              if(array1[i]>array1[j]){
                temp=array1[i];
                array1[i]=array1[j];
                array1[j]=temp;
              }
           }
        }
        System.out.println();
        System.out.println("Sorted array");
        for(int i=0;i<array1.length;i++){
        System.out.print(array1[i]+" ");
        }
        
   }
}

