public class SumOfArray {

    public static void main(String[] args) {

        int sum1 = 0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i <= arr.length; i++) {

            sum1 += i;
        }
        System.out.println("The sum of array by the for loop :" + sum1);


        int i = 0;
        int sum = 0;

        while (i <= arr.length) {

            sum += i;
            i++;
        }

        System.out.println("sum of array by while loop: " + sum);

        int sum3=0;

        do {

            sum3 += i;
            i++;
        } while (i <= arr.length);

        System.out.println("sum of array by do while loop: " + sum);


         int sum2=0;

        for (int print : arr) {

            sum2 += print;
        }
        System.out.println("The sum of the array by using the for each loop :"+sum2);
    }
}
