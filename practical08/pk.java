class pk { 
 
 void printline(int size , int ln)
       {
            if(ln<=size){
                printPattern(ln,1);
              System.out.println();
               printline(size,ln+1);
               printPattern(ln,1);
               System.out.println();
          }
             else if(ln==size+1)
              {
                printPattern(ln,1);
                   System.out.println();
                   printline(size,ln+1); // comtinue ress
           }
           
        
       }
     void printPattern(int ln , int pt)
     {
        if(pt<=ln)
          {
            System.out.print("*");
             printPattern(ln , pt+1);
         }
        }
        
         public static void main(String arg[])
         {
            int size = 3;
            pk obj = new pk();
           obj.printline( size, 1 );
            }
          }   
               
