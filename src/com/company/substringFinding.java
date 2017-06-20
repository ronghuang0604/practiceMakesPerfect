package com.company;

/**
 * Created by rong on 6/20/17.
 */
public class substringFinding {
    public int strstr(String large, String small) {
        if(large == null || small == null || large.length() < small.length()) {
            return -1;
        } else if (small.equals("")) {
            return 0;
        }

        for (int i = 0; i <= large.length() - small.length(); i++) {
            if (equals(large, small, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean equals(String large, String small, int startIndex) {
        for (int j = 0; j < small.length(); j++) {
            if (small.charAt(j) != large.charAt(startIndex + j)) {
                return false;
            }
        }
        return true;
    }
}
