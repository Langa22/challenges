public class arrays2{
  public static void main(String[]args){
   int [] numbers=new int[50];
   System.out.println("Even numbers");
   for(int i=0;i<numbers.length;i++){
      numbers[i]=i;
   if(numbers[i]%2==0){   
   System.out.print(numbers[i]+" ");
   }
   }
   System.out.println();
   System.out.println("Numbers divisible by 11");
   for(int i=0;i<numbers.length;i++){
   numbers[i]=i;
   if(numbers[i]%11==0){   
   System.out.print(numbers[i]+" ");
  }
  
}
}
}
