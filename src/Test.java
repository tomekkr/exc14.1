import java.util.Arrays;

class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 22, 3, 2, 1};
        checkIsPalindromeAndPrint(numbers);
    }

    private static void checkIsPalindromeAndPrint(int[] numbers) {
        String arrayString = Arrays.toString(numbers);
        if (isPalindrome(numbers))
            System.out.println(arrayString + " – jest palindromem");
        else
            System.out.println(arrayString + " – nie jest palindromem");
    }

    private static boolean isPalindrome(int[] numbers) {
        int[] reversed = reverseArray(numbers);
        return Arrays.equals(numbers, reversed);
    }

    private static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
