public class HarshadNumber {
    public static void main(String[] args) {
        int number = 21;
        int temp = number;

        int lastDigit = 0;
        int sum = 0;
        while (temp != 0) {
            lastDigit = temp % 10;
            sum += lastDigit;
            temp = temp / 10;
        }

        if (number % sum != 0) {
            System.out.println("no-->" + number + " is not a Harshad Number");
        } else {
            System.out.println("yes-->" + number + " is a Harshad Number");
        }
    }
}
