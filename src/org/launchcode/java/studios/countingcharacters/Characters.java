package org.launchcode.java.studios.countingcharacters;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


//TODO: create a HashMap to have keys = to characters and values = character counts, loop through string to count each character
public class Characters {
    public static void main(String[] args) {
        //pulling from a file
//        try {
//            File file = new File("../src/studios/countingcharacters.Test");
//            Scanner src = new Scanner(file);
//            while (string.hasNextLine()) {
//                src.useDelimiter("\\Z");
//                String string = src.nextLine();
//                System.out.println(string);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex);
//            System.out.print("Damn.");
//        }
//
//
//        System.out.println(countCharacters(string));

        //User Input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word or phrase: ");
        String quote = input.nextLine();


        System.out.println(countCharacters(quote));
        input.close();

    }

    public static HashMap<Character, Integer> countCharacters(String str){
        String lowerCaseStr = str.toLowerCase();
        char[] characters = lowerCaseStr.toCharArray();
        HashMap<Character, Integer> characterCounts = new HashMap<>();
        for(char character : characters) {
            if(!Character.isLetter(character)){
                continue;
            }
            if (!characterCounts.containsKey(character)) {
                characterCounts.put(character, 0);
                characterCounts.put(character, characterCounts.get(character) + 1);

            }
        }

//        for(char character : characters) {
//            if(characterCounts.containsKey(character)) {
//                characterCounts.put(character, characterCounts.get(character) + 1);
//            }
//        }

        return characterCounts;
    }

}

