package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rong on 6/15/17.
 */
public class AllSubsets_I {
    public List<String> subSets(String set) {
        List<String> result = new ArrayList<>();
        if (set == null || set.length() == 0) {
            return result;
        }

        // Now, I want my recursion tree get going, I'll need to set it up
        // firstly, I need to change the string to a list of characters
        // secondly, I start with an empty string as my root, so I'll need a string builder for "add / don't add"
        // thirdly, I need an variable index to indicate which position I'm considering add / don't add to the result


        char[] arraySet = set.toCharArray();
        StringBuilder strBuilder = new StringBuilder(); // start with an empty string
        subSets(arraySet, strBuilder, 0, result); // start from index 0
        return result;
    }



    private void subSets(char[] arraySet, StringBuilder strBuilder, int index, List<String> result) {

        // this is a recursion function, we need a base case
        if (index == arraySet.length) {
            result.add(strBuilder.toString());
            return;
        }


        // add
        subSets(arraySet, strBuilder.append(arraySet[index]), index + 1, result);
        strBuilder.deleteCharAt(strBuilder.length() - 1);

        // don't add
        subSets(arraySet, strBuilder, index + 1, result);
    }
}
