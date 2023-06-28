package strings;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateWordsStringsTest extends DuplicateWordsStrings {

    @Test
    public void addEmptyString() {
        Set<String> resultOutput = DuplicateWordsStrings.duplicateWordsSentence("");
        assertEquals(Collections.emptySet(), resultOutput);
    }

    @Test
    public void addNullValue() {
        Set<String> resultOutput = DuplicateWordsStrings.duplicateWordsSentence(null);
        assertEquals(Collections.emptySet(), resultOutput);
    }

    @Test
    public void addDuplicateString() {
        Set<String> resultOutput = DuplicateWordsStrings.duplicateWordsSentence("one one two two four");
        assertTrue(resultOutput.contains("one"));
        assertTrue(resultOutput.contains("two"));
        assertTrue(resultOutput.size() == 2);
    }

    @Test
    public void addNoDuplicates() {
        Set<String> resultOutput = DuplicateWordsStrings.duplicateWordsSentence("one two four");
        assertEquals(Collections.emptySet(), resultOutput);
    }

    @Test
    public void addWhiteSpacesBetweenWords() {
        Set<String> resultOutput = DuplicateWordsStrings.duplicateWordsSentence("one  two  four  ");
        assertEquals(Collections.emptySet(), resultOutput);
    }

}