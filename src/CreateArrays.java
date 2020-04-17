/**
 * This program is to declare, initialize and
 * print the content of Arrays of numbers, strings
 * characters and boolean
 */
import java.util.Arrays;

public class CreateArrays {
    public static void main (String [] args) {

        int intArray [] = {1, 4, 9, 2, 6};
        String stArray [] = {"car", "orange", "bus", "phone", "target", "apple", "red"};
        char charArray [] = {'a', 'k', 'r', 'v', 'd'};
        boolean booArray [] = {true, false};

        System.out.println("Array of Numbers: " + Arrays.toString(intArray));
        System.out.println("Array of Strings: " + Arrays.toString(stArray));
        System.out.println("Array of Character: " + Arrays.toString(charArray));
        System.out.println("Array of Boolean: " + Arrays.toString(booArray));

    }
}