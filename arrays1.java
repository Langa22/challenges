public class arrays1{
  public static void main(String[]args){
   int [] numbers=new int[50];
   for(int i=0;i<numbers.length;i++){
       numbers[i]=i;   
   System.out.print(numbers[i]+" ");
   }
   System.out.println();
   for(int i=0;i<numbers.length;i++){
   numbers[i]++;   
   System.out.print(numbers[i]+" ");
  }
}
}
