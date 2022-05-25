public class CheckTheArray {

    public static void main(String[] args) {

        int check = 10;

        int arr[] = {35, 63, 34, 53, 46, 2, 2, 1, 10, 36, 547};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == check) {

                check = arr[i];


            }

            System.out.println("The value is present is the array :" + check);
        }

    }
}