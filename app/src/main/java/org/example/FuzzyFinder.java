package org.example;
import java.util.ArrayList;

public class FuzzyFinder {
    
    // Linear search
    public int linearSearch(ArrayList<Fuzzy> fuzzies) {

        for (int i = 0; i < fuzzies.size(); i++) {

            if (fuzzies.get(i).color.equals("gold")) {
                return i;
            }
        }

        return -1;
    }

    // Binary search
    public int binarySearch(ArrayList<Fuzzy> fuzzies) {

        int low = 0;
        int high = fuzzies.size() - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            String color = fuzzies.get(mid).color;

            if (color.equals("gold")) {
                return mid;
            }

            if (color.compareTo("gold") < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
