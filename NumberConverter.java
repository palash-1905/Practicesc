public class NumberConverter {
 public static void main(String args[]) {
    NumberConverter obj = new NumberConverter();
    System.out.println(obj.getNumber(32767,"shORt"));
   System.out.println(obj.getNumber(128,"Byte")); }
    
    int getNumber(int num , String type){
        int result;
        type = type.toLowerCase();
       if (type.equals("byte")) {
            result= getBytes(num); 
        } else if (type.equals("short")) {
            result= getShort(num); 
        } else {
            return 1;
        }
        return result;
    }
    
 
    // Method to process numbers as bytes
    int getBytes(int num) {
        int temp = num / 128;
        int ans;

        if (num > 0) {
            if (temp % 2 == 0) {
                ans = num % 128;
            } else {
                ans = (num % 128) - 128;
            }
        } else {
            if (temp % 2 == 0) {
                ans = num % 128;
            } else {
                ans = (num % 128) + 128;
            }
        }
        return ans;
    }

    // Method to process numbers as shorts
    int getShort(int num) {
        int temp = num / 32767;
        int ans;

        if (num > 0) {
            if (temp % 2 == 0){
                ans = num % 32767;
            }else{
                ans = (num % 32767) - 32767;
            }
        }else{
            if (temp % 2 == 0) {
                ans = num % 32767;
            } else {
                ans = (num % 32767) + 32767;
            }
        }
        return ans;
    }

    
               // NumberConverter converter = new NumberConverter();
       // int numBytes = -1505;
        //int resultBytes = converter.getBytes(numBytes);
        //System.out.println("The result for bytes is: " + resultBytes);

        
        //nt numShort = 41000;
        //int resultShort = converter.getShort(numShort);
    //    System.out.println("The result for short is: " + resultShort);
    //}
}

