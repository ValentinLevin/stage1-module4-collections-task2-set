package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer value: sourceList) {
            set.add(value);

            if (value % 2 == 0) {
                int copy = value;
                do {
                    copy = copy / 2;
                    set.add(copy);
                } while (copy % 2 == 0);
            } else {
                set.add(value * 2);
            }
        }
        return set;
    }
}
