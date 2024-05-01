    /* write a java program to find the largest number in an array */     

package Arrays;

public class ForEachLoop {

    public static int maximum(int[] numbers) 
    {  
        int largest = numbers[0]; 
          
        // for each loop 
        for (int i : numbers)  
        { 
            if (i > largest) 
            { 
                largest = i;
            } 
        } 
    return largest; 
    } 

    public static void main(String[] arg) 
    { 
        { 
            int[] age = {35, 25, 55, 45, 37}; 
              
            System.out.println("The highest age is " + maximum(age)); 
        } 
    } 
}