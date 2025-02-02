public class Name{

    public static void main(String[] args)
    {
    
    int  size =Integer.parseInt(args[0]);
    if(size<4) size=4;
    else if(size>25) size=25;
    //patterns to display
    for(int row=1;row<=size;row++) {
		System.out.print(printP(size, row));
		System.out.print(" ");
		System.out.print(printA(size, row));
		System.out.print(" ");
		System.out.print(printL(size, row));
		System.out.print(" ");
		System.out.print(printA(size, row));
		System.out.print(" ");
		System.out.print(printS(size, row));
		System.out.print(" ");
		System.out.print(printH(size, row));
		System.out.println(" ");
	    
	    }
	}
     
    // printing P
    static String printP(int size, int row)
    { 
    	String pattern="";
            for(int column=1;column<=size;column++)
            {
                if(column==1||row==1||row==size/2+1||(column==size & row<=size/2))		
                
                //System.out.print("*");
                pattern+="*";
                else
                //System.out.print(" ");
                pattern+=" ";		
            }
         return pattern;
    }
    
    // printing A
    static String printA(int size, int row)
    { 
    	String pattern="";
            for(int column=1;column<=size;column++)
            {
                if(((column==1||column==size) & row!=1)||(row==size/2+1)||(((row==1) & column!=size)&((row==1) & column!=1)))		
                
                //System.out.print("*");
                pattern+="*";
                else
                //System.out.print(" ");
                pattern+=" ";
            }
        return pattern;
    }
    
    //printing L
    static String printL(int size,int row)
    {	  
    String pattern="";
            for(int column=1;column<=size;column++)
            {
                if(column==1||row==size)		
                
                System.out.print("*");
                else
                System.out.print(" ");		
            }
        return pattern;
    }
    
    
    
    //printing S
    static String printS(int size,int row) 
{
	String pattern="";
    
        for (int column = 1; column <= size; column++) 
        {
           if ((row == 1 && column > 1 ) ||  (row == size &&  column < size) ||  (row == size / 2 + 1) || (row < size / 2 + 1 && column == 1 && row != 1) || (row > size / 2 + 1 && column == size && row!=size)) 
                //System.out.print("*");
                pattern+="*";
            else
                //System.out.print(" ");
                pattern+=" ";
        }
    return pattern;
}
    
    // printing H

    static String printH(int size,int row){
    String pattern="";
        for (int column = 0; column <= size; column++) {
            if (column==0 || column==size || row==size/2+1) {
                //System.out.print("*");
                pattern+="*";
            }
            else{
                //System.out.print(" ");
                pattern+=" ";
            }
        }
      return pattern ;
    }
}
