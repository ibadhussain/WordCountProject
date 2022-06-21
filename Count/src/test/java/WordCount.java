/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ibad
 */
public class WordCount {
    
    @Test
    public void TestFindCount(){
        assertEquals(4,Count_word_character.FindCount(new int[]{1,3,4,3}));
    }
}
