import java.util.Arrays;

/**
 * Class for all random methods that I want to make.
 * Could relate to any new topics learned and will most likely
 * be tested in the "RandomTester" class
 *
 * @author Ari Camhi
 * @version 1-22-22
 */
public class RandomMethods {

    /**
     * Sorting an array using Arrays.Sort()
     * Just wanted to use it to see how much easier it is
     * than making my own sorting method for arrays
     *
     * @param arr
     */
    public String arraySortCheat(int[] arr) {
        String outputForTester = "";
        String output = "";
        Arrays.sort(arr);
        output += "Modified arr[]: " + Arrays.toString(arr);
        System.out.println(output);
        for (int i = 0; i < arr.length - 1; ++i)
            if (arr[i] > arr[i + 1]) {
                outputForTester = "nah it doesn't work";
            } else {
                outputForTester = "yeah it works";
            }
        return outputForTester;
    }

    /**
     * Factorial, not knowing anything about recursion yet
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /**
     * Fibonacci sequence recursion
     */
    public int fibo(int n) {
        System.out.println("Calling fibo at the value of " + n);
        int output = 0;
        if (n == 0 || n == 1) {
            output = n;
            return output;
        } else {
            output = fibo(n - 1) + fibo(n - 2);
            return output;
        }
    }

    /**
     * Check to see if number is prime so I can solve some trig problem
     * on deltaMath and I don't want to see if rad 97 can be factored
     */
    public boolean isPrime(int n) {
        boolean checkPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                checkPrime = false;
            }
            break;
        }
        return checkPrime;
    }

    /**
     * Plug in a radical number and return the fully simplified version of it
     * Ex: n = 50... return 5 sqrt2
     * <p>
     * Now when I do a math assignment and have to simplify some radical
     * I will use the simplifier I made myself.
     *
     * @param n
     * @return simplifiedRad
     */
    public RadResult simplifyRadical(int n) {
        RadResult simplifiedRad;
        int integerPart = -1;
        int radicalPart = 1;
        for (int i = (int) (n / 2); i > 0; i--) {
            if (i * i == n) {
                //simplifiedRad = "perfect square: " + i;
                integerPart = (int) i;
                break;
            } else if (n % (i * i) == 0) {
                //simplifiedRad = i + " sqrt(" + n/ (i * i) + ")";
                integerPart = i;
                radicalPart = (int) (n / (i * i));
                break;
            }
        }
        return new RadResult(integerPart, radicalPart);
    }

    /**
     * Reverse a String...
     * Using string builder, isntead of += it builds string together
     * with the append command
     * @return reversedS
     */
    public String reverseString(String s) {
        StringBuilder reversedS = new StringBuilder();
        for (int i = s.length(); i > 0; i--) {
            reversedS.append(s.charAt(i - 1));
        }
        return reversedS.toString();
    }


///**
// * Reverse a String using Recursion...
// *
// * @return reversedS
// */
//public String reverseStringRecursion(String s){
//    StringBuilder reversedS = new StringBuilder();
//
//
//    return reversedS.toString();
//}
//
//}

/**
 * Reverse a string again
 * First true code back from break
 * @return reversedString
 */
public String reverseStringAgain(String s){
    String reversedString = "";
    for (int i = s.length(); i > 0; i--){
        reversedString += s.charAt(i - 1);
    }
    return reversedString;
}

    /**
     * factorial with a for loop instead of recursion
     *
     * @param n
     * @return n
     */
    public int factorialForLoop(int n){
    int i = n -1;
    do {
        n = n * i;
        i--;
    }while(i >= 1);
    return n;
    }

    /**
     * print
     * *
     * **
     * ***
     * ****
     *  and so on given the parameter
     * @param n
     */
    public String printStars(int n) {
        String stars = null;
        for (int i = 1; i <= n; i++) {
            stars = "";
            stars += "*";
            System.out.println(stars);
        }
        return stars;
    }
}

