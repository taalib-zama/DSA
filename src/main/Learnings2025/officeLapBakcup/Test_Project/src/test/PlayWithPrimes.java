package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayWithPrimes {
    //Check if a list of integers contains a prime number using Java streams.
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    private void printPrime() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = numbers.stream()
                .anyMatch(this::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);
        //find the prime number
        //create a map of this with boolean as yes/no of prime and number as key
        Map<Integer, Boolean> primeMap = numbers.stream()
                .collect(Collectors.toMap(
                        number -> number,
                        this::isPrime
                ));
        //Collectors.toMap: By default, it uses a HashMap to store the key-value pairs.
        System.out.println("Prime map: " + primeMap);

        List<Integer> primeNumbers = primeMap.entrySet().stream()
                .filter(Map.Entry::getValue) // Keep only entries with value true
                .map(Map.Entry::getKey) // Extract the keys (prime numbers)
                .toList(); // Collect to a list
        System.out.println("Prime numbers in the list: " + primeNumbers);


    }

    public static void main(String[] args) {
        PlayWithPrimes test = new PlayWithPrimes();
        test.printPrime();
    }
}
