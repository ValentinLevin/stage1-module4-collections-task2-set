package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();

        Set<String> firstAndSecondSets = new HashSet<>(firstSet);
        firstAndSecondSets.addAll(secondSet);
        for (String value: firstAndSecondSets) {
            if (firstSet.contains(value) && secondSet.contains(value) && !thirdSet.contains(value)) {
                result.add(value);
            }
        }

        for (String value: thirdSet) {
            if (!firstAndSecondSets.contains(value)) {
                result.add(value);
            }
        }

        return result;
    }
}
