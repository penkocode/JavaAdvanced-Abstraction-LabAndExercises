package softuni.homeworks;

import java.util.*;

public class EncryptSortandPrintArray {
    /*Write a program that:
     ▪ Encrypts an array of strings sum of:
     ▪ Vowels code * current string length
     ▪ Consonants code / current string length
     ▪ Sort the array.
      */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfNames = input.nextInt();
        input.nextLine();
        String[] names = new String[numberOfNames];

        for (int i = 0; i < names.length; i++) {
            String inputNames = input.nextLine();
            names[i] = inputNames;
        }
        int [] encryptArray = encryptNames(names);
        Arrays.sort(encryptArray);
        printResult(encryptArray);
    }

    private static void printResult(int[] a) {
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }
    }

    private static int[] encryptNames(String[] names) {
        List<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U');
        int[] result = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            int sum = 0;
            for (int j = 0; j < names[i].length(); j++) {
                if (vowels.contains(names[i].charAt(j))) {
                    //vowels
                    sum += (names[i].charAt(j) * names[i].length());

                } else {
                    //consonants
                    sum += (names[i].charAt(j) / names[i].length());

                }
            }

            result[i] = sum;
        }
        return result;
    }
}
