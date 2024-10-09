
// Armstrong Number Program in Java
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // example number
        int originalNumber, remainder, result = 0, n = 0;

        originalNumber = number;

        // find the number of digits
        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        // calculate the sum of the nth power of its digits
        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        // check if the number is Armstrong
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
