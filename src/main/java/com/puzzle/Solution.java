package com.puzzle;

import java.security.InvalidParameterException;
import java.util.HashMap;

public class Solution {

    public static boolean canIWriteTheMessage(String message, String bowlOfSoup) {

        if (null == bowlOfSoup || null == message)
            throw new InvalidParameterException("Bowl of soup and Message must be present.");

        if (bowlOfSoup.isEmpty()) return false;
        if (message.isEmpty()) return true;

        HashMap<Character, Integer> messageCount = createCharMapCount(message);

        int i = 0;
        while (i < bowlOfSoup.length() && messageCount.size() > 0) {

            char character = bowlOfSoup.charAt(i);
            Integer count = messageCount.get(character);

            if (null != count && count > 1) {
                messageCount.replace(character, count-1);
            } else {
                messageCount.remove(character);
            }
            i++;
        }

        return messageCount.size() == 0;

    }

    private static HashMap<Character, Integer> createCharMapCount(String string) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : string.replaceAll("\\s", "").toCharArray()) {
            Integer count = getCharCount(countMap, c);
            countMap.put(c, count + 1);
        }
        return countMap;
    }

    private static Integer getCharCount(HashMap<Character, Integer> countMap, char c) {
        Integer count = countMap.get(c);
        if (null == count) count = 0;
        return count;
    }
}
