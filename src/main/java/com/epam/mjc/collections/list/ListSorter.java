package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int elementA = Integer.parseInt(a);
        int elementB = Integer.parseInt(b);
        int powA = 5 * elementA * elementA + 3;
        int powB = 5 * elementB * elementB + 3;
        if (powA == powB) {
            return elementA - elementB;
        }
        return powA - powB;
    }
}
