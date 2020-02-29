import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortLexoGraphically {

    /*
    To compare two strings, String.compareTo() method has been used which compare two strings lexicographically.
    The result is a negative integer if this String object lexicographically precedes the argument string.
    The result is a positive integer if this String object lexicographically follows the argument string.
    The result is zero if the strings are equal.
     */
    public static void main(String[] args) {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);

        //User will be asked to enter the count of strings
        System.out.print("Enter number of strings : ");
        count = scan.nextInt();


        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);

        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for (int i = 0; i < count; i++) {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();

        //Sorting the strings
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order: " + Arrays.toString(str));

        //Same Thing can be done using Streams
        //using Java 8 Stream
        String strArray[] = new String[count];
        strArray = Stream.of(str).sorted().toArray(String[]::new);
        System.out.println("Strings in Sorted Order Using Stream: " + Arrays.toString(strArray));
    }
}

