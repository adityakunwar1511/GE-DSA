
import java.util.*;

public class PrimeAnagrams {
	public class PrimeNumbersInRange {
	    public static void main(String[] args) {
	        int[][] primeNumbers = getPrimeNumbers();
	        for (int i = 0; i < primeNumbers.length; i++) {
	            System.out.println("Range " + (i * 100) + "-" + ((i + 1) * 100 - 1) + ":");
	            for (int prime : primeNumbers[i]) {
	                System.out.print(prime + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int[][] getPrimeNumbers() {
	        ArrayList<ArrayList<Integer>> primes = new ArrayList<>();
	        for (int i = 0; i < 10; i++) primes.add(new ArrayList<>());

	        for (int num = 2; num < 1000; num++) {
	            if (isPrime(num)) {
	                primes.get(num / 100).add(num);
	            }
	        }

	        int[][] primeArray = new int[10][];
	        for (int i = 0; i < primes.size(); i++) {
	            primeArray[i] = primes.get(i).stream().mapToInt(Integer::intValue).toArray();
	        }
	        return primeArray;
	    }

	    public static boolean isPrime(int num) {
	        if (num < 2) return false;
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
	}
    public static void main(String[] args) {
        int[][] primes = PrimeNumbersInRange.getPrimeNumbers();
        ArrayList<Integer> anagrams = new ArrayList<>();
        ArrayList<Integer> nonAnagrams = new ArrayList<>();

        for (int[] range : primes) {
            for (int prime : range) {
                if (isAnagram(prime, range)) {
                    anagrams.add(prime);
                } else {
                    nonAnagrams.add(prime);
                }
            }
        }

        System.out.println("Anagrams: " + anagrams);
        System.out.println("Non-Anagrams: " + nonAnagrams);
    }

    public static boolean isAnagram(int num, int[] range) {
        String str1 = String.valueOf(num);
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        for (int other : range) {
            if (num != other) {
                String str2 = String.valueOf(other);
                char[] arr2 = str2.toCharArray();
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Function to find all prime numbers that are anagrams
    public static ArrayList<Integer> getAnagrams() {
        int[][] primes = PrimeNumbersInRange.getPrimeNumbers();
        ArrayList<Integer> anagrams = new ArrayList<>();

        for (int[] range : primes) {
            for (int prime : range) {
                if (isAnagram(prime, range) && !anagrams.contains(prime)) {
                    anagrams.add(prime);
                }
            }
        }

        return anagrams;
    }
}