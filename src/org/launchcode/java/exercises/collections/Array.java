package org.launchcode.java.exercises.collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
//        int[] intArr = {1, 1, 2, 3, 5, 8};
//
//        //looping through an int array
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
//        }
//
//        //printing only odd numbers
//        for (int number : intArr) {
//            if (number % 2 != 0) {
//                System.out.println(number);
//            }
//        }
//
//        //splitting a phrase into individual sentences
//        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
//        String[] splitPhrase = phrase.split("\\.");
//        for(String str : splitPhrase){
//            System.out.println(str);
//        }

        //sum of an ArrayList
        ArrayList<Integer> someIntegers = new ArrayList(Arrays.asList(1, 5, 3, 464, 154, 15, 34, 15, 85, 13, 0, 56, 5));
        ArrayList<String> wordList = new ArrayList(Arrays.asList("mary", "rutabaga", "twenty", "five", "terty"));

        sumEven(someIntegers);
        printWords(wordList);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    //print words with 5 letters
    public static void printWords(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Words with how many letters should be printed?");
        int num = input.nextInt();
        for(String word: arr) {
            if (word.length() == num) {
                System.out.println(word);
            }
        }
        input.close();
    }

}

