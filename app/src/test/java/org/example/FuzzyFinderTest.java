package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class FuzzyFinderTest {
    FuzzyListGenerator generator = new FuzzyListGenerator();
    FuzzyFinder finder = new FuzzyFinder();

    @Test
    public void testLinearSorted() {

        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();

        int index = finder.linearSearch(fuzzies);

        assertTrue(index >= 0);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    public void testBinarySorted() {

        ArrayList<Fuzzy> fuzzies = generator.sortedRainbowFuzzies();

        int index = finder.binarySearch(fuzzies);

        assertTrue(index >= 0);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    public void testLinearRandom() {

        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();

        int index = finder.linearSearch(fuzzies);

        assertTrue(index >= 0);
        assertEquals("gold", fuzzies.get(index).color);
    }

    @Test
    public void testBinaryRandom() {

        ArrayList<Fuzzy> fuzzies = generator.randomizedRainbowFuzzies();

        int index = finder.binarySearch(fuzzies);

        int correctIndex = finder.linearSearch(fuzzies);

        System.out.println("Correct index: " + correctIndex);
        System.out.println("Binary search index: " + index);

        if (index >= 0) {
            assertEquals("gold", fuzzies.get(index).color);
        }
    }
}
