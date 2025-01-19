 class array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        array obj = new array();
        int sum = obj.getSum(numbers);
        System.out.println("Sum of elements: " + sum);
    }

    int getSum(int[] arr) {
        if (arr.length == 0) { 
            return 0;
        } else { 
            int[] smallerArray = new int[arr.length - 1];
            System.arraycopy(arr, 1, smallerArray, 0, arr.length - 1);
            return arr[0] + getSum(smallerArray);
        }
    }
}

