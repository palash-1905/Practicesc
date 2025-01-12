public class Short {
    

    public int getShort(int num) {
        int temp;
        int ans;
         temp=num/32768;
 
        if (num > 0) {
            
            if (temp % 2 == 0) {
                ans = num % 32768;
            } else {
                ans = (num % 32768) - 32768;
            }
        } else{
            
            if (temp % 2 == 0) {
                ans = num % 32768;
            } else {
                ans = (num % 32768)+ 32768;
            }
        } 
        

        return ans;
    }
    public static void main(String args[]) {
        Short Short= new Short(); 
        int num = 41000; 
        int result = Short.getShort(num); 
        System.out.println("The result is: " + result);
    }
}
