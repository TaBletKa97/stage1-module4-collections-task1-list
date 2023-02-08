package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> result = new ArrayList<>();
        if (sourceList.size() >= 3) {
            for (int i = 3; i <= sourceList.size(); i = i + 3) {
                result.add(sourceList.get(i - 1));
                result.add(sourceList.get(i - 1));
            }
        }
        return result;
    }
}
