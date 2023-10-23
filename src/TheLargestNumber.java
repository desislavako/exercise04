public class TheLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {11, 44, 68, 27, 99, 53, 34, 77, 86, 9};

        int largest = numbers[0]; // Initialize with the first element of the array

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}
