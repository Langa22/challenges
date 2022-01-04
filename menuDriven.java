import java.util.*;
public class menuDriven{
  public static void main(String[]args){
   Scanner in =new Scanner(System.in);
   double num1=0.0,num2=0.0;
   String operation;
   double output=0;
   
   try{
     System.out.print("Enter first number : ");
     num1=in.nextDouble();
     System.out.print("Enter mathematical operation(*,/,+,-,%) : ");
     operation=in.next();
     System.out.print("Enter second number : ");
     num2=in.nextDouble();
     switch(operation){
       case "*" :
           output=num1*num2;
           String check = Double.toString(output);
           String checkNum1=Double.toString(num1);
           String checkNum2=Double.toString(num2);
            if(check.contains(".0")){
             System.out.println((int)num1+"*"+(int)num2+" = "+(int)output);
            }else if(checkNum1.contains(".0")&&checkNum2.contains(".0")){
             System.out.println((int)num1+"/"+(int)num2+" = "+output);
            }else{
             System.out.println(num1+"*"+num2+" = "+output);
             }
           break;
       case "/" :
           output=num1/num2;
           String check1Num1=Double.toString(num1);
           String check1Num2=Double.toString(num2);
           String check1 = Double.toString(output);
            if(check1.contains(".0")){
             System.out.println((int)num1+"/"+(int)num2+" = "+(int)output);
            }else if(check1Num1.contains(".0")&&check1Num2.contains(".0")){
             System.out.println((int)num1+"/"+(int)num2+" = "+output);
            }else{
             System.out.println(num1+"/"+num2+" = "+output);
            }
           break;
       case "+" :
           output=num1+num2;
           String check2Num1=Double.toString(num1);
           String check2Num2=Double.toString(num2);
           String check2 = Double.toString(output);
            if(check2.contains(".0")){
             System.out.println((int)num1+"+"+(int)num2+" = "+(int)output);
             }else if(check2Num1.contains(".0")&&check2Num2.contains(".0")){
             System.out.println((int)num1+"/"+(int)num2+" = "+output);
            }else{
             System.out.println(num1+"+"+num2+" = "+output);
             }
           break;
       case "-" :
           output=num1-num2;
           String check3Num1=Double.toString(num1);
           String check3Num2=Double.toString(num2);
           String check3 = Double.toString(output);
            if(check3.contains(".0")){
             System.out.println((int)num1+"-"+(int)num2+" = "+(int)output);
             }else if(check3Num1.contains(".0")&&check3Num2.contains(".0")){
             System.out.println((int)num1+"/"+(int)num2+" = "+output);
            }else{
             System.out.println(num1+"-"+num2+" = "+output);
             }
           break;
        case "%" :
           output=num1%num2;
           String check4Num1=Double.toString(num1);
           String check4Num2=Double.toString(num2);
           String check4 = Double.toString(output);
            if(check4.contains(".0")){
             System.out.println((int)num1+"%"+(int)num2+" = "+(int)output);
             }else if(check4Num1.contains(".0")&&check4Num2.contains(".0")){
             System.out.println((int)num1+"/"+(int)num2+" = "+output);
            }else{
             System.out.println(num1+"-"+num2+" = "+output);
             }
           break;
       default :
           System.out.println("Please enter a valid operation ");
           break;
     }
     }catch(Exception e){
      System.out.println("Invalid input!! Please try again.");
     }
  }
}
