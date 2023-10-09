package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public String sortAnagramParameter(String anagram){
        char[] anagramArray = anagram.toCharArray();
        Arrays.sort(anagramArray);
        System.out.println("wololo");
        return new String(anagramArray);
    }

    public ArrayList<String> sortAndAlphabetizeAnagrams(ArrayList<String> anagrams){
        ArrayList<String> anagramsSortedAndAlphabetized = new ArrayList<>();
        for(String s : anagrams){
            char[] tempArray = s.toCharArray();
            Arrays.sort(tempArray);
            String tempString = new String(tempArray);
            anagramsSortedAndAlphabetized.add(tempString);
        }
        return anagramsSortedAndAlphabetized;
    }

    public String returnAnagram(ArrayList<String> anagrams, String anagram){
        String tempAnagram = sortAnagramParameter(anagram);
        ArrayList<String> anagramsSortedAndAlphabetized = sortAndAlphabetizeAnagrams(anagrams);

        for(String s : anagramsSortedAndAlphabetized){
            if(s.equals(tempAnagram)){
                return s;
            }
        }
        return null;
    }

    public boolean findAnagram(ArrayList<String> anagrams, String anagram){
        ArrayList<String> anagramsSortedAndAlphabetized = sortAndAlphabetizeAnagrams(anagrams);
        String tempAnagram = sortAnagramParameter(anagram);

        for(String s : anagramsSortedAndAlphabetized){
            if(s.equals(tempAnagram)){
                return true;
            }
        }
        return false;
    }
}
