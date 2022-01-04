public class arrays{
  public static void main(String[]args){
   int [] numbers={3,45,43,5,4,6,6,34,32,54,6,56,78,78,886,778,766,76,78,2,3,321,34,345,
                   98,76,1,22,45,566,76,554,67,43,56,87,43,56,87,89,87,85,32,34,54,3,4,56,5,44};
   int i=0;
   System.out.println("Elements of the array");
   while(i<numbers.length){
      switch(numbers[i]%2){
        case 0:
        System.out.print(numbers[i]+" ");
        }
       i++;
      }
      System.out.println();
      System.out.println("Elements divisible by 11");
      int j=0;
   while(j<numbers.length){
      switch(numbers[j]%11){
      case 0:
      System.out.print(numbers[j]+" ");
       }
       j++;
      }
   }
}
