public class Main {
    String[] array;

    public Main() {
        array = new String[]{ "apple", "banana", "orange", "grape" };

        System.out.println("Original array:");
        printArray();

        reverse();

        System.out.println("\nReversed array:");
        printArray();
    }

    void reverse() {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            // Swap elements at left and right indices
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            // Move towards the center of the array
            left++;
            right--;
        }
    }

    void printArray() {
        for (String element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new Main();
    }
}
