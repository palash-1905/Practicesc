class pattern {
void displaypattern(int size)
{     //++
    for(int line =1; line<=size; line ++)
    {
         for(int space =size-1; space>=line;space--)
         {
          System.out.print(" ");
          }
            for(int pattern =(2*line)-1; pattern >=1; pattern --)
            {  
              System.out.print("+");
              }
                System.out.println();
                }
                
          for(int linee =size-1; linee >=1; linee --)
          { 
              for(int spacee = size-1; spacee>=linee ; spacee--)
                {
                      System.out.print(" ");
                }
              for(int patternn = (2*linee)-1;patternn>=1; patternn--)
               {
                      System.out.print("+");
                      
               }    
                   System.out.println();
            }
        }
        
        //pyramid pattern
  void displaypyramid(int size)
{    
    for(int line =1; line<=size; line ++)
    {
         for(int space =size-1; space>=line;space--)
         {
          System.out.print(" ");
          }
            for(int pattern =(2*line)-1; pattern >=1; pattern --)
            {  
        if( line % 2 ==1)
            {
               if(pattern % 2==1) // even
               {
              System.out.print("*");
              }  else { //odd
                      System.out.print("+");
                   }
        }else{ 
              if( pattern % 2==1)
                  { 
               System.out.print("+");
              }  else { //odd
                       System.out.print("*");
                     }
              }
           }  System.out.println();
          } 
          
          // Reverse Print
          for (int line = size;line>=1; line --){
              for (int space = size- line; space>0;space--){
                    System.out.print(" ");
                    }
                for(int pattern = (2*line)-1;pattern>=1; pattern--){
                   if( line % 2 ==1)
            {
               if(pattern % 2==1) // even
               {
              System.out.print("+");
              }  else { //odd
                      System.out.print("*");
                   }
        }else{ 
              if( pattern % 2==1)
                  { 
               System.out.print("*");
              }  else { //odd
                       System.out.print("+");
                     }
              }
           }  System.out.println();
     }    
    }
    
    
    //SpscePattern
     void displayspace(int size)
{    
    for(int line =1; line<=size; line ++)
    {
         for(int space =size-1; space>=line;space--)
         {
          System.out.print(" ");
          }
            for(int pattern =(2*line)-1; pattern >=1; pattern --)
            {  
        if( line % 2 ==1)
            {
               if(pattern % 2==1) // even
               {
              System.out.print(" ");
              }  else { //odd
                      System.out.print("+");
                   }
        }else{ 
              if( pattern % 2==1)
                  { 
               System.out.print(" ");
              }  else { //odd
                       System.out.print("+");
                     }
              }
           }  System.out.println();
          } 
          
          // Reverse Print
          for (int line = size;line>=1; line --){
              for (int space = size- line; space>0;space--){
                    System.out.print(" ");
                    }
                for(int pattern = (2*line)-1;pattern>=1; pattern--){
                   if( line % 2 ==1)
            {
               if(pattern % 2==1) // even
               {
              System.out.print("+");
              }  else { //odd
                      System.out.print(" ");
                   }
        }else{ 
              if( pattern % 2==1)
                  { 
               System.out.print("+");
              }  else { //odd
                       System.out.print(" ");
                     }
              }
           }  System.out.println();
       }
  }
    
    
         public static void main(String arg[]) {
         pattern a = new pattern();
         a.displayspace(3);
         a.displaypattern(3);
         a.displaypyramid(3);
       }
    }
