// Trinh To, CS141, Fall 2019, Section A
// Programming Assignment #5, 10/14/19

// This program's behavior is to call printDesign that produces 
// the a pyramyd output using nested for loops to print out the structure.

public class HW5
{//open class

   public static void main(String[] args)
   {//open main
      printDesign(20);
   }//end main
   
   public static void printDesign(int height)
   { //open method
   
      int edge=height; //assign edge's value
      
      for (int line = 1; line <= height ; line++) 
      // loops to print line by line
      {  
         for (int j = 1; j <= (-1 * line + edge ); j++) 
         {        
            System.out.print("-");
         }
         //loops for the left "-"
            
         if (line<10)
            { 
               System.out.print(line);
            }
         if (line>=10&&line<20)
            {
               System.out.print(line%10);
               //to eliminates to 1         
            }  
         // if clause to print the 1st number
                   
         for (int j = 1; j <= 2*(line - 1); j++)
         {       
            //if clause to print the middle part - the numbers
            if (line<10)
            { 
               System.out.print(line);
            }
            if (line>=10&&line<20)
            {
               System.out.print(line%10);
               // if clause to print the 1st number
            }           
         }
                  
         for (int j = 1; j <= (-1 * line + edge ); j++) 
         {        
            System.out.print("-");
         }
         //loops for the right "-"
         
         System.out.println();
         //get to the next line 
      }
 
     
   }//end method 
    
}//end class