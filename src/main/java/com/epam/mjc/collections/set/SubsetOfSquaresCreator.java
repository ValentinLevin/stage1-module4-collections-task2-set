package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        for (Integer value: sourceList) {
            int square = value * value;
            if (square >= lowerBound && square <= upperBound) {
                set.add(square);
            }
        }
        return set;
    }
}
