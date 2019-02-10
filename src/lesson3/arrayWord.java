package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayWord {

    static String[] enterWordMArray = new String[15]; //массив для записи угаданных букв

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        //загадываем слово с помощью рандома
        final Random random = new Random();
        int rundNumber = random.nextInt(25);
        System.out.println("Отгадайте слово    " + words[rundNumber]);
        Scanner scanner = new Scanner(System.in);
        String word = words[rundNumber]; //загаданное слово


        String enterWord;

        do {
            enterWord = scanner.nextLine();

            //заполняем массив символов, для отгаданного слова символами #
            hideWord();


            if (word.equals(enterWord)) {
                System.out.println("Поздравялем, вы отгадали! Слово  " + word);
                break;
            }


            for (int i = 0; i < (word.length() > enterWord.length() ? enterWord.length() : word.length()); i++) {
                if (word.charAt(i) == enterWord.charAt(i)) {
                    enterWordMArray[i] = "" + word.charAt(i) + "";
                }
            }

            System.out.println("Вы не отгадали слово, угаданные буквы ");
            //System.out.print("Отгаданные буквы" + Arrays.toString(enterWordMArray));
            for (int i = 0; i < enterWordMArray.length; i++)
               System.out.print(enterWordMArray[i] + "");

            System.out.println("\nПопробуйте еще раз ");

        }while (true);

    }

    //заполняем массив символов, для отгаданного слова символами #
    private static void hideWord() {
        for (int i = 0; i < enterWordMArray.length; i++) {
            enterWordMArray[i] = "#";
            //  System.out.print(enterWordMArray[i] + "");
        }


    }
}
