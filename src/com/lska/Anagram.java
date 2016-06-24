package com.lska;

import java.util.Arrays;

/**
 * Created by 310124463 on 6/24/2016.
 */
public class Anagram {

    public static void main (String [] args)
    {
        String first = "Hello World";

        String second = "World Hello";

        System.out.println(isAnagram(first,second));
    }

    private static boolean isAnagram(String first, String second) {

        char firstWord []  = first.toLowerCase().replaceFirst(" ","").toCharArray();

        char secondWord []  = first.toLowerCase().replaceFirst(" ","").toCharArray();

        Arrays.sort(firstWord);

        Arrays.sort(secondWord);

        return Arrays.equals(firstWord,secondWord);
    }
}
