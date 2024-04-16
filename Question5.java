import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /**
         * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
         * Print out the mode (highest occurrence) from the set of integers. 
         *    e.g.
         *     > 5
         *     > 2
         *     > 4
         *     > 1
         *     > 3
         *     > 4
         *     4
         * 
         *    e.g.
         *     > 4
         *     > 2
         *     > 2
         *     > 3
         *     > 3
         *     2
         * Hint: Use a loop to get input. Use another 2 loops to find the mode
         */
        
        Scanner in = new Scanner(System.in);

        // Prompt user for number of integers
        System.out.print("Enter the number of integers: ");
        int count = in.nextInt();

        // Array to store the integers
        int[] numbers = new int[count];

        // Prompt user for each integer and store them
        System.out.println("Enter the integers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = in.nextInt();
        }

        // Find the mode
        int mode = findMode(numbers);

        System.out.println(mode);

        in.close();
    }

    // Function to find the mode
    public static int findMode(int[] numbers) {
        int maxCount = 0;
        int mode = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }

        return mode;
    }
}
