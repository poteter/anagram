import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.example.Anagram;

import java.util.ArrayList;

public class AnagramTest {
    Anagram anagram = new Anagram();
    ArrayList<String> anagrams = new ArrayList<>();
    String korns = "korns";

    void populateAnagrams(){
        anagrams.add("ost");
        anagrams.add("sot");
        anagrams.add("snork");
        anagrams.add("norsk");
    }
    @Test
    void isAnagram(){
        populateAnagrams();
        assertEquals(anagram.findAnagram(anagrams, korns), true);
        assertNotEquals(anagram.findAnagram(anagrams, "wololo"), true);

    }

    @Test
    void findAnagram(){
        populateAnagrams();
        assertEquals(anagram.returnAnagram(anagrams, korns), "knors");
        assertNotEquals(anagram.returnAnagram(anagrams, korns), "krons");
    }
}
