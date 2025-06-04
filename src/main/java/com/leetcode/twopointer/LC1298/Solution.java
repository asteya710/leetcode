package com.leetcode.twopointer.LC1298;

public class Solution {
    public String answerString(String word, int numFriends) {
        if(numFriends == 1) return word;

        int n = word.length();
        int size = n-numFriends+1, i=0;
        String ans = "";

        while(i+size<=n){
            if(ans.compareTo(word.substring(i, i+size)) < 0)
                ans = word.substring(i, i+size);
            i++;
        }

        while(i<n){
            if(ans.compareTo(word.substring(i, n)) < 0)
                ans = word.substring(i, n);

            i++;
        }
        return ans;
    }
}
