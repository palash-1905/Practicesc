public class bytes {
    

    public int getBytes(int num) {
        int temp;
        int ans;
         temp=num/128;
 
        if (num > 0) {
            
            if (temp % 2 == 0) {
                ans = num % 128;
            } else {
                ans = (num % 128) - 128;
            }
        } else{
            
            if (temp % 2 == 0) {
                ans = num % 128;
            } else {
                ans = (num % 128)+ 128;
            }
        } 
        

        return ans;
    }
    public static void main(String[] args) {
        bytes bytes= new bytes(); 
        int num = 505; 
        int result = bytes.getBytes(num); 
        System.out.println("The result is: " + result);
    }
}

