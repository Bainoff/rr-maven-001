package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class Utils {
    public static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    public static String abbr(String text, int length) {
        return text.substring(0, length -3) + "...";
    }

    public static String abbr2(String text, int length) {
        return StringUtils.abbreviate(text, length);
    }
}
