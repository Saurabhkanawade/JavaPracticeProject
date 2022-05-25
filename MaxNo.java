public class MaxNo {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int arr[] = {-43,1, 24, 546, 57, 3, 7, 345, 745, 7, 35, 7};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max element in the array is :" + max);

        // find the min value from the array

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]<min){

                min=arr[i];
            }
        }
        System.out.println("The minimum value from the array is :"+min);
    }
}
