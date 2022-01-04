public class string{
	public static void main(String[]args){
		String line="1,4,3,2,3,7,5,6,9";
		int temp=0;
		String[] res=line.split(",");
		int arr[]=new int[res.length];
		System.out.println("Original array ");
			for(int i=0;i<res.length;i++){
		        arr[i]=Integer.parseInt(res[i]);
		        System.out.print(arr[i]+" ");
		}
			for (int i = 0; i < arr.length; i++) {     	
			     for (int j = i+1; j < arr.length; j++) {     
               		if(arr[i] > arr[j]) {    
                   	         temp = arr[i];    
                   	         arr[i] = arr[j];    
                   	         arr[j] = temp;    
               }     
            }     
        }
        	System.out.println("\n");
        	System.out.println("Elements of array sorted in ascending order: ");    
        	for (int i = 0; i < arr.length; i++) {     
            	System.out.print(arr[i] + " ");    
             }
             
             		for (int i = 0; i < arr.length; i++) {     	
			     for (int j = i+1; j < arr.length; j++) {     
               		if(arr[i] < arr[j]) {    
                   	         temp = arr[i];    
                   	         arr[i] = arr[j];    
                   	         arr[j] = temp;    
               }     
            }     
        }
        	System.out.println("\n");
        	System.out.println("Elements of array sorted in decending order: ");    
        	for (int i = 0; i < arr.length; i++) {     
            	System.out.print(arr[i] + " ");    
             }
         	System.out.println("\n");        
           }    
        }        
   
